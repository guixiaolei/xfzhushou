package cn.kingcai.entity;

public class BipTSynchropluginlog {
    private Long fpkid;

    private String fcreatedate;

    private String fresult;

    public Long getFpkid() {
        return fpkid;
    }

    public void setFpkid(Long fpkid) {
        this.fpkid = fpkid;
    }

    public String getFcreatedate() {
        return fcreatedate;
    }

    public void setFcreatedate(String fcreatedate) {
        this.fcreatedate = fcreatedate == null ? null : fcreatedate.trim();
    }

    public String getFresult() {
        return fresult;
    }

    public void setFresult(String fresult) {
        this.fresult = fresult == null ? null : fresult.trim();
    }
}