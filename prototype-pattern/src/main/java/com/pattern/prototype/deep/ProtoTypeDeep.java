package com.pattern.prototype.deep;

import lombok.Data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author carzy.xu
 * @Title: ProtoTypeDeep
 * @Package com.pattern.prototype.deep
 * @Description: 原型模式-深克隆
 */
@Data
public class ProtoTypeDeep implements Cloneable, Serializable {

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

    /**
     * 深克隆，通过序列化和反序列化，需要对该类实现序列化
     *
     * @return
     */
    public ProtoTypeDeep streamDeepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (ProtoTypeDeep) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 属于硬编码，对集合类型数据进行单独处理
     *
     * @return
     */
    public ProtoTypeDeep hobbiesDeepClone() {
        try {
            // ArrayList没有实现Cloneable接口，需要转成List
            ProtoTypeDeep protoTypeDeep = (ProtoTypeDeep) super.clone();
            protoTypeDeep.technologyList = (List) ((ArrayList) protoTypeDeep.technologyList).clone();
            return protoTypeDeep;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "ProtoTypeDeep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", info='" + info + '\'' +
                ", technologyList=" + technologyList +
                '}';
    }
}
