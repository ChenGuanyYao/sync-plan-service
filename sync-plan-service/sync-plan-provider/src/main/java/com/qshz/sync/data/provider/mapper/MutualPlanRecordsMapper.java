package com.qshz.sync.data.provider.mapper;

import com.qshz.sync.data.face.entity.MutualPlanRecords;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zxx
 * @since 2018-10-18
 */
public interface MutualPlanRecordsMapper extends BaseMapper<MutualPlanRecords> {

    Integer moneyMax(@Param("userId") Integer userId);

    List<MutualPlanRecords> memberList(@Param("userId") Integer userId, @Param("sourceId") Long sourceId);

    List<MutualPlanRecords> recordsList(@Param("userId") Integer userId,@Param("entity") String entity,@Param("entityAttrId") long entityAttrId);

    MutualPlanRecords getByUseridAndId(@Param("userId") Integer userId,@Param("id") Long id);

    List<MutualPlanRecords> getByUidAndEaidAndSid(@Param("userId") Integer userId,@Param("entityAttrId") Long entityAttrId,@Param("sourceId") long sourceId);

    int huzhuCount(@Param("userId") Integer userId,@Param("sourceId") Long sourceId);

    ArrayList<MutualPlanRecords> getByUidAndMid(@Param("userId") Integer userId,@Param("entityAttrId") Long entityAttrId);

    List<MutualPlanRecords> memberAction(@Param("userId") Integer userId,@Param("sourceId") long sourceId);

    int memberId(@Param("userId") Integer userId,@Param("sourceId") long sourceId,@Param("entityAttrId") long entityAttrId);

    int insertSelective(MutualPlanRecords mutualPlanRecords);

    int updateSelective(MutualPlanRecords mutualPlanRecords);

    void insertByBatch(List<MutualPlanRecords> list);


}
