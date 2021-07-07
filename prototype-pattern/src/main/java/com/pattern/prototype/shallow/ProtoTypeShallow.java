package com.pattern.prototype.shallow;

import lombok.Data;

import java.util.List;

/**
 * @author carzy.xu
 * @Title: ProtoTypeShallowDemo
 * @Package com.pattern.prototype
 * @Description: 原型模式-浅克隆
 */
@Data
public class ProtoTypeShallow implements Cloneable {

    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 信息
     */
    private String info;
    /**
     * 技术栈
     */
    private List<String> technologyList;

    @Override
    public ProtoTypeShallow clone() {
        try {
            ProtoTypeShallow clone = (ProtoTypeShallow) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "ProtoTypeShallow{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", info='" + info + '\'' +
                ", technologyList=" + technologyList +
                '}';
    }
}
