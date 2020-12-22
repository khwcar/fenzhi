package com.khw.studnet_grade.service;

import com.khw.studnet_grade.entity.Courses;

/**
 * @author 阿伟
 * @version 1.0
 * @date 2020/12/12 11:13
 */
public interface CoursesService {
    public Courses SelectTeacherBycname(String cname);

}
