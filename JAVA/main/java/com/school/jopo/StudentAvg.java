package com.school.jopo;

public class StudentAvg {
    private String college;
    private String major;
    private String man;
    private String manNum;
    private String girl;
    private String girlNum;
    private String classAvg;

    public StudentAvg() {
    }

    public StudentAvg(String college, String major, String man, String manNum, String girl, String girlNum, String classAvg) {
        this.college = college;
        this.major = major;
        this.man = man;
        this.manNum = manNum;
        this.girl = girl;
        this.girlNum = girlNum;
        this.classAvg = classAvg;
    }

    @Override
    public String toString() {
        return "StudentAvg{" +
                "college='" + college + '\'' +
                ", major='" + major + '\'' +
                ", man='" + man + '\'' +
                ", manNum='" + manNum + '\'' +
                ", girl='" + girl + '\'' +
                ", girlNum='" + girlNum + '\'' +
                ", classAvg='" + classAvg + '\'' +
                '}';
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMan() {
        return man;
    }

    public void setMan(String man) {
        this.man = man;
    }

    public String getManNum() {
        return manNum;
    }

    public void setManNum(String manNum) {
        this.manNum = manNum;
    }

    public String getGirl() {
        return girl;
    }

    public void setGirl(String girl) {
        this.girl = girl;
    }

    public String getGirlNum() {
        return girlNum;
    }

    public void setGirlNum(String girlNum) {
        this.girlNum = girlNum;
    }

    public String getClassAvg() {
        return classAvg;
    }

    public void setClassAvg(String classAvg) {
        this.classAvg = classAvg;
    }
}
