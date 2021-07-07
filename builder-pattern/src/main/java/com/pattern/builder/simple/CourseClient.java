package com.pattern.builder.simple;

/**
 * @author carzy.xu
 * @Title: CourseBuilder
 * @Package com.pattern.builder.simple
 * @Description: 建造者模式-Client 客户端
 */
public class CourseClient {

    public static void main(String[] args) {

        CourseBuilder courseBuilder = new CourseBuilder();
        courseBuilder.addName("Java");
        courseBuilder.addInfo("建造者模式普通");
        courseBuilder.addPrice(100.00);

        System.out.println(courseBuilder.builder());
    }
}
