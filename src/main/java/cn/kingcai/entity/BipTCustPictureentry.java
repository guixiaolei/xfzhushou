package cn.kingcai.entity;

public class BipTCustPictureentry {
    private Long fid;

    private Long fentryid;

    private Integer fseq;

    private String fBipFiledpicture;

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

    public String getfBipFiledpicture() {
        return fBipFiledpicture;
    }

    public void setfBipFiledpicture(String fBipFiledpicture) {
        this.fBipFiledpicture = fBipFiledpicture == null ? null : fBipFiledpicture.trim();
    }
}