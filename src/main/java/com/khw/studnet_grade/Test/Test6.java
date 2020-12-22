package com.khw.studnet_grade.Test;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: Test6
 * @Description: TODO
 * @author: kanghongwei
 * @date: 2020/12/14  15:11
 */
public class Test6 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王武");
        System.out.println(list);
        Map<String,List<String>> map = new HashMap();
        map.put("学生信息:",list);
        System.out.println(JSON.toJSONString(map));
    }
}
