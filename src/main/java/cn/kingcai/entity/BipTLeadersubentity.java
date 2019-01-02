package cn.kingcai.entity;

import java.util.Date;

public class BipTLeadersubentity {
    private Long fentryid;

    private Long fdetailid;

    private Integer fseq;

    private String fBipReplyperson;

    private String fBipIndicateperson;

    private String fBipReplydetails;

    private Date fBipReplytime;

    private String fBipReplydetailsTag;

    public Long getFentryid() {
        return fentryid;
    }

    public void setFentryid(Long fentryid) {
        this.fentryid = fentryid;
    }

    public Long getFdetailid() {
        return fdetailid;
    }

    public void setFdetailid(Long fdetailid) {
        this.fdetailid = fdetailid;
    }

    public Integer getFseq() {
        return fseq;
    }

    public void setFseq(Integer fseq) {
        this.fseq = fseq;
    }

    public String getfBipReplyperson() {
        return fBipReplyperson;
    }

    public void setfBipReplyperson(String fBipReplyperson) {
        this.fBipReplyperson = fBipReplyperson == null ? null : fBipReplyperson.trim();
    }

    public String getfBipIndicateperson() {
        return fBipIndicateperson;
    }

    public void setfBipIndicateperson(String fBipIndicateperson) {
        this.fBipIndicateperson = fBipIndicateperson == null ? null : fBipIndicateperson.trim();
    }

    public String getfBipReplydetails() {
        return fBipReplydetails;
    }

    public void setfBipReplydetails(String fBipReplydetails) {
        this.fBipReplydetails = fBipReplydetails == null ? null : fBipReplydetails.trim();
    }

    public Date getfBipReplytime() {
        return fBipReplytime;
    }

    public void setfBipReplytime(Date fBipReplytime) {
        this.fBipReplytime = fBipReplytime;
    }

    public String getfBipReplydetailsTag() {
        return fBipReplydetailsTag;
    }

    public void setfBipReplydetailsTag(String fBipReplydetailsTag) {
        this.fBipReplydetailsTag = fBipReplydetailsTag == null ? null : fBipReplydetailsTag.trim();
    }
}