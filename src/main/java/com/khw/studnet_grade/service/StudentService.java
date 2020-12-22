package com.khw.studnet_grade.service;

import com.khw.studnet_grade.entity.Student;
import com.khw.studnet_grade.entity.StudentScore;
import com.khw.studnet_grade.entity.TeacherStudent;

import java.util.List;

public interface StudentService {
    public List<Student> selectByPrimaryKey(Integer[] sno);
    public boolean updateByPrimaryKey(Student student);
    public boolean deleteByExample(Integer[] sno);
    public boolean insertSelective(Student student);
    public List<Student> selectByExample(String sname);
    public List<StudentScore> selectBysnoScores(Integer[] sno);
    public TeacherStudent SelectTeacherBysname(String tname);
}
