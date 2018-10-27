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
public class MutualPlanTrades implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 商户单号
     */
    private String tradeNo;

    /**
     * 交易号
     */
    private String outTradeNo;

    /**
     * 支付方式 1 基金会APP 2 基金会H5 11 轻松筹H5 12 轻松筹APP 21 轻松健康H5 22 轻松健康APP 31 互助小程序
     */
    private Integer paymentType;

    /**
     * 是否支付
     */
    private int isPaid;

    /**
     * 金额
     */
    private Integer billMoney;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;

    /**
     * 付款时间
     */
    private LocalDateTime payAt;

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

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public int getPaid() {
        return isPaid;
    }

    public void setPaid(int isPaid) {
        this.isPaid = isPaid;
    }

    public Integer getBillMoney() {
        return billMoney;
    }

    public void setBillMoney(Integer billMoney) {
        this.billMoney = billMoney;
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

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "MutualPlanTrades{" +
        "id=" + id +
        ", userId=" + userId +
        ", tradeNo=" + tradeNo +
        ", outTradeNo=" + outTradeNo +
        ", paymentType=" + paymentType +
        ", isPaid=" + isPaid +
        ", billMoney=" + billMoney +
        ", createdAt=" + createdAt +
        ", payAt=" + payAt +
        ", updatedAt=" + updatedAt +
        "}";
    }
}
