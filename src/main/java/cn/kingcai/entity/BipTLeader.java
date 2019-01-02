package cn.kingcai.entity;

public class BipTLeader {
    private Integer fid;

    private Integer fentryid;

    private Integer fseq;

    private Long fBipDirectorname;

    private String fBipDtel;

    private String fBipPost;

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

    public Long getfBipDirectorname() {
        return fBipDirectorname;
    }

    public void setfBipDirectorname(Long fBipDirectorname) {
        this.fBipDirectorname = fBipDirectorname;
    }

    public String getfBipDtel() {
        return fBipDtel;
    }

    public void setfBipDtel(String fBipDtel) {
        this.fBipDtel = fBipDtel == null ? null : fBipDtel.trim();
    }

    public String getfBipPost() {
        return fBipPost;
    }

    public void setfBipPost(String fBipPost) {
        this.fBipPost = fBipPost == null ? null : fBipPost.trim();
    }
}