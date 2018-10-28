package com.qshz.sync.data.api.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qsc.common.utils.MsgBean;
import com.qshz.sync.data.face.service.MutualPlanRecordsService;
import com.qshz.sync.data.face.service.RecordsDataChangeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping("/mutualPlanMembers")
@Api(tags = "互助计划成员")
public class DataChangeController {

    @Reference(group="RecordsDataChangeService", version="1.0")
    private RecordsDataChangeService recordsDataChangeService;

    @Reference
    private MutualPlanRecordsService mutualPlanRecordsService;

    @GetMapping("/test")
    @ApiOperation("测试")
    @ResponseBody
    @ApiResponses(value = {@ApiResponse(code = 200 ,message = "test")})
    public MsgBean test(){
        MsgBean msgBean=new MsgBean();
//        long id = 0;
//        int total = 500;
//
//        while (true){
//            List<SourceMutualPlanRecords> list = recordsDataChangeService.getRecordsListById(id,total);
//
//
//            if(list == null || list.size() < 1)
//                break;
//            System.out.println("当前id ---》"+id +" 增量 ----》 "+list.size());
//            List<MutualPlanRecords> insertList = new ArrayList<MutualPlanRecords>();
//            for(SourceMutualPlanRecords sourceMutualPlanRecords : list){
//
//                MutualPlanRecords mutualPlanRecords = new MutualPlanRecords();
//                mutualPlanRecords.setId(sourceMutualPlanRecords.getId());
//                mutualPlanRecords.setUserId(sourceMutualPlanRecords.getUserId());
//                //  将旧数据的entityAttrId赋值给新建的memberId
//                mutualPlanRecords.setMemberId(sourceMutualPlanRecords.getEntityAttrId());
//                mutualPlanRecords.setTradeNo(sourceMutualPlanRecords.getTradeNo());
//
//                //把字符改为数字枚举值  0 ： 默认值 1 ： mutual_plan 2 ： mutual_plan_service
//                mutualPlanRecords.setEntity(Entity.getVaule(sourceMutualPlanRecords.getEntity()));
//                mutualPlanRecords.setEntityId(sourceMutualPlanRecords.getEntityId());
//                //把字符改为数字枚举值
//                mutualPlanRecords.setSource(Source.getVaule(sourceMutualPlanRecords.getSource()));
//
//                mutualPlanRecords.setSourceId(sourceMutualPlanRecords.getSourceId());
//                mutualPlanRecords.setType(sourceMutualPlanRecords.getType());
//                mutualPlanRecords.setBillMoney(sourceMutualPlanRecords.getBillMoney());
//                mutualPlanRecords.setFundingBefore(sourceMutualPlanRecords.getFundingBefore());
//                mutualPlanRecords.setFundingCurrent(sourceMutualPlanRecords.getFundingCurrent());
//                mutualPlanRecords.setIsIncome(sourceMutualPlanRecords.getIsIncome());
//                mutualPlanRecords.setName(sourceMutualPlanRecords.getName());
//                mutualPlanRecords.setCreatedAt(sourceMutualPlanRecords.getCreatedAt());
//                mutualPlanRecords.setUpdatedAt(sourceMutualPlanRecords.getUpdatedAt());
//
//                if(sourceMutualPlanRecords.getId() > id){
//                    id = sourceMutualPlanRecords.getId();
//                }
//
//                insertList.add(mutualPlanRecords);
//            }
//            System.out.println(" id -------------  "+id);
//            mutualPlanRecordsService.insertBath(insertList);
//        }


        return msgBean.put("data","11");
    }

