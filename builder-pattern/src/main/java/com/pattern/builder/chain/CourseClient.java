package com.pattern.builder.chain;

/**
 * @author carzy.xu
 * @Title: CourseBuilder
 * @Package com.pattern.builder.simple
 * @Description: 建造者模式-Client 客户端，链式编程
 */
public class CourseClient {

    public static void main(String[] args) {

        // 链式编程，需要将builder返回，参考StringBuilder.append();
        CourseBuilder courseBuilder = new CourseBuilder()
                .addName("Java")
                .addInfo("建造者模式链式编程")
                .addPrice(100.00);

        System.out.println(courseBuilder.builder());
    }
}
