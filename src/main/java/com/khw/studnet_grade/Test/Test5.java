package com.khw.studnet_grade.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: Test5
 * @Description: TODO
 * @author: kanghongwei
 * @date: 2020/12/14  14:47
 */
public class Test5 {
    public static void main(String[] args) {
        //创建集合
                 Set es =new HashSet();
                 Employee e1 = new Employee("1000","u1");
                 Employee e2 = new Employee("1001","u2");
                 Employee e3 = new Employee("2000","u3");
                 Employee e4 = new Employee("2001","u4");
                 Employee e5 = new Employee("2001","u4");
                 es.add(e1);
                 es.add(e2);
                 es.add(e3);
                 es.add(e4);
                 es.add(e5);
               System.out.println(es.size());
    }
}
