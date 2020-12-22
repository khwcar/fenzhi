package com.khw.studnet_grade.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.khw.studnet_grade.entity.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Test7
 * @Description: json序列化，java转json
 * @author: kanghongwei
 * @date: 2020/12/14  15:12
 */
public class Test7 {
    public static void main(String[] args) throws JsonProcessingException {
        Student student = new Student();
        student.setSname("张三");
        student.setPhone("1234561454");
        student.setSage("20");
        student.setSno(12121);
        System.out.println(student);
        ObjectMapper mapper = new ObjectMapper();
        //将user转化为json
        String s = mapper.writeValueAsString(student);
        System.out.println(s);
        List<Student> students = new ArrayList<>();
        students.add(student);
        String s1 = mapper.writeValueAsString(students);
        System.out.println(s1);
    }
}
