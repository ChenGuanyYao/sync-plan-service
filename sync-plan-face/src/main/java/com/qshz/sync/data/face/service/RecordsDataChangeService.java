package com.qshz.sync.data.face.service;

import com.qshz.sync.data.face.entity.SourceMutualPlanRecords;

import java.util.Date;
import java.util.List;

public interface RecordsDataChangeService {
    public String test();
//    public List<SourceMutualPlanRecords> getMutualPlanRecordsList(Date updateTime);
    public List<SourceMutualPlanRecords> getRecordsListById(Long id, Integer total);
    public List<SourceMutualPlanRecords> getRecordsListByUpdate(Long id,Date updatedAt,Integer total);
}
