package com.qshz.sync.data.api.tasks;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qshz.sync.data.api.common.Entity;
import com.qshz.sync.data.api.common.Source;
import com.qshz.sync.data.face.entity.MutualPlanRecords;
import com.qshz.sync.data.face.entity.SourceMutualPlanRecords;
import com.qshz.sync.data.face.service.MutualPlanRecordsService;
import com.qshz.sync.data.face.service.RecordsDataChangeService;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import com.xxl.job.core.log.XxlJobLogger;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@JobHandler(value = "UpdateDataTask")
@Component
public class UpdateDataTask extends IJobHandler {
    private Logger logger = LoggerFactory.getLogger(UpdateDataTask.class);

    @Reference(group="RecordsDataChangeService", version="1.0")
    private RecordsDataChangeService recordsDataChangeService;

    @Reference
    private MutualPlanRecordsService mutualPlanRecordsService;

    private long id = 0;

    private int number= 500;

    private Date date = null;
    @Override
    public ReturnT<String> execute(String jobParam) throws Exception {

        if ( StringUtils.isBlank(jobParam) ||  !jobParam.startsWith("start=yes") ) {
            XxlJobLogger.log("请输入start=yes，以免重复执行");
            return FAIL;
        }

        if(!jobParam.contains("updatedAt") && date == null){
            XxlJobLogger.log("请输入更新时间");
            return FAIL;
        }
        String[] params = jobParam.split(",");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = params[1].split("=")[1];
        date = simpleDateFormat.parse(dateString);


        while (true){
            List<SourceMutualPlanRecords> list =  recordsDataChangeService.getRecordsListByUpdate(id,date,number);

            if(list == null || list.size() < 1)
                break;

            List<MutualPlanRecords> updateList = new ArrayList<MutualPlanRecords>();
            for(SourceMutualPlanRecords sourceMutualPlanRecords : list){

                MutualPlanRecords mutualPlanRecords = new MutualPlanRecords();
                mutualPlanRecords.setId(sourceMutualPlanRecords.getId());
                mutualPlanRecords.setUserId(sourceMutualPlanRecords.getUserId());
                //  将旧数据的entityAttrId赋值给新建的memberId
                mutualPlanRecords.setMemberId(sourceMutualPlanRecords.getEntityAttrId());
                mutualPlanRecords.setTradeNo(sourceMutualPlanRecords.getTradeNo());

                //把字符改为数字枚举值  0 ： 默认值 1 ： mutual_plan 2 ： mutual_plan_service
                mutualPlanRecords.setEntity(Entity.getVaule(sourceMutualPlanRecords.getEntity()));
                mutualPlanRecords.setEntityId(sourceMutualPlanRecords.getEntityId());
                //把字符改为数字枚举值
                mutualPlanRecords.setSource(Source.getVaule(sourceMutualPlanRecords.getSource()));

                mutualPlanRecords.setSourceId(sourceMutualPlanRecords.getSourceId());
                mutualPlanRecords.setType(sourceMutualPlanRecords.getType());
                mutualPlanRecords.setBillMoney(sourceMutualPlanRecords.getBillMoney());
                mutualPlanRecords.setFundingBefore(sourceMutualPlanRecords.getFundingBefore());
                mutualPlanRecords.setFundingCurrent(sourceMutualPlanRecords.getFundingCurrent());
                mutualPlanRecords.setIsIncome(sourceMutualPlanRecords.getIsIncome());
                mutualPlanRecords.setName(sourceMutualPlanRecords.getName());
                mutualPlanRecords.setCreatedAt(sourceMutualPlanRecords.getCreatedAt());
                mutualPlanRecords.setUpdatedAt(sourceMutualPlanRecords.getUpdatedAt());

                if(sourceMutualPlanRecords.getId() > id){
                    id = sourceMutualPlanRecords.getId();
                }
                updateList.add(mutualPlanRecords);
            }
            try{
               boolean flag =  mutualPlanRecordsService.updateBatch(updateList);
                System.out.println("更新条数  ："+list.size() + " flag -->"+flag);

            }catch (Exception e){
                e.printStackTrace();
                if(updateList != null && updateList.size() > 0){
                    for(MutualPlanRecords mutualPlanRecords : updateList){
                        XxlJobLogger.log("更新失败数据：  "+mutualPlanRecords.toString());
                    }
                }
            }
        }
//        date = new Date();
        return null;
    }
}
