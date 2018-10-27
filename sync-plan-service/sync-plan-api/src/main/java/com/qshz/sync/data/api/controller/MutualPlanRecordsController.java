package com.qshz.sync.data.api.controller;


import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zxx
 * @since 2018-10-18
 */
@RestController
@RequestMapping("/mutualPlanRecords")
@Api(tags = "互助计划记录")
public class MutualPlanRecordsController {

//    @Reference
//    private MutualPlanRecordsService mutualPlanRecordsService;
//
//    @GetMapping("/userRecordList")
//    @ApiOperation("获取会员流水")
//    @ResponseBody
//    @ApiResponses(value = {@ApiResponse(code = 200 ,message = "userRecordList")})
//    public MsgBean userRecordList(@ApiParam("用户id") @RequestParam(value = "user_id",required=false) Integer userId,@ApiParam("主实体") @RequestParam(value = "entity",required=false) String entity,@ApiParam("副实体id") @RequestParam(value = "entity_attr_id",required=false) long entityAttrId){
//        List<MutualPlanRecords> users=mutualPlanRecordsService.recordsList(userId,entity,entityAttrId);
//        return  MsgBean.ok().put("users",users);
//    }
//
//    @GetMapping("/refundRecordInfo")
//    @ApiOperation("退款->获取账单详细信息")
//    @ResponseBody
//    @ApiResponses(value = {@ApiResponse(code = 200 ,message = "refundRecordInfo")})
//    public MsgBean refundRecordInfo(@ApiParam("用户id") @RequestParam(value = "user_id",required=false) Integer userId,@ApiParam("主键id") @RequestParam(value = "id",required = false) Long id){
//        MutualPlanRecords records=mutualPlanRecordsService.getByUseridAndId(userId,id);
//        return MsgBean.ok().put("records",records);
//    }
//
//    @GetMapping("/refundList")
//    @ApiOperation("获取退款流水")
//    @ResponseBody
//    @ApiResponses(value = {@ApiResponse(code = 200,message = "refundList")})
//    public MsgBean refundList(@ApiParam("用户id") @RequestParam(value = "user_id",required = false) Integer userId,@ApiParam("副实体id") @RequestParam(value = "entity_attr_id",required = false) Long entityAttrId,@ApiParam("来源id") @RequestParam(value = "source_id",required = false) Long sourceId){
//        List<MutualPlanRecords> refunds=mutualPlanRecordsService.getByUidAndEaidAndSid(userId,entityAttrId,sourceId);
//        return MsgBean.ok().put("refunds",refunds);
//    }
//
//    @GetMapping("/maxMoney")
//    @ApiOperation("获取充值最大钱数")
//    @ResponseBody
//    @ApiResponses(value = {@ApiResponse(code = 200,message = "maxMoney")})
//    public MsgBean maxMoney(@ApiParam("用户Id") @RequestParam(value ="user_Id",required = false) Integer userId) {
//        Integer max=mutualPlanRecordsService.moneyMax(userId);
//        return MsgBean.ok().put("max",max);
//    }
//
//    @GetMapping("/recordList")
//    @ApiOperation("获取订单对应的流水")
//    @ResponseBody
//    @ApiResponses(value={@ApiResponse(code = 200 ,message = "recordList")})
//    public MsgBean record(@ApiParam("用户id") @RequestParam(value = "user_id",required = false) Integer userId,@ApiParam("来源Id") @RequestParam(value = "source_id",required = false) Long sourceId){
//        List<MutualPlanRecords> recordList=mutualPlanRecordsService.memberList(userId,sourceId);
//        return MsgBean.ok().put("recordList",recordList);
//    }
//
//    @GetMapping("/huzhuCount")
//    @ApiOperation("查询当前用户参与此次救助事件的人数")
//    @ResponseBody
//    @ApiResponses(value = {@ApiResponse(code = 200,message = "huzhuCount")})
//    public MsgBean huzhuCount(@ApiParam("用户id") @RequestParam(value = "user_id",required = false) Integer userId,@ApiParam("来源id") @RequestParam(value = "source_id",required = false) Long sourceId){
//        int count=mutualPlanRecordsService.huzhuCount(userId,sourceId);
//        return MsgBean.ok().put("count",count);
//    }
//
//    @GetMapping("/giveMillionData")
//    @ApiOperation("保险送百万数据")
//    @ResponseBody
//    @ApiResponses(value = {@ApiResponse(code = 200,message = "giveMillionData")})
//    public MsgBean giveMillionData(@ApiParam("用户id") @RequestParam(value = "user_id",required = false) Integer userId,@ApiParam("副实体id") @RequestParam(value = "entity_attr_id",required = false) Long entityAttrId) {
//        ArrayList<MutualPlanRecords> millionData=mutualPlanRecordsService.getByUidAndMid(userId,entityAttrId);
//        return MsgBean.ok().put("millionData",millionData);
//    }
//
//    @GetMapping("/memberAction")
//    @ApiOperation("百万/绿医")
//    @ResponseBody
//    @ApiResponses(value={@ApiResponse(code = 200,message="memberAction")})
//    public MsgBean memberAction(@ApiParam("用户id") @RequestParam(value = "user_id",required = false) Integer userId,@ApiParam("来源id") @RequestParam(value = "source_id") long sourceId){
//        List<MutualPlanRecords> memberActionList=mutualPlanRecordsService.memberAction(userId,sourceId);
//        return MsgBean.ok().put("memberActionList",memberActionList);
//    }
//
//    @GetMapping("/memberPublicityId")
//    @ApiOperation("当前会员参与的公示事件ID")
//    @ResponseBody
//    @ApiResponses(value={@ApiResponse(code = 200,message="memberPublicityId")})
//    public MsgBean memberPublicityId(@ApiParam("用户id") @RequestParam(value = "user_id",required = false) Integer userId,@ApiParam("来源id") @RequestParam(value = "source_id") long sourceId,@ApiParam("副实体id") @RequestParam(value = "entity_attr_id") long entityAttrId){
//        int id=mutualPlanRecordsService.memberId(userId,sourceId,entityAttrId);
//        return MsgBean.ok().put("id",id);
//    }

}