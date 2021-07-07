package com.pattern.prototype.shallow;

import java.util.ArrayList;
import java.util.List;

/**
 * @author crazy.xu
 * @Title: ProtoTypeShallowTest
 * @Package com.pattern.prototype.shallow
 * @Description: 原型模式-浅克隆测试类
 */
public class ProtoTypeShallowTest {

    public static void main(String[] args) {

        // 浅克隆：创建一个新对象，新对象的属性和原来对象完全相同，对于非基本类型（List、Map等）属性，仍指向原有属性所指向的对象的内存地址。拷贝引用。
        ProtoTypeShallow protoTypeShallow = new ProtoTypeShallow();
        protoTypeShallow.setName("小明");
        protoTypeShallow.setAge(22);
        protoTypeShallow.setInfo("我是小明，你好啊~");
        List<String> technologyList = new ArrayList<>();
        technologyList.add("Java");
        technologyList.add("C++");
        protoTypeShallow.setTechnologyList(technologyList);

        ProtoTypeShallow protoTypeShallowClone = protoTypeShallow.clone();
        protoTypeShallowClone.setName("小亮");
        protoTypeShallowClone.setAge(18);
        protoTypeShallowClone.getTechnologyList().add("Go");

        System.out.println("原型对象：" + protoTypeShallow.toString());
        System.out.println("克隆对象：" + protoTypeShallowClone.toString());
        System.out.println("比较对象：" + (protoTypeShallow == protoTypeShallowClone));
        System.err.println("会发现对于非基本类型，调用的是引用地址，更新时，原对象也会更新。");
        System.out.println("比较技术：" + (protoTypeShallow.getTechnologyList() == protoTypeShallowClone.getTechnologyList()));

    }
}
