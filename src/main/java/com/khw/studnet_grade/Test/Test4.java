package com.khw.studnet_grade.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Test4
 * @Description: TODO
 * @author: kanghongwei
 * @date: 2020/12/14  14:35
 */

/**
   * ArrayList底层集合是数组
   * ArrayList默认容量是10，扩容后的新容量是原容量的1.5倍
   * vector集合底层默认初始容量是10，扩容后是原容量的2倍。
   * 如果优化ArrayList和Vector？
   * 尽量减少扩容操作，扩容需要拷贝数组，拷贝很消耗内存，一般在创建集合时指定初始化
  */
public class Test4 {
    public static void main(String[] args) {
        //创建list集合
        List l = new ArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(1,1000);
        System.out.println(l.get(0));
        System.out.println("------------------------");
        System.out.println(l.get(1));
        for (int i=0;i<l.size();i++){
            Object element = l.get(i);
            System.out.println(element);
        }
    }
}
