package com.pattern.builder.chain;


import com.pattern.builder.simple.Course;

/**
 * @author carzy.xu
 * @Title: CourseBuilder
 * @Package com.pattern.builder.simple
 * @Description: 建造者模式-builder 类
 */
public class CourseBuilder {

    private Course course = new Course();

    public CourseBuilder addName(String name) {
        course.setName(name);
        return this;
    }


    public CourseBuilder addInfo(String info) {
        course.setInfo(info);
        return this;
    }

    public CourseBuilder addPrice(double price) {
        course.setPrice(price);
        return this;
    }

    public Course builder() {
        return course;
    }

}
