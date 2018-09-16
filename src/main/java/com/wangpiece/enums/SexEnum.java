package com.wangpiece.enums;

public enum SexEnum {
    MAN(1, "男"),
    WOMAN(2, "女");

    private int type;
    private String name;

    SexEnum(int type, String name) {
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
