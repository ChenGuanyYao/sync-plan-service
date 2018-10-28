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

import java.util.ArrayList;
import java.util.List;

/**
 * 初始化冻结数据
 *
 * @author dashan
 * @date 2018/10/11 下午6:52
 */

/**
 * 任务Handler示例（Bean模式）
 * <p>
 * 开发步骤：
 * 1、继承"IJobHandler"：“com.xxl.job.core.handler.IJobHandler”；
 * 2、注册到Spring容器：添加“@Component”注解，被Spring容器扫描为Bean实例；
 * 3、注册到执行器工厂：添加“@JobHandler(value="自定义jobhandler名称")”注解，注解value值对应的是调度中心新建任务的JobHandler属性的值。
 * 4、执行日志：需要通过 "XxlJobLogger.log" 打印执行日志；
 *
 * @author xuxueli 2015-12-19 19:43:36
 */
@JobHandler(value = "initPreDataTask")
@Component
public class InitPreDataTask extends IJobHandler {


    private Logger logger = LoggerFactory.getLogger(InitPreDataTask.class);

    @Reference(group="RecordsDataChangeService", version="1.0")
    private RecordsDataChangeService recordsDataChangeService;

    @Reference
    private MutualPlanRecordsService mutualPlanRecordsService;

    private long id = 0;

    private int number= 500;

    @Override
    public ReturnT<String> execute(String jobParam) throws Exception {

        System.out.println(jobParam);

        if ( StringUtils.isBlank(jobParam) ||  !jobParam.startsWith("start=yes") ) {
            XxlJobLogger.log("请输入start=yes，以免重复执行");
            return FAIL;
        }
//        if(jobParam.contains("id") || jobParam.contains("number")){
//            XxlJobLogger.log("请输入执行参数!");
//            return FAIL;
//        }
//        String[] param = jobParam.split(",");
//        if(param == null || param.length <2){
//            return FAIL;
//        }
//        id = Long.parseLong(param[1]);
//        number = Integer.parseInt(param[2]);
//          Thread.sleep(30000);x

        List<SourceMutualPlanRecords> list = null;
        try {
            while (true){
                list = recordsDataChangeService.getRecordsListById(id,number);

                if(list == null || list.size() < 1)
                    break;
                logger.debug("当前id ---》"+id +" 增量 ----》 "+list.size());
                System.out.println("当前id ---》"+id +" 增量 ----》 "+list.size());
                List<MutualPlanRecords> insertList = new ArrayList<MutualPlanRecords>();
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

                    insertList.add(mutualPlanRecords);
                }
                mutualPlanRecordsService.insertBath(insertList);
            }

        } catch ( Exception ex ) {
            XxlJobLogger.log(ex.getMessage());
            if(list != null && list.size()>0){
                for(SourceMutualPlanRecords sourceMutualPlanRecords : list){
                    XxlJobLogger.log("失败数据 ： "+sourceMutualPlanRecords.toString());
                }
            }
            ex.printStackTrace();
            return SUCCESS;
        }

        return SUCCESS;
    }


}
