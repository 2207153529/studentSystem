package com.school.jopo;

public class Student {
    private Integer id;
    private String name;
    private String college;
    private String major;
    private String grade;
    private String StuClass;
    private String StuId;
    private String sex;

    public Student() {
    }

    public Student(Integer id, String name, String college, String major, String grade, String stuClass, String stuId, String sex) {
        this.id = id;
        this.name = name;
        this.college = college;
        this.major = major;
        this.grade = grade;
        StuClass = stuClass;
        StuId = stuId;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", college='" + college + '\'' +
                ", major='" + major + '\'' +
                ", grade='" + grade + '\'' +
                ", StuClass='" + StuClass + '\'' +
                ", StuId='" + StuId + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setStuClass(String stuClass) {
        StuClass = stuClass;
    }

    public void setStuId(String stuId) {
        StuId = stuId;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCollege() {
        return college;
    }

    public String getMajor() {
        return major;
    }

    public String getGrade() {
        return grade;
    }

    public String getStuClass() {
        return StuClass;
    }

    public String getStuId() {
        return StuId;
    }

    public String getSex() {
        return sex;
    }
}
