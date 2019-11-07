package com.dfjs.entity;

import java.io.Serializable;
import java.util.Date;

public class UserWarrantor implements Serializable {
    private Long id;

    private Integer eventId;

    private Long warrantorId;

    private String warrantorTel;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public Long getWarrantorId() {
        return warrantorId;
    }

    public void setWarrantorId(Long warrantorId) {
        this.warrantorId = warrantorId;
    }

    public String getWarrantorTel() {
        return warrantorTel;
    }

    public void setWarrantorTel(String warrantorTel) {
        this.warrantorTel = warrantorTel == null ? null : warrantorTel.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", eventId=").append(eventId);
        sb.append(", warrantorId=").append(warrantorId);
        sb.append(", warrantorTel=").append(warrantorTel);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}