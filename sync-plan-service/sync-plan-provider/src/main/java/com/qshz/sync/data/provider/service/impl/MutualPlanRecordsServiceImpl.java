package com.qshz.sync.data.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qshz.sync.data.face.entity.MutualPlanRecords;
import com.qshz.sync.data.face.service.MutualPlanRecordsService;
import com.qshz.sync.data.face.service.RecordsDataChangeService;
import com.qshz.sync.data.provider.mapper.MutualPlanRecordsMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zxx
 * @since 2018-10-18
 */
@Service
public class MutualPlanRecordsServiceImpl extends ServiceImpl<MutualPlanRecordsMapper, MutualPlanRecords> implements MutualPlanRecordsService {


    @Reference(group="RecordsDataChangeService", version="1.0")
    private RecordsDataChangeService recordsDataChangeService;

    @Autowired
    private MutualPlanRecordsMapper mutualPlanRecordsMapper;


    @Override
    public Integer moneyMax(Integer userId) {
        return baseMapper.moneyMax(userId);
    }

    @Override
    public List<MutualPlanRecords> memberList(Integer userId, Long sourceId) {
        return baseMapper.memberList(userId, sourceId);
    }


    @Override
    public List<MutualPlanRecords> recordsList(Integer userId, String entity, Long entityAttrId) {
        return baseMapper.recordsList(userId, entity, entityAttrId);
    }

    @Override
    public MutualPlanRecords getByUseridAndId(Integer userId, Long id) {
        return baseMapper.getByUseridAndId(userId, id);
    }

    @Override
    public List<MutualPlanRecords> getByUidAndEaidAndSid(Integer userId, Long entityAttrId, long sourceId) {
        return baseMapper.getByUidAndEaidAndSid(userId, entityAttrId, sourceId);
    }

    @Override
    public int huzhuCount(Integer userId, Long sourceId) {
        return baseMapper.huzhuCount(userId, sourceId);
    }

    @Override
    public ArrayList<MutualPlanRecords> getByUidAndMid(Integer userId, Long entityAttrId) {
        return baseMapper.getByUidAndMid(userId, entityAttrId);
    }

    @Override
    public List<MutualPlanRecords> memberAction(Integer userId, long sourceId) {
        return baseMapper.memberAction(userId, sourceId);
    }

    @Override
    public int memberId(Integer userId, long sourceId, long entityAttrId) {
        return baseMapper.memberId(userId, sourceId, entityAttrId);
    }

    /**
     * 查询普通会员流水
     *
     * @param entityAttrId
     * @param pageCount
     * @param pageSize
     * @return
     */
    @Override
    public IPage<MutualPlanRecords> getCommonMemberList(Long entityAttrId, int pageCount, int pageSize) {


        Page<MutualPlanRecords> page = new Page<>();
        page.setCurrent(pageCount);
        page.setSize(pageSize);

        QueryWrapper<MutualPlanRecords> wrapper = new QueryWrapper<>();
        wrapper.eq("entity_attr_id", entityAttrId);

        IPage<MutualPlanRecords> list = baseMapper.selectPage(page, wrapper);

        return list;
    }

    /**
     * 查询全家桶活动赠送的金额
     *
     * @param entityAttrId
     * @param entityAttr
     * @param type
     * @return
     */
    @Override
    public MutualPlanRecords getFamilyMealsMoney(Long entityAttrId, String entityAttr, int type) {


        QueryWrapper<MutualPlanRecords> wrapper = new QueryWrapper<>();
        wrapper.eq("entity_attr_id", entityAttrId);
        wrapper.eq("entity_attr", entityAttr);
        wrapper.eq("type", type);
        wrapper.select("sum(bill_money) as billMoney");

        MutualPlanRecords list = baseMapper.selectOne(wrapper);

        return list;

    }

    /**
     * 获取会员卡账单信息
     *
     * @param userId
     * @param entityAttrId
     * @param entityAttr
     * @param entity
     * @param pageCount
     * @param pageSize
     * @return
     */
    @Override
    public IPage<MutualPlanRecords> getMemberBillList(Long userId, Long entityAttrId, String entityAttr, String entity, int pageCount, int pageSize) {

        Page<MutualPlanRecords> page = new Page<>();
        page.setCurrent(pageCount);
        page.setSize(pageSize);

        QueryWrapper<MutualPlanRecords> wrapper = new QueryWrapper<>();
        wrapper.eq("user_id", userId);
        wrapper.eq("entity_attr", entityAttr);
        wrapper.eq("entity_attr_id", entityAttrId);
        wrapper.eq("entity", entity);
        wrapper.orderByDesc("id");


        IPage<MutualPlanRecords> list = baseMapper.selectPage(page, wrapper);

        return list;

    }

    /**
     * 获取会员互助事件次数
     *
     * @param entityAttrId
     * @param entityAttr
     * @param type
     * @return
     */
    @Override
    public int getMemberMutualCount(Long entityAttrId, String entityAttr, int type) {

        QueryWrapper<MutualPlanRecords> wrapper = new QueryWrapper<>();
        wrapper.eq("entity_attr", entityAttr);
        wrapper.eq("entity_attr_id", entityAttrId);
        wrapper.eq("type", type);

        int count = baseMapper.selectCount(wrapper);

        return count;

    }

