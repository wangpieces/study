package com.wangpiece.enums;

public enum CommonEnum{

    YES(1, "是"),
    NO(2, "否");

    private int type;
    private String name;

    CommonEnum(int type, String name) {
        this.type = type;
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
