package com.khw.studnet_grade.dao;

import com.khw.studnet_grade.entity.Courses;
import com.khw.studnet_grade.mapper.StudentScoreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 阿伟
 * @version 1.0
 * @date 2020/12/12 11:04
 */
@Component
public class CoursesDao {
    @Autowired
    StudentScoreMapper studentScoreMapper;

    /**
     * 根据课程名查询对应的老师信息
     * @param cname
     * @return
     */
    public Courses SelectTeacherBycname(String cname){
        return studentScoreMapper.SelectTeacherBycname(cname);
    }


}
