package com.pattern.builder.simple;

import lombok.Data;

/**
 * @author carzy.xu
 * @Title: Course
 * @Package com.pattern.builder.simple
 * @Description: 建造者模式-简单
 */
@Data
public class Course {

    private String name;

    private String info;

    private double price;

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", info='" + info + '\'' +
                ", price=" + price +
                '}';
    }
}
