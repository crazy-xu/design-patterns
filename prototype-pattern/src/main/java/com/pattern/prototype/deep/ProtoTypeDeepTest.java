package com.pattern.prototype.deep;

import java.util.ArrayList;
import java.util.List;

/**
 * @author carzy.xu
 * @Title: ProtoTypeDeepTest
 * @Package com.pattern.prototype.deep
 * @Description: 原型模式-深克隆测试类，通过序列化和反序列化进行克隆
 */
public class ProtoTypeDeepTest {

    public static void main(String[] args) {

        // 深克隆：创建一个新对象，属性中引用的其他对象也会被克隆，不在指向原有对象地址。拷贝值。
        ProtoTypeDeep protoTypeDeep = new ProtoTypeDeep();
        protoTypeDeep.setName("小明");
        protoTypeDeep.setAge(22);
        protoTypeDeep.setInfo("我在进行深克隆~");
        List<String> technologyDeepList = new ArrayList<>();
        technologyDeepList.add("Java");
        technologyDeepList.add("C++");
        protoTypeDeep.setTechnologyList(technologyDeepList);

        ProtoTypeDeep protoTypeDeepClone = protoTypeDeep.streamDeepClone();
        protoTypeDeepClone.setName("修改深克隆");
        protoTypeDeepClone.setAge(20);
        protoTypeDeepClone.getTechnologyList().add("Go");

        System.out.println("原型对象：" + protoTypeDeep.toString());
        System.out.println("克隆对象：" + protoTypeDeepClone.toString());
        System.out.println("比较对象：" + (protoTypeDeep == protoTypeDeepClone));
        System.err.println("创建一个新对象，会直接拷贝值，跟浅克隆区别是拷贝引用。");
        System.out.println("比较技术：" + (protoTypeDeep.getTechnologyList() == protoTypeDeepClone.getTechnologyList()));

        ProtoTypeDeep protoTypeDeep1 = protoTypeDeep.hobbiesDeepClone();
        System.out.println("克隆对象：" + protoTypeDeep1.toString());
        System.out.println("比较对象：" + (protoTypeDeep == protoTypeDeep1));
    }
}
