package org.sawhers.altafhussain.bundleintent;

import java.io.Serializable;

/**
 * Created by ALTAFHUSSAIN on 12/25/2016.
 */

public class Student implements Serializable{

    int id;
    String name;
    String Course;
    int fee;

    public Student() {//ALT +insert and make defult constractor


    }
    //we need to make peramtarize constractor

    public Student(int id, String name, String course, int fee) {
        this.id = id;
        this.name = name;
        Course = course;
        this.fee = fee;
    }

    //now we need to seter and geter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }


    //now we need to make tostring method of these

    @Override
    public String toString() {
        return
                "id=" + id +
                "\n name=" + name +
                "\n Course" + Course +
                "\n fee=" + fee
                ;
    }
}
