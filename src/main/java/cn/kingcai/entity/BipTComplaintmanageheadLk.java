package cn.kingcai.entity;

public class BipTComplaintmanageheadLk {
    private Long fid;

    private Long flinkid;

    private String fflowid;

    private Integer fflowlineid;

    private String fruleid;

    private Integer fstableid;

    private String fstablename;

    private String fsbillid;

    private String fsid;

    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public Long getFlinkid() {
        return flinkid;
    }

    public void setFlinkid(Long flinkid) {
        this.flinkid = flinkid;
    }

    public String getFflowid() {
        return fflowid;
    }

    public void setFflowid(String fflowid) {
        this.fflowid = fflowid == null ? null : fflowid.trim();
    }

    public Integer getFflowlineid() {
        return fflowlineid;
    }

    public void setFflowlineid(Integer fflowlineid) {
        this.fflowlineid = fflowlineid;
    }

    public String getFruleid() {
        return fruleid;
    }

    public void setFruleid(String fruleid) {
        this.fruleid = fruleid == null ? null : fruleid.trim();
    }

    public Integer getFstableid() {
        return fstableid;
    }

    public void setFstableid(Integer fstableid) {
        this.fstableid = fstableid;
    }

    public String getFstablename() {
        return fstablename;
    }

    public void setFstablename(String fstablename) {
        this.fstablename = fstablename == null ? null : fstablename.trim();
    }

    public String getFsbillid() {
        return fsbillid;
    }

    public void setFsbillid(String fsbillid) {
        this.fsbillid = fsbillid == null ? null : fsbillid.trim();
    }

    public String getFsid() {
        return fsid;
    }

    public void setFsid(String fsid) {
        this.fsid = fsid == null ? null : fsid.trim();
    }
}