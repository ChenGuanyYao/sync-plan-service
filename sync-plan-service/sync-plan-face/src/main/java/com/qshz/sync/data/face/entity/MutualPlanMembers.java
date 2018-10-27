package com.qshz.sync.data.face.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
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
public class MutualPlanMembers implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 计划ID
     */
    private Integer mutualPlanId;

    /**
     * 会员卡号
     */
    private String memberNo;

    /**
     * mutual_users用户的id
     */
    private Integer userId;

    /**
     * 身份唯一标识
     */
    private String uniqueId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 身份证明文
     */
    private String idcard;

    /**
     * 身份证密文
     */
    private String idcardSecret;

    /**
     * 出生日期
     */
    private LocalDate birthday;

    /**
     * 状态 0有名字未支付 1已支付无名字 10激活 30 余额不足 一个月内不充值高于10元 自动退出 21失效退出
     */
    private Integer state;

    /**
     * 余额
     */
    private Integer balance;

    /**
     * 加入序号
     */
    private Integer joinNo;

    /**
     * 加入渠道
     */
    private String joinChannel;

    /**
     * 新的加入渠道
     */
    private String joinChannelSet;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;

    /**
     * 激活时间
     */
    private LocalDateTime activedAt;

    /**
     * 失效时间
     */
    private LocalDateTime inactivedAt;

    /**
     * 保障时间
     */
    private LocalDateTime startedAt;

    /**
     * 退出时间
     */
    private LocalDateTime exitedAt;

    /**
     * 问题
     */
    private String issue;

    /**
     * 软删除
     */
    private Integer isDeleted;

    /**
     * 更新时间
     */
    private LocalDateTime updatedAt;

    /**
     * json 格式 用记录轻疾选择的疾病和症状 不要覆盖现有的值
     */
    private String issues;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMutualPlanId() {
        return mutualPlanId;
    }

    public void setMutualPlanId(Integer mutualPlanId) {
        this.mutualPlanId = mutualPlanId;
    }

    public String getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(String memberNo) {
        this.memberNo = memberNo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getIdcardSecret() {
        return idcardSecret;
    }

    public void setIdcardSecret(String idcardSecret) {
        this.idcardSecret = idcardSecret;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getJoinNo() {
        return joinNo;
    }

    public void setJoinNo(Integer joinNo) {
        this.joinNo = joinNo;
    }

    public String getJoinChannel() {
        return joinChannel;
    }

    public void setJoinChannel(String joinChannel) {
        this.joinChannel = joinChannel;
    }

    public String getJoinChannelSet() {
        return joinChannelSet;
    }

    public void setJoinChannelSet(String joinChannelSet) {
        this.joinChannelSet = joinChannelSet;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getActivedAt() {
        return activedAt;
    }

    public void setActivedAt(LocalDateTime activedAt) {
        this.activedAt = activedAt;
    }

    public LocalDateTime getInactivedAt() {
        return inactivedAt;
    }

    public void setInactivedAt(LocalDateTime inactivedAt) {
        this.inactivedAt = inactivedAt;
    }

    public LocalDateTime getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(LocalDateTime startedAt) {
        this.startedAt = startedAt;
    }

    public LocalDateTime getExitedAt() {
        return exitedAt;
    }

    public void setExitedAt(LocalDateTime exitedAt) {
        this.exitedAt = exitedAt;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getIssues() {
        return issues;
    }

    public void setIssues(String issues) {
        this.issues = issues;
    }

    @Override
    public String toString() {
        return "MutualPlanMembers{" +
        "id=" + id +
        ", mutualPlanId=" + mutualPlanId +
        ", memberNo=" + memberNo +
        ", userId=" + userId +
        ", uniqueId=" + uniqueId +
        ", name=" + name +
        ", idcard=" + idcard +
        ", idcardSecret=" + idcardSecret +
        ", birthday=" + birthday +
        ", state=" + state +
        ", balance=" + balance +
        ", joinNo=" + joinNo +
        ", joinChannel=" + joinChannel +
        ", joinChannelSet=" + joinChannelSet +
        ", createdAt=" + createdAt +
        ", activedAt=" + activedAt +
        ", inactivedAt=" + inactivedAt +
        ", startedAt=" + startedAt +
        ", exitedAt=" + exitedAt +
        ", issue=" + issue +
        ", isDeleted=" + isDeleted +
        ", updatedAt=" + updatedAt +
        ", issues=" + issues +
        "}";
    }
}
