package com.khw.studnet_grade.mapper;

import com.khw.studnet_grade.entity.Courses;
import com.khw.studnet_grade.entity.StudentScore;
import com.khw.studnet_grade.entity.TeacherStudent;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface StudentScoreMapper {
    public StudentScore selectBysnoScores(Integer sno);
    public Courses SelectTeacherBycname(String cname);
    public TeacherStudent SelectTeacherBysname(String tname);
}
