package com.qshz.sync.data.api.controller;


import com.qsc.common.utils.MsgBean;
import com.qshz.sync.data.face.entity.MutualPlanMembers;
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
@RequestMapping("/mutualPlanMembers")
@Api(tags = "互助计划成员")
public class MutualPlanMembersController {


    @GetMapping("/list")
    @ApiOperation("查询")
    @ResponseBody
    @ApiResponses(value = {@ApiResponse(code = 200 ,message = "test")})
    public MsgBean list(@ApiParam("计划id") @RequestParam(value = "mutualPlanId",required=false) Integer mutualPlanId,@ApiParam("用户id") @RequestParam(value = "userId",required = false) Integer userId){
        MsgBean msgBean=new MsgBean();
        MutualPlanMembers mutualPlanMembers=new MutualPlanMembers();
        mutualPlanMembers.setMutualPlanId(mutualPlanMembers.getMutualPlanId());
        mutualPlanMembers.setUserId(mutualPlanMembers.getUserId());
        return msgBean.put("data",mutualPlanMembers);
    }

}

