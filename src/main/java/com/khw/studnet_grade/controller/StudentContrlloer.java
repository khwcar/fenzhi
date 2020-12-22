package com.khw.studnet_grade.controller;

import com.alibaba.fastjson.JSON;
import com.khw.studnet_grade.entity.*;
import com.khw.studnet_grade.service.CoursesService;
import com.khw.studnet_grade.service.StudentService;
import com.khw.studnet_grade.service.TestService;
import com.khw.studnet_grade.util.APIResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/student")
public class StudentContrlloer {
    @Autowired
    StudentService studentService;
    @Autowired
    CoursesService coursesService;
    @Autowired
    TestService testService;
    @PostMapping("selectByPrimaryKey")
    public APIResult<List<Student>> selectByPrimaryKey(@RequestBody Integer[] sno){
        log.info("接收参数:{}",sno);
        long beginTime = System.currentTimeMillis();
        List<Student> students = studentService.selectByPrimaryKey(sno);
        APIResult result = new APIResult("0000", "成功", students);
        log.info("查询结果成功，返回结果:{}，耗时：【{}】毫秒", JSON.toJSONString(result), System.currentTimeMillis() - beginTime);
        return result;
    }

    @PostMapping("/updateByPrimaryKey")
    public APIResult<String> updateByPrimaryKey(@RequestBody Student student){
        log.info("接收参数:{}",student);
        long beginTime = System.currentTimeMillis();
        boolean b = studentService.updateByPrimaryKey(student);
        APIResult result = null;
        if (b){
            result = new APIResult("0000", "成功", "修改本次数据成功,修改学生学号为：" + student.getSno());
            log.info("修改结果成功，返回结果:{}，耗时：【{}】毫秒", JSON.toJSONString(result), System.currentTimeMillis() - beginTime);
            return result;
        }
        result = new APIResult("4444", "失败", "修改本次数据失败,修改失败的学生学号为：" + student.getSno());
        log.error("修改结果失败，返回结果:{}，耗时：【{}】毫秒", JSON.toJSONString(result), System.currentTimeMillis() - beginTime);
        return result;
    }

    @PostMapping("/deleteByExample")
    public APIResult<String> deleteByExample(@RequestBody Integer[] sno){
        log.info("接收参数:{}",sno);
        long beginTime = System.currentTimeMillis();
        boolean b = studentService.deleteByExample(sno);
        APIResult result;
        if (b){
            result = new APIResult("0000", "成功", "删除本次数据成功,删除学号为："+sno);
            log.info("删除结果成功，返回结果:{}，耗时：【{}】毫秒", JSON.toJSONString(result), System.currentTimeMillis() - beginTime);
            return result;
        }
        result = new APIResult("4444", "失败", "删除本次数据失败，失败删除学号为："+sno);
        log.error("删除结果失败，返回结果:{}，耗时：【{}】毫秒", JSON.toJSONString(result), System.currentTimeMillis() - beginTime);
        return result;
    }

    @PostMapping("/insertSelective")
    public APIResult<String> insertSelective(@RequestBody Student student){
        log.info("接收参数：{}",JSON.toJSONString(student));
        long beginTime = System.currentTimeMillis();
        boolean b = studentService.insertSelective(student);
        APIResult result;
        if (b){
            result = new APIResult("0000", "成功", "插入本次数据成功,插入学号为："+student.getSno());
            log.info("插入结果成功，返回结果:{}，耗时：【{}】毫秒", JSON.toJSONString(result), System.currentTimeMillis() - beginTime);
            return result;
        }
        result = new APIResult("4444", "失败", "删除本次数据失败，失败删除学号为："+student.getSno());
        log.error("插入结果失败，返回结果:{}，耗时：【{}】毫秒", JSON.toJSONString(result), System.currentTimeMillis() - beginTime);
        return result;
    }

