package com.libra.design.patterns.prototype.code;

/**
 * Description: 内部元素
 *
 * @author sx
 * @date 2021-02-23
 */
public class Internal implements Cloneable {
    private String area;
    private Long code;

    public Internal(String area, Long code) {
        this.area = area;
        this.code = code;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    };

    @Override
    public String toString() {
        return "Internal{" +
                "area='" + area + '\'' +
                ", code=" + code +
                '}';
    }
}
