package com.wangpiece.enums;

public enum CommonEnum implements BaseEnum{

    YES(1, "是"),
    NO(2, "否");

    private Integer type;
    private String name;

    CommonEnum(Integer type, String name) {
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