    /**
     * 获取会员参与的互助事件的总金额
     *
     * @param entityAttrId
     * @param entityAttr
     * @param type
     * @return
     */
    @Override
    public MutualPlanRecords getMemberMutualMoney(Long entityAttrId, String entityAttr, int type) {

        QueryWrapper<MutualPlanRecords> wrapper = new QueryWrapper<>();
        wrapper.eq("entity_attr_id", entityAttrId);
        wrapper.eq("entity_attr", entityAttr);
        wrapper.eq("type", type);
        wrapper.select("sum(bill_money) as billMoney");

        MutualPlanRecords list = baseMapper.selectOne(wrapper);

        return list;
    }

    /**
     * 查询当前用户的互助事件
     *
     * @param entityAttrId
     * @param entityAttr
     * @param type
     * @param pageCount
     * @param pageSize
     * @return
     */
    @Override
    public IPage<MutualPlanRecords> getMemberMutualList(Long entityAttrId, String entityAttr, int type, int pageCount, int pageSize) {


        Page<MutualPlanRecords> page = new Page<>();
        page.setCurrent(pageCount);
        page.setSize(pageSize);

        QueryWrapper<MutualPlanRecords> wrapper = new QueryWrapper<>();
        wrapper.eq("entity_attr", entityAttr);
        wrapper.eq("entity_attr_id", entityAttrId);
        wrapper.eq("type", type);

        IPage<MutualPlanRecords> list = baseMapper.selectPage(page, wrapper);

        return list;

    }

    /**
     * 公示人助人记录
     *
     * @param entityAttrId
     * @param entityAttr
     * @param entity
     * @param type
     * @param pageCount
     * @param pageSize
     * @return
     */
    @Override
    public IPage<MutualPlanRecords> getPublicityMutualList(Long entityAttrId, String entityAttr, String entity, int type, int pageCount, int pageSize) {

        Page<MutualPlanRecords> page = new Page<>();
        page.setCurrent(pageCount);
        page.setSize(pageSize);

        QueryWrapper<MutualPlanRecords> wrapper = new QueryWrapper<>();
        wrapper.eq("entity_attr", entityAttr);
        wrapper.eq("entity_attr_id", entityAttrId);
        wrapper.eq("entity", entity);
        wrapper.eq("type", type);
        wrapper.orderByDesc("id");

        IPage<MutualPlanRecords> list = baseMapper.selectPage(page, wrapper);

        return list;

    }
    /**
     * 每分钟互保统计更新 -> 充值金额
     * @param beginTime
     * @param endTime
     * @param isIncome
     * @param entityId
     * @param type
     * @return
     */
    @Override
    public MutualPlanRecords getMinuteMutualTopMoney(String beginTime, String endTime, int isIncome, int entityId, int type){


        QueryWrapper<MutualPlanRecords> wrapper = new QueryWrapper<>();

        wrapper.eq("type",type);
        wrapper.eq("is_income",isIncome);
        wrapper.eq("entity_id",entityId);
        wrapper.ge("created_at",beginTime);
        wrapper.lt("created_at",endTime);
        wrapper.select("sum(bill_money) as billMoney");


        MutualPlanRecords model = baseMapper.selectOne(wrapper);

        return model;

    }
    /**
     * 每分钟互保统计更新 -> 加入金额
     * @param entityAttrId
     * @param isIncome
     * @param entityId
     * @param type
     * @return
     */
    @Override
    public MutualPlanRecords getMinuteMutualAddMoney(Long entityAttrId, int isIncome, int entityId, int type){

        QueryWrapper<MutualPlanRecords> wrapper = new QueryWrapper<>();

        wrapper.eq("type",type);
        wrapper.eq("is_income",isIncome);
        wrapper.eq("entity_id",entityId);
        wrapper.ge("entity_attr_id",entityAttrId);
        wrapper.select("sum(bill_money) as billMoney");

        MutualPlanRecords model = baseMapper.selectOne(wrapper);

        return model;

    }
    /**
     * 黄金会员续费
     * @param entityAttrId
     * @param type
     * @param pageCount
     * @param pageSize
     * @return
     */
    @Override
    public IPage<MutualPlanRecords> getVipMemberRenewList(Long entityAttrId, int type, int pageCount, int pageSize){


        Page<MutualPlanRecords> page = new Page<>();
        page.setCurrent(pageCount);
        page.setSize(pageSize);

        QueryWrapper<MutualPlanRecords> wrapper = new QueryWrapper<>();
        wrapper.eq("entity_attr_id", entityAttrId);
        wrapper.eq("type",type);

        IPage<MutualPlanRecords> list = baseMapper.selectPage(page, wrapper);

        return list;

    }



    @Override
    public void insertBath(List<MutualPlanRecords> list){
        mutualPlanRecordsMapper.insertByBatch(list);
        System.out.println("插入成功 --- 》"+ list.size());
    }



    @Override
    public int update(MutualPlanRecords mutualPlanRecords){
        return mutualPlanRecordsMapper.updateSelective(mutualPlanRecords);
    }

    @Override
    public boolean updateBatch(List<MutualPlanRecords> list){

        return super.updateBatchById(list);
    }

}