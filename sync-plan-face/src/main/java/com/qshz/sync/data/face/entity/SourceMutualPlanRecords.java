package com.qshz.sync.data.face.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author zxx
 * @since 2018-10-18
 */
public class SourceMutualPlanRecords implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 流水号
     */
    private String tradeNo;

    /**
     * 主实体 mutual_plan
     */
    private String entity;

    /**
     * 主实体ID
     */
    private Long entityId;

    /**
     * 副实体 mutual_plan_member
     */
    private String entityAttr;

    /**
     * 副实体ID
     */
    private Long entityAttrId;

    /**
     * 来源 order mutual_plan_event boundpay record enterprise_records
     */
    private String source;

    /**
     * 来源ID
     */
    private Long sourceId;

    /**
     * 明细类型 0加入 1充值 2联合支付 5转移计划 10赔付 20退款 30 购买服务 40 基础服务费 50 余额转账(系统) 60 未实名购买
     */
    private Integer type;

    /**
     * 金额
     */
    private Integer billMoney;

    /**
     * 之前余额
     */
    private Integer fundingBefore;

    /**
     * 当前余额
     */
    private Integer fundingCurrent;

    /**
     * 是否入账
     */
    private Integer isIncome;

    /**
     * 名称
     */
    private String name;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;

    /**
     * 更新时间
     */
    private LocalDateTime updatedAt;

    public Integer getIsIncome() {
        return isIncome;
    }

    public void setIsIncome(Integer isIncome) {
        this.isIncome = isIncome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public String getEntityAttr() {
        return entityAttr;
    }

    public void setEntityAttr(String entityAttr) {
        this.entityAttr = entityAttr;
    }

    public Long getEntityAttrId() {
        return entityAttrId;
    }

    public void setEntityAttrId(Long entityAttrId) {
        this.entityAttrId = entityAttrId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Long getSourceId() {
        return sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getBillMoney() {
        return billMoney;
    }

    public void setBillMoney(Integer billMoney) {
        this.billMoney = billMoney;
    }

    public Integer getFundingBefore() {
        return fundingBefore;
    }

    public void setFundingBefore(Integer fundingBefore) {
        this.fundingBefore = fundingBefore;
    }

    public Integer getFundingCurrent() {
        return fundingCurrent;
    }

    public void setFundingCurrent(Integer fundingCurrent) {
        this.fundingCurrent = fundingCurrent;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "MutualPlanRecords{" +
        "id=" + id +
        ", userId=" + userId +
        ", tradeNo=" + tradeNo +
        ", entity=" + entity +
        ", entityId=" + entityId +
        ", entityAttr=" + entityAttr +
        ", entityAttrId=" + entityAttrId +
        ", source=" + source +
        ", sourceId=" + sourceId +
        ", type=" + type +
        ", billMoney=" + billMoney +
        ", fundingBefore=" + fundingBefore +
        ", fundingCurrent=" + fundingCurrent +
        ", isIncome=" + isIncome +
        ", name=" + name +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        "}";
    }
}
