package com.wangpiece.dto;

import java.util.Date;

public class Department extends BaseDto{

    private String name;
    private Date creteTime;

    public Department() {
    }

    public Department(String name, Date creteTime) {
        this.name = name;
        this.creteTime = creteTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreteTime() {
        return creteTime;
    }

    public void setCreteTime(Date creteTime) {
        this.creteTime = creteTime;
    }
}
