package cn.kingcai.entity;

public class BipTFocustable {
    private Long fid;

    private Long fentryid;

    private Integer fseq;

    private String fBipFocususerid;

    private String fBipFocusname;

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

    public String getfBipFocususerid() {
        return fBipFocususerid;
    }

    public void setfBipFocususerid(String fBipFocususerid) {
        this.fBipFocususerid = fBipFocususerid == null ? null : fBipFocususerid.trim();
    }

    public String getfBipFocusname() {
        return fBipFocusname;
    }

    public void setfBipFocusname(String fBipFocusname) {
        this.fBipFocusname = fBipFocusname == null ? null : fBipFocusname.trim();
    }
}