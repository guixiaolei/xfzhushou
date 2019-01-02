package cn.kingcai.entity;

import java.util.Date;

public class BipTOpinionentity {
    private Long fid;

    private Long fentryid;

    private Integer fseq;

    private Date fBipGreatmanageradvicetime;

    private String fBipGreatmanageropiniondetails;

    private Integer fBipGreatmanager0;

    private String fBipIspostcloudmessage;

    private String fBipIspostyunmessage;

    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public Long getFentryid() {
        return fentryid;
    }

    public void setFentryid(Long fentryid) {
        this.fentryid = fentryid;
    }

    public Integer getFseq() {
        return fseq;
    }

    public void setFseq(Integer fseq) {
        this.fseq = fseq;
    }

    public Date getfBipGreatmanageradvicetime() {
        return fBipGreatmanageradvicetime;
    }

    public void setfBipGreatmanageradvicetime(Date fBipGreatmanageradvicetime) {
        this.fBipGreatmanageradvicetime = fBipGreatmanageradvicetime;
    }

    public String getfBipGreatmanageropiniondetails() {
        return fBipGreatmanageropiniondetails;
    }

    public void setfBipGreatmanageropiniondetails(String fBipGreatmanageropiniondetails) {
        this.fBipGreatmanageropiniondetails = fBipGreatmanageropiniondetails == null ? null : fBipGreatmanageropiniondetails.trim();
    }

    public Integer getfBipGreatmanager0() {
        return fBipGreatmanager0;
    }

    public void setfBipGreatmanager0(Integer fBipGreatmanager0) {
        this.fBipGreatmanager0 = fBipGreatmanager0;
    }

    public String getfBipIspostcloudmessage() {
        return fBipIspostcloudmessage;
    }

    public void setfBipIspostcloudmessage(String fBipIspostcloudmessage) {
        this.fBipIspostcloudmessage = fBipIspostcloudmessage == null ? null : fBipIspostcloudmessage.trim();
    }

    public String getfBipIspostyunmessage() {
        return fBipIspostyunmessage;
    }

    public void setfBipIspostyunmessage(String fBipIspostyunmessage) {
        this.fBipIspostyunmessage = fBipIspostyunmessage == null ? null : fBipIspostyunmessage.trim();
    }
}