package com.khw.studnet_grade.service.serviceimpl;

import com.khw.studnet_grade.dao.TestDao;
import com.khw.studnet_grade.entity.StudentMark;
import com.khw.studnet_grade.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: TestServiceImpl
 * @Description: TODO
 * @author: kanghongwei
 * @date: 2020/12/15  10:28
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao dao;
    @Override
    public List<StudentMark> SelectByAllStudentCourse(List sno) {
        return dao.SelectByAllStudentCourse(sno);
    }

    @Override
    public List<StudentMark> selectBysnoBycno(Map map) {
        return dao.selectBysnoBycno(map);
    }

}
