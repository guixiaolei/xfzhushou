package cn.kingcai.entity;

public class BipTProvincesynchroWithBLOBs extends BipTProvincesynchro {
    private String fBipRemarks;

    private String fBipDetailsevent;

    public String getfBipRemarks() {
        return fBipRemarks;
    }

    public void setfBipRemarks(String fBipRemarks) {
        this.fBipRemarks = fBipRemarks == null ? null : fBipRemarks.trim();
    }

    public String getfBipDetailsevent() {
        return fBipDetailsevent;
    }

    public void setfBipDetailsevent(String fBipDetailsevent) {
        this.fBipDetailsevent = fBipDetailsevent == null ? null : fBipDetailsevent.trim();
    }
}