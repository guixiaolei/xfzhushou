package cn.kingcai.entity;

import java.util.Date;

public class BipTPostponerecord {
    private Long fid;

    private Long fentryid;

    private Integer fseq;

    private Date fBipApplydate;

    private Date fBipOverdate;

    private String fBipApplyreason;

    private String fBipRecordperson;

    private Date fBipCratedate;

    private String fBipProcessstate;

    private Date fBipDate;

    private String fBipIsfirstdate;

    private String foperator;

    private String fBipDelayreason;

    private String fBipIssystemupdate;

    private String fBipIsdelay;

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

    public Date getfBipApplydate() {
        return fBipApplydate;
    }

    public void setfBipApplydate(Date fBipApplydate) {
        this.fBipApplydate = fBipApplydate;
    }

    public Date getfBipOverdate() {
        return fBipOverdate;
    }

    public void setfBipOverdate(Date fBipOverdate) {
        this.fBipOverdate = fBipOverdate;
    }

    public String getfBipApplyreason() {
        return fBipApplyreason;
    }

    public void setfBipApplyreason(String fBipApplyreason) {
        this.fBipApplyreason = fBipApplyreason == null ? null : fBipApplyreason.trim();
    }

    public String getfBipRecordperson() {
        return fBipRecordperson;
    }

    public void setfBipRecordperson(String fBipRecordperson) {
        this.fBipRecordperson = fBipRecordperson == null ? null : fBipRecordperson.trim();
    }

    public Date getfBipCratedate() {
        return fBipCratedate;
    }

    public void setfBipCratedate(Date fBipCratedate) {
        this.fBipCratedate = fBipCratedate;
    }

    public String getfBipProcessstate() {
        return fBipProcessstate;
    }

    public void setfBipProcessstate(String fBipProcessstate) {
        this.fBipProcessstate = fBipProcessstate == null ? null : fBipProcessstate.trim();
    }

    public Date getfBipDate() {
        return fBipDate;
    }

    public void setfBipDate(Date fBipDate) {
        this.fBipDate = fBipDate;
    }

    public String getfBipIsfirstdate() {
        return fBipIsfirstdate;
    }

    public void setfBipIsfirstdate(String fBipIsfirstdate) {
        this.fBipIsfirstdate = fBipIsfirstdate == null ? null : fBipIsfirstdate.trim();
    }

    public String getFoperator() {
        return foperator;
    }

    public void setFoperator(String foperator) {
        this.foperator = foperator == null ? null : foperator.trim();
    }

    public String getfBipDelayreason() {
        return fBipDelayreason;
    }

    public void setfBipDelayreason(String fBipDelayreason) {
        this.fBipDelayreason = fBipDelayreason == null ? null : fBipDelayreason.trim();
    }

    public String getfBipIssystemupdate() {
        return fBipIssystemupdate;
    }

    public void setfBipIssystemupdate(String fBipIssystemupdate) {
        this.fBipIssystemupdate = fBipIssystemupdate == null ? null : fBipIssystemupdate.trim();
    }

    public String getfBipIsdelay() {
        return fBipIsdelay;
    }

    public void setfBipIsdelay(String fBipIsdelay) {
        this.fBipIsdelay = fBipIsdelay == null ? null : fBipIsdelay.trim();
    }
}