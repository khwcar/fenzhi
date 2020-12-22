package com.khw.studnet_grade.service;

import com.khw.studnet_grade.entity.StudentMark;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: TestService
 * @Description: TODO
 * @author: kanghongwei
 * @date: 2020/12/15  10:09
 */
public interface TestService {
    public List<StudentMark> SelectByAllStudentCourse(List sno);
    public List<StudentMark> selectBysnoBycno(Map map);
}
