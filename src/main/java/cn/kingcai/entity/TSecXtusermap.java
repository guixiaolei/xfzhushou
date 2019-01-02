package cn.kingcai.entity;

public class TSecXtusermap {
    private Long fid;

    private String fopenid;

    private String fphone;

    private String fusername;

    private String fbelongdept;

    private String fposition;

    private String femail;

    private Integer fuserid;

    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public String getFopenid() {
        return fopenid;
    }

    public void setFopenid(String fopenid) {
        this.fopenid = fopenid == null ? null : fopenid.trim();
    }

    public String getFphone() {
        return fphone;
    }

    public void setFphone(String fphone) {
        this.fphone = fphone == null ? null : fphone.trim();
    }

    public String getFusername() {
        return fusername;
    }

    public void setFusername(String fusername) {
        this.fusername = fusername == null ? null : fusername.trim();
    }

    public String getFbelongdept() {
        return fbelongdept;
    }

    public void setFbelongdept(String fbelongdept) {
        this.fbelongdept = fbelongdept == null ? null : fbelongdept.trim();
    }

    public String getFposition() {
        return fposition;
    }

    public void setFposition(String fposition) {
        this.fposition = fposition == null ? null : fposition.trim();
    }

    public String getFemail() {
        return femail;
    }

    public void setFemail(String femail) {
        this.femail = femail == null ? null : femail.trim();
    }

    public Integer getFuserid() {
        return fuserid;
    }

    public void setFuserid(Integer fuserid) {
        this.fuserid = fuserid;
    }
}