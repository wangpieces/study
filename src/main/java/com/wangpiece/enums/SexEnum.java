package com.wangpiece.enums;

public enum SexEnum implements BaseEnum{
    MAN(1, "男"),
    WOMAN(2, "女");

    private Integer type;
    private String name;
    SexEnum(Integer type, String name) {
        this.type = type;
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public String getName() {
        return name;
    }

}
