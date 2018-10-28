package com.qshz.sync.data.face.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.qshz.sync.data.face.entity.MutualPlanRecords;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zxx
 * @since 2018-10-18
 */
public interface MutualPlanRecordsService extends IService<MutualPlanRecords> {

    /**
     * 最大充值
     * @param userId
     * @return
     */
    Integer moneyMax(Integer userId);

    /**
     * 订单流水
     * @param sourceId
     * @param userId
     * @return
     */
    List<MutualPlanRecords> memberList(Integer userId, Long sourceId);

    /**
     * 会员流水
     * @param userId
     * @param entityAttrId
     * @param entity
     * @return
     */
    List<MutualPlanRecords> recordsList(Integer userId, String entity, Long entityAttrId);

    /**
     * 退款账单详情
     * @param userId
     * @param id
     * @return
     */
    MutualPlanRecords getByUseridAndId(Integer userId, Long id);

    /**
     * 退款流水
     * @param userId
     * @param entityAttrId
     * @param sourceId
     * @return
     */
    List<MutualPlanRecords> getByUidAndEaidAndSid(Integer userId, Long entityAttrId, long sourceId);

    /**
     * 当前用户参与此次救助事件的人数
     * @param userId
     * @param sourceId
     * @return
     */
    int huzhuCount(Integer userId, Long sourceId);

    /**
     * 保险送百万数据
     * @param userId
     * @param entityAttrId
     * @return
     */
    ArrayList<MutualPlanRecords> getByUidAndMid(Integer userId, Long entityAttrId);

    /**
     *
     * @param userId
     * @param sourceId
     * @return
     */
    List<MutualPlanRecords> memberAction(Integer userId, long sourceId);

    /**
     * 当前会员参与的公示事件ID
     * @param userId
     * @param sourceId
     * @param entityAttrId
     * @return
     */
    int memberId(Integer userId, long sourceId, long entityAttrId);



    IPage<MutualPlanRecords> getCommonMemberList(Long entityAttrId, int pageCount, int pageSize);

    MutualPlanRecords getFamilyMealsMoney(Long entityAttrId, String entityAttr, int type);

    IPage<MutualPlanRecords> getMemberBillList(Long userId, Long entityAttrId, String entityAttr, String entity, int pageCount, int pageSize);

    int  getMemberMutualCount(Long entityAttrId, String entityAttr, int type);

    MutualPlanRecords getMemberMutualMoney(Long entityAttrId, String entityAttr, int type);


    IPage<MutualPlanRecords> getMemberMutualList(Long entityAttrId, String entityAttr, int type, int pageCount, int pageSize);

    IPage<MutualPlanRecords>   getPublicityMutualList(Long entityAttrId, String entityAttr, String entity, int type, int pageCount, int pageSize);

    MutualPlanRecords getMinuteMutualTopMoney(String beginTime, String endTime, int isIncome, int entityId, int type);

    MutualPlanRecords getMinuteMutualAddMoney(Long entityAttrId, int isIncome, int entityId, int type);

    IPage<MutualPlanRecords> getVipMemberRenewList(Long entityAttrId, int type, int pageCount, int pageSize);


    public void insertBath(List<MutualPlanRecords> list);

    public int update(MutualPlanRecords mutualPlanRecords);

    public boolean updateBatch(List<MutualPlanRecords> list);

}
