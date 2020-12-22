package com.khw.studnet_grade.service.serviceimpl;

import com.khw.studnet_grade.dao.CoursesDao;
import com.khw.studnet_grade.entity.Courses;
import com.khw.studnet_grade.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 阿伟
 * @version 1.0
 * @date 2020/12/12 11:14
 */
@Service
public class CoursesServiceImpl implements CoursesService {
    @Autowired
    CoursesDao coursesDao;
    @Override

    public Courses SelectTeacherBycname(String cname) {
        return coursesDao.SelectTeacherBycname(cname);
    }

}
