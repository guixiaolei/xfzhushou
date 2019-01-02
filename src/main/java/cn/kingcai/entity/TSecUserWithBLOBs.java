package cn.kingcai.entity;

public class TSecUserWithBLOBs extends TSecUser {
    private String fsignet;

    private String ffaceimg;

    public String getFsignet() {
        return fsignet;
    }

    public void setFsignet(String fsignet) {
        this.fsignet = fsignet == null ? null : fsignet.trim();
    }

    public String getFfaceimg() {
        return ffaceimg;
    }

    public void setFfaceimg(String ffaceimg) {
        this.ffaceimg = ffaceimg == null ? null : ffaceimg.trim();
    }
}