package com.khw.studnet_grade.service.serviceimpl;

import com.khw.studnet_grade.dao.StudentDao;
import com.khw.studnet_grade.entity.Student;
import com.khw.studnet_grade.entity.StudentScore;
import com.khw.studnet_grade.entity.TeacherStudent;
import com.khw.studnet_grade.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDao studentDao;
    @Override
    public List<Student> selectByPrimaryKey(Integer[] sno){
        return studentDao.selectByPrimaryKey(sno);
    }

    @Override
    public boolean updateByPrimaryKey(Student student) {
        return studentDao.updateByPrimaryKey(student);
    }

    @Override
    public boolean deleteByExample(Integer[] sno) {
        return studentDao.deleteByExample(sno);
    }

    @Override
    public boolean insertSelective(Student student) {
        return studentDao.insertSelective(student);
    }

    @Override
    public List<Student> selectByExample(String sname) {
        return studentDao.selectByExample(sname);

    }

    @Override
    public List<StudentScore> selectBysnoScores(Integer[] sno) {
        return studentDao.selectBysnoScores(sno);
    }
    @Override
    public TeacherStudent SelectTeacherBysname(String tname) {
        return studentDao.SelectTeacherBysname(tname);
    }
}
