package com.khw.studnet_grade.dao;

import com.khw.studnet_grade.entity.StudentMark;
import com.khw.studnet_grade.mapper.TesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: TestDao
 * @Description: TODO
 * @author: kanghongwei
 * @date: 2020/12/15  10:05
 */
@Component
public class TestDao {
    @Autowired
    TesMapper mapper;

    public List<StudentMark> SelectByAllStudentCourse(List sno){
        Map maps = new HashMap();
        maps.put("customerIds",sno);
        List<StudentMark> studentMarks = mapper.SelectByAllStudentCourse(maps);
        return studentMarks;
    }
    public List<StudentMark> selectBysnoBycno(Map map){
        List<StudentMark> studentMarks = mapper.selectBysnoBycno(map);
        return studentMarks;
    }
}
