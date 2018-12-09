package com.wangpiece.dto;

/**
 * @author wang.xu
 * @desc
 * @date 2018-12-09 0:10
 */
public class Wealth {
    private Integer number;
    private String seBoStr;
    private String evenStr;
    private String trailStr;
    private String result;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getSeBoStr() {
        return seBoStr;
    }

    public void setSeBoStr(String seBoStr) {
        this.seBoStr = seBoStr;
    }

    public String getEvenStr() {
        return evenStr;
    }

    public void setEvenStr(String evenStr) {
        this.evenStr = evenStr;
    }

    public String getTrailStr() {
        return trailStr;
    }

    public void setTrailStr(String trailStr) {
        this.trailStr = trailStr;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Wealth{" +
                "number=" + number +
                ", seBoStr='" + seBoStr + '\'' +
                ", evenStr='" + evenStr + '\'' +
                ", trailStr='" + trailStr + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