    @GetMapping("/updateData")
    @ApiOperation("更新数据")
    @ResponseBody
    @ApiResponses(value = {@ApiResponse(code = 200 ,message = "test")})
    public MsgBean initData() throws ParseException {
        MsgBean msgBean = new MsgBean();

        long id = 0;
        int total = 500;
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//            Date date = simpleDateFormat.parse("2018-10-25 00:00:00");
//        while (true){
//           List<SourceMutualPlanRecords> list =  recordsDataChangeService.getRecordsListByUpdate(id,date,total);
//
//            if(list == null || list.size() < 1)
//                break;
//            for(SourceMutualPlanRecords sourceMutualPlanRecords : list){
//
//                MutualPlanRecords mutualPlanRecords = new MutualPlanRecords();
//                mutualPlanRecords.setId(sourceMutualPlanRecords.getId());
//                mutualPlanRecords.setUserId(sourceMutualPlanRecords.getUserId());
//                //  将旧数据的entityAttrId赋值给新建的memberId
//                mutualPlanRecords.setMemberId(sourceMutualPlanRecords.getEntityAttrId());
//                mutualPlanRecords.setTradeNo(sourceMutualPlanRecords.getTradeNo());
//
//                //把字符改为数字枚举值  0 ： 默认值 1 ： mutual_plan 2 ： mutual_plan_service
//                mutualPlanRecords.setEntity(Entity.getVaule(sourceMutualPlanRecords.getEntity()));
//                mutualPlanRecords.setEntityId(sourceMutualPlanRecords.getEntityId());
//                //把字符改为数字枚举值
//                mutualPlanRecords.setSource(Source.getVaule(sourceMutualPlanRecords.getSource()));
//
//                mutualPlanRecords.setSourceId(sourceMutualPlanRecords.getSourceId());
//                mutualPlanRecords.setType(sourceMutualPlanRecords.getType());
//                mutualPlanRecords.setBillMoney(sourceMutualPlanRecords.getBillMoney());
//                mutualPlanRecords.setFundingBefore(sourceMutualPlanRecords.getFundingBefore());
//                mutualPlanRecords.setFundingCurrent(sourceMutualPlanRecords.getFundingCurrent());
//                mutualPlanRecords.setIsIncome(sourceMutualPlanRecords.getIsIncome());
//                mutualPlanRecords.setName(sourceMutualPlanRecords.getName());
//                mutualPlanRecords.setCreatedAt(sourceMutualPlanRecords.getCreatedAt());
//                mutualPlanRecords.setUpdatedAt(sourceMutualPlanRecords.getUpdatedAt());
//
//                if(sourceMutualPlanRecords.getId() > id){
//                    id = sourceMutualPlanRecords.getId();
//                }
//                try{
////                    mutualPlanRecordsService.update(mutualPlanRecords);
//                }catch (Exception e){}
//
//            }
//        }
//        date = new Date();

        return  msgBean;
    }

//    @GetMapping("/initData")
//    @ApiOperation("初始化数据")
//    @ResponseBody
//    @ApiResponses(value = {@ApiResponse(code = 200 ,message = "test")})
//    public MsgBean initData() {
//        MsgBean msgBean = new MsgBean();
//        int pageCount  = 1;
//        Integer total = 10000;
//        init(pageCount,total);
//        return msgBean.put("","");
//    }
//
//    private void init(int pageCount,Integer total){
////        29040466  29119327  291546851
//        IPage<MutualPlanRecords> list = recordsDataChangeService.getRecordsList(pageCount,total);
//
//
//        if(list == null || list.getSize() < 1) {
//            return;
//        }
//
//        Iterator var7 = list.getRecords().iterator();
//
//        while(var7.hasNext()) {
//            MutualPlanRecords sourceMutualPlanRecords = (MutualPlanRecords) var7.next();
//            NewMutualPlanRecords mutualPlanRecords = new NewMutualPlanRecords();
//            mutualPlanRecords.setId(sourceMutualPlanRecords.getId());
//            mutualPlanRecords.setUserId(sourceMutualPlanRecords.getUserId());
//            //  将旧数据的entityAttrId赋值给新建的memberId
//            mutualPlanRecords.setMemberId(sourceMutualPlanRecords.getEntityAttrId());
//            mutualPlanRecords.setTradeNo(sourceMutualPlanRecords.getTradeNo());
//
//            //把字符改为数字枚举值  0 ： 默认值 1 ： mutual_plan 2 ： mutual_plan_service
//            mutualPlanRecords.setEntity(EntityEnum.getVaule(sourceMutualPlanRecords.getEntity()));
//            mutualPlanRecords.setEntityId(sourceMutualPlanRecords.getEntityId());
//            //把字符改为数字枚举值
//            mutualPlanRecords.setSource(SourceEnum.getVaule(sourceMutualPlanRecords.getSource()));
//
//            mutualPlanRecords.setSourceId(sourceMutualPlanRecords.getSourceId());
//            mutualPlanRecords.setType(sourceMutualPlanRecords.getType());
//            mutualPlanRecords.setBillMoney(sourceMutualPlanRecords.getBillMoney());
//            mutualPlanRecords.setFundingBefore(sourceMutualPlanRecords.getFundingBefore());
//            mutualPlanRecords.setFundingCurrent(sourceMutualPlanRecords.getFundingCurrent());
//            mutualPlanRecords.setIsIncome(sourceMutualPlanRecords.getIsIncome());
//            mutualPlanRecords.setName(sourceMutualPlanRecords.getName());
//            mutualPlanRecords.setCreatedAt(sourceMutualPlanRecords.getCreatedAt());
//            mutualPlanRecords.setUpdatedAt(sourceMutualPlanRecords.getUpdatedAt());
//
//            System.out.println("id ============== "+sourceMutualPlanRecords.getId());
//        }
//
//
//        init(pageCount+1, total);
//    }
}