    @PostMapping("/selectByExample")
    public APIResult<List<Student>> selectByExample(String sname){
        log.info("接收参数：{}",sname);
        long beginTime = System.currentTimeMillis();
        List<Student> students = studentService.selectByExample(sname);
        APIResult result;
        if (students!=null||students.size()!=0){
            result = new APIResult("0000", "成功", "本次查询数据成功,查询的姓名为："+sname);
            log.info("查询结果成功，返回结果:{}，耗时：【{}】毫秒", JSON.toJSONString(result), System.currentTimeMillis() - beginTime);
            return result;
        }
        result = new APIResult("4444", "失败", "本次查询数据失败，失败查询姓名为："+sname);
        log.error("查询结果失败，返回结果:{}，耗时：【{}】毫秒", JSON.toJSONString(result), System.currentTimeMillis() - beginTime);
        return result;
    }
    @GetMapping("/selectBysnoScores")
        public APIResult<List<StudentScore>> selectBysnoScores(Integer[] p){
        log.info("接收参数：{}",p);
        long beginTime = System.currentTimeMillis();
        List<StudentScore> studentScores = studentService.selectBysnoScores(p);
        APIResult result;
        if (studentScores!=null||studentScores.size()!=0){
            result = new APIResult("0000", "成功", studentScores);
            log.info("查询结果成功，返回结果:{}，耗时：【{}】毫秒", JSON.toJSONString(result), System.currentTimeMillis() - beginTime);
            return result;
        }
        result = new APIResult("4444", "失败", studentScores);
        log.error("查询结果失败，返回结果:{}，耗时：【{}】毫秒", JSON.toJSONString(result), System.currentTimeMillis() - beginTime);
        return result;
    }
    @PostMapping("/SelectTeacherBycname")
    public APIResult<Courses> SelectTeacherBycname(String name){
        log.info("接收参数：{}",name);
        long beginTime = System.currentTimeMillis();
        Courses courses1 = coursesService.SelectTeacherBycname(name);
        APIResult result;
        if (courses1!=null){
            result = new APIResult("0000","成功",courses1);
            log.info("查询结果成功，返回结果:{}，耗时：【{}】毫秒", JSON.toJSONString(result), System.currentTimeMillis() - beginTime);
            return result;
        }else {
            result = new APIResult("4444", "失败", courses1);
            log.error("查询结果失败，返回结果:{}，耗时：【{}】毫秒", JSON.toJSONString(result), System.currentTimeMillis() - beginTime);
            return result;
        }
    }
    @PostMapping("/SelectTeacherBysname")
    public APIResult SelectTeacherBysname(String sname){
        TeacherStudent teacherStudent = studentService.SelectTeacherBysname(sname);
        long l = System.currentTimeMillis();
        APIResult result;
        if (teacherStudent!=null){
            result = new APIResult("0000","成功",teacherStudent);
            log.info("查询结果成功，返回结果:{}，耗时：【{}】毫秒", JSON.toJSONString(result), System.currentTimeMillis() - l);
            return result;
        }else {
            result = new APIResult("4444","失败",null);
            log.info("查询结果失败，返回结果:{}，耗时：【{}】毫秒", JSON.toJSONString(result), System.currentTimeMillis() - l);
            return result;
        }
    }
    @PostMapping("/SelectByAllStudentCourse")
    public APIResult SelectByAllStudentCourse(@RequestBody List<Integer> sno){
        List<StudentMark> studentMarks = testService.SelectByAllStudentCourse(sno);
        long l = System.currentTimeMillis();
        APIResult result;
        if (studentMarks!=null){
            result = new APIResult("0000","成功",studentMarks);
            log.info("查询结果成功，返回结果:{}，耗时：【{}】毫秒", JSON.toJSONString(result), System.currentTimeMillis() - l);
            return result;
        }else {
            result = new APIResult("4444","失败",null);
            log.info("查询结果失败，返回结果:{}，耗时：【{}】毫秒", JSON.toJSONString(result), System.currentTimeMillis() - l);
            return result;
        }
    }
    @PostMapping("/selectBysnoBycno")
    public APIResult selectBysnoBycno(@RequestBody Map map){
        List<StudentMark> studentMarks = testService.selectBysnoBycno(map);
        long l = System.currentTimeMillis();
        APIResult result;
        if (studentMarks!=null){
            result = new APIResult("0000","成功",studentMarks);
            log.info("查询结果成功，返回结果:{}，耗时：【{}】毫秒", JSON.toJSONString(result), System.currentTimeMillis() - l);
            return result;
        }else {
            result = new APIResult("4444","失败",null);
            log.info("查询结果失败，返回结果:{}，耗时：【{}】毫秒", JSON.toJSONString(result), System.currentTimeMillis() - l);
            return result;
        }
    }
}
