package com.khw.studnet_grade;

import com.khw.studnet_grade.entity.*;
import com.khw.studnet_grade.service.CoursesService;
import com.khw.studnet_grade.service.StudentService;
import com.khw.studnet_grade.service.TestService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
class StudnetGradeApplicationTests {
    @Autowired
    StudentService studentService;
    @Autowired
    CoursesService coursesService;
    @Autowired
    TestService testService;
    @Test
   void test1(){
        Integer[] sno = new Integer[]{1,2,3,4};
        List<Student> students = studentService.selectByPrimaryKey(sno);
        System.out.println(students);
    }
    @Test
    void test2(){
        Student student = new Student(1,"张张","20","15383439940");
        boolean b = studentService.updateByPrimaryKey(student);
        if (b){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
    }
    @Test
    void test3(){
        Integer[] sno = new Integer[]{5};
        boolean b = studentService.deleteByExample(sno);
        if (b){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
    }
    @Test
    void test4(){
        Student student = new Student(5,"汪汪","30","15415154545");
        boolean b = studentService.insertSelective(student);
        if (b){
            System.out.println("插入数据成功");
        }else {
            System.out.println("插入数据失败");
        }
    }
    @Test
    void test5(){
        String sname = "旺旺w";
        List<Student> students = studentService.selectByExample(sname);
        if (students==null||students.size()==0){
            System.out.println("没有该学号的学生");
        }else {
            System.out.println("该学号的学生为："+students);
        }
    }
    @Test
    void test6(){
        Integer[] snos = new Integer[]{1,2,3,4,5};
        List<StudentScore> studentScores = studentService.selectBysnoScores(snos);
        if (studentScores.size()==0){
            System.out.println("没有查到对性学号的学生");
        }else {
            System.out.println("查询到该学生的成绩："+studentScores);
        }
    }
    @Test
    void test7(){
        String cname = "数学";
        Courses courses = coursesService.SelectTeacherBycname(cname);
        System.out.println(courses);
    }
    @Test
    void test8(){
        String tname = "张三";
        TeacherStudent teacherByStudent = studentService.SelectTeacherBysname(tname);
        System.out.println(teacherByStudent);
    }
    @Test
    void test9(){
        List<Integer> sno = new ArrayList<>();
        sno.add(1);
        sno.add(2);
        sno.add(3);
        List<StudentMark> studentMarks = testService.SelectByAllStudentCourse(sno);
        System.out.println(studentMarks);
    }
    @Test
    void test10(){
        Map<String,Object> map = new HashMap<>();
        map.put("sno",1);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        map.put("cno",list);
        List<StudentMark> studentMarks = testService.selectBysnoBycno(map);
        System.out.println(studentMarks);
    }
}
