package com.khw.studnet_grade.Test;


import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName: Test2
 * @Description: TODO
 * @author: kanghongwei
 * @date: 2020/12/14  14:21
 */
public class Test2 {
    public static void main(String[] args) {
        //创建集合

        Collection c = new ArrayList();
        //创建Integer类型对象
        Integer i1 = new Integer(10);
        //添加元素
        c.add(i1);
        //判断集合中是否包含i1
        System.out.println(c.contains(i1));//true

        Integer i2 = new Integer(10);
        System.out.println(c.contains(i2));//true

        Manager m1 = new Manager(100, "JACK");
        c.add(m1);
        //contasins方法调用底层的是equals方法，如果equals方法返回True，就是包含
        System.out.println(c.contains(m1));//true

        Manager m2 = new Manager(100, "JACK");
//        c.add(m2);
        //重写equas方法之前返回false，（比较内存地址）
        System.out.println(c.contains(m2));//false
        //重写equas方法之后返回True，集合中的对象都要重写equalos方法（比较内容）
//        System.out.println(c.contains(m2));//true

    }
}