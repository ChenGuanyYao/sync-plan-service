package com.qshz.sync.data.face.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zxx
 * @since 2018-10-18
 */
public class MutualPlanOrders implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 买家ID
     */
    private Integer userId;

    /**
     * 交易号
     */
    private String tradeNo;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 主实体
     */
    private String entity;

    /**
     * 主实体ID
     */
    private Long entityId;

    /**
     * 副实体
     */
    private String entityAttr;

    /**
     * 副实体ID
     */
    private Long entityAttrId;

    /**
     * 名称
     */
    private String name;

    /**
     * 个数
     */
    private Integer quantity;

    /**
     * 总金额
     */
    private Integer amount;

    /**
     * 实付金额
     */
    private Integer billMoney;

    /**
     * 状态 0待支付 1已支付 20交易关闭
     */
    private Integer state;

    /**
     * 下单入口
     */
    private String channel;

    /**
     * 退款状态 0未退款 10退款中 21已退款 22退款失败
     */
    private Integer refundState;

    /**
     * 退款金额
     */
    private Integer refundAmount;

    /**
     * 退款单号
     */
    private String refundNo;

    /**
     * 退款时间
     */
    private LocalDateTime refundAt;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;

    /**
     * 支付时间
     */
    private LocalDateTime payAt;

    /**
     * 关闭时间
     */
    private LocalDateTime closedAt;

    /**
     * 支付类型 0加入 1充值 30 购买服务 60 未实名购买
     */
    private Integer type;

    /**
     * 更新时间
     */
    private LocalDateTime updatedAt;


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

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getBillMoney() {
        return billMoney;
    }

    public void setBillMoney(Integer billMoney) {
        this.billMoney = billMoney;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Integer getRefundState() {
        return refundState;
    }

    public void setRefundState(Integer refundState) {
        this.refundState = refundState;
    }

    public Integer getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Integer refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    public LocalDateTime getRefundAt() {
        return refundAt;
    }

    public void setRefundAt(LocalDateTime refundAt) {
        this.refundAt = refundAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getPayAt() {
        return payAt;
    }

    public void setPayAt(LocalDateTime payAt) {
        this.payAt = payAt;
    }

    public LocalDateTime getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(LocalDateTime closedAt) {
        this.closedAt = closedAt;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "MutualPlanOrders{" +
        "id=" + id +
        ", userId=" + userId +
        ", tradeNo=" + tradeNo +
        ", orderNo=" + orderNo +
        ", entity=" + entity +
        ", entityId=" + entityId +
        ", entityAttr=" + entityAttr +
        ", entityAttrId=" + entityAttrId +
        ", name=" + name +
        ", quantity=" + quantity +
        ", amount=" + amount +
        ", billMoney=" + billMoney +
        ", state=" + state +
        ", channel=" + channel +
        ", refundState=" + refundState +
        ", refundAmount=" + refundAmount +
        ", refundNo=" + refundNo +
        ", refundAt=" + refundAt +
        ", createdAt=" + createdAt +
        ", payAt=" + payAt +
        ", closedAt=" + closedAt +
        ", type=" + type +
        ", updatedAt=" + updatedAt +
        "}";
    }
}
