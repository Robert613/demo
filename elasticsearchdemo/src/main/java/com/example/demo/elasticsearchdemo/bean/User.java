package com.example.demo.elasticsearchdemo.bean;

import java.util.Arrays;
import java.util.List;

public class User {
    private String studentNo;

    private  String name;

    private  String male;

    private  int age;

    private  String birthday;

    private  int classNo;

    private  String address;

    private  boolean isLeader;

    private List<String> tags;

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getClassNo() {
        return classNo;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isLeader() {
        return isLeader;
    }

    public void setLeader(boolean leader) {
        isLeader = leader;
    }

    public List<String> getTags() {
        return tags;
    }

    private  String tag ;

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public User(String studentNo, String name) {
        this.studentNo = studentNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "studentNo='" + studentNo + '\'' +
                ", name='" + name + '\'' +
                ", male='" + male + '\'' +
                ", age=" + age +
                ", birthday='" + birthday + '\'' +
                ", classNo=" + classNo +
                ", address='" + address + '\'' +
                ", isLeader=" + isLeader +
                ", tags=" + tags +
                '}';
    }
}
