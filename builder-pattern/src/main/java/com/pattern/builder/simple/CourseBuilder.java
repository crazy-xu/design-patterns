package com.pattern.builder.simple;


/**
 * @author carzy.xu
 * @Title: CourseBuilder
 * @Package com.pattern.builder.simple
 * @Description: 建造者模式-builder 类
 */
public class CourseBuilder {

    private Course course = new Course();

    public void addName(String name) {
        course.setName(name);
    }


    public void addInfo(String info) {
        course.setInfo(info);
    }

    public void addPrice(double price) {
        course.setPrice(price);
    }

    public Course builder() {
        return course;
    }

}
