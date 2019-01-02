package cn.kingcai.entity;

public class BipTCustProcessingitems {
    private Integer fid;

    private Integer fentryid;

    private Integer fseq;

    private String fBipFirstclass;

    private String fBipSecondclass;

    private String fBipThirdclass;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getFentryid() {
        return fentryid;
    }

    public void setFentryid(Integer fentryid) {
        this.fentryid = fentryid;
    }

    public Integer getFseq() {
        return fseq;
    }

    public void setFseq(Integer fseq) {
        this.fseq = fseq;
    }

    public String getfBipFirstclass() {
        return fBipFirstclass;
    }

    public void setfBipFirstclass(String fBipFirstclass) {
        this.fBipFirstclass = fBipFirstclass == null ? null : fBipFirstclass.trim();
    }

    public String getfBipSecondclass() {
        return fBipSecondclass;
    }

    public void setfBipSecondclass(String fBipSecondclass) {
        this.fBipSecondclass = fBipSecondclass == null ? null : fBipSecondclass.trim();
    }

    public String getfBipThirdclass() {
        return fBipThirdclass;
    }

    public void setfBipThirdclass(String fBipThirdclass) {
        this.fBipThirdclass = fBipThirdclass == null ? null : fBipThirdclass.trim();
    }
}