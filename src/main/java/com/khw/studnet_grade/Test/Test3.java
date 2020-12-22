package com.khw.studnet_grade.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName: Test3
 * @Description: TODO
 * @author: kanghongwei
 * @date: 2020/12/14  14:32
 */
public class Test3 {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(100);
        l.add(20);
        l.add(40);
        l.add(400);
        Iterator it = l.iterator();
        while (it.hasNext()){
            Object element = it.next();
            System.out.println(element);
        }
    }
}
