package com.bsoft.entity;

import java.util.Date;

public class Testresult {
    private String sampleno;
    private String testid;
    private String testresult;
    private int teststatus = 0;
    private int correctflag;
    private String sampletype;
    private String reflo;
    private String refhi;
    private String deviceid;
    private Date measuretime = new Date();
    private String operator;
    private String hint;
    private String unit;
    private String labdepartment;
    private int isprint = 1;
    private String seqno;
    private long jgid = 0;
    private int stayhospitalmode;
    private String ws_testid;
    private String ws_ckfw;
    private int ws_isws;

    // Getters and Setters
    public String getSampleno() {
        return sampleno;
    }

    public void setSampleno(String sampleno) {
        this.sampleno = sampleno;
    }

    public String getTestid() {
        return testid;
    }

    public void setTestid(String testid) {
        this.testid = testid;
    }

    public String getTestresult() {
        return testresult;
    }

    public void setTestresult(String testresult) {
        this.testresult = testresult;
    }

    public int getTeststatus() {
        return teststatus;
    }

    public void setTeststatus(int teststatus) {
        this.teststatus = teststatus;
    }

    public int getCorrectflag() {
        return correctflag;
    }

    public void setCorrectflag(int correctflag) {
        this.correctflag = correctflag;
    }

    public String getSampletype() {
        return sampletype;
    }

    public void setSampletype(String sampletype) {
        this.sampletype = sampletype;
    }

    public String getReflo() {
        return reflo;
    }

    public void setReflo(String reflo) {
        this.reflo = reflo;
    }

    public String getRefhi() {
        return refhi;
    }

    public void setRefhi(String refhi) {
        this.refhi = refhi;
    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    public Date getMeasuretime() {
        return measuretime;
    }

    public void setMeasuretime(Date measuretime) {
        this.measuretime = measuretime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getLabdepartment() {
        return labdepartment;
    }

    public void setLabdepartment(String labdepartment) {
        this.labdepartment = labdepartment;
    }

    public int getIsprint() {
        return isprint;
    }

    public void setIsprint(int isprint) {
        this.isprint = isprint;
    }

    public String getSeqno() {
        return seqno;
    }

    public void setSeqno(String seqno) {
        this.seqno = seqno;
    }

    public long getJgid() {
        return jgid;
    }

    public void setJgid(long jgid) {
        this.jgid = jgid;
    }

    public int getStayhospitalmode() {
        return stayhospitalmode;
    }

    public void setStayhospitalmode(int stayhospitalmode) {
        this.stayhospitalmode = stayhospitalmode;
    }

    public String getWs_testid() {
        return ws_testid;
    }

    public void setWs_testid(String ws_testid) {
        this.ws_testid = ws_testid;
    }

    public String getWs_ckfw() {
        return ws_ckfw;
    }

    public void setWs_ckfw(String ws_ckfw) {
        this.ws_ckfw = ws_ckfw;
    }

    public int getWs_isws() {
        return ws_isws;
    }

    public void setWs_isws(int ws_isws) {
        this.ws_isws = ws_isws;
    }
}
