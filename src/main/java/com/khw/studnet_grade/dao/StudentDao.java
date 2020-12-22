package com.khw.studnet_grade.dao;

import com.khw.studnet_grade.entity.Student;
import com.khw.studnet_grade.entity.StudentExample;
import com.khw.studnet_grade.entity.StudentScore;
import com.khw.studnet_grade.entity.TeacherStudent;
import com.khw.studnet_grade.mapper.StudentMapper;
import com.khw.studnet_grade.mapper.StudentScoreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class StudentDao {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private StudentScoreMapper studentScoreMapper;
    /**
     * 根据学号查询学生的信息
     * @param sno
     * @return
     */
    public List<Student> selectByPrimaryKey(Integer[] sno){
        List<Student> students = new ArrayList<>();
        for (Integer snos:sno){
            Student student = studentMapper.selectByPrimaryKey(snos);
            students.add(student);
        }
        return students;
    }

    /**
     * 修改学生的信息
     * @param student
     * @return
     */
    public boolean updateByPrimaryKey(Student student){
        if (null == student){
            return false;
        }
        int i = studentMapper.updateByPrimaryKey(student);
        return i>0;
    }

    /**
     * 批量删除学生的信息
     * @param sno
     * @return
     */
    public boolean deleteByExample(Integer[] sno){
        int i = 0;
        if (sno == null && sno.length == 0) {
            return false;
        }
        //用数组初始化list
        List<Integer> integers = Arrays.asList(sno);
        //根据条件删除（delete from student where sno=snos）读音yikezanpo
        StudentExample example = new StudentExample();
        StudentExample.Criteria criteria = example.createCriteria();
        criteria.andSnoIn(integers);
        i = studentMapper.deleteByExample(example);
        return i > 0;
    }

    /**
     * 插入学生数据
     * @param student
     * @return
     */
    public boolean insertSelective(Student student){
        if (null==student){
            return false;
        }
        if (student.getPhone().length()!=11){
            return false;
        }
        int i = studentMapper.insertSelective(student);
        return i>0;
    }

    /**
     * 根据姓名查询该学生
     * @param sname
     * @return
     */
    public List<Student> selectByExample(String sname){
        StudentExample example = new StudentExample();
        StudentExample.Criteria criteria = example.createCriteria();
        criteria.andSnameEqualTo(sname);
        List<Student> students = studentMapper.selectByExample(example);
        return students;
    }

    /**
     * 根据学号获取该学生所选择的课程和成绩
     * @param sno
     * @return
     */
    public List<StudentScore> selectBysnoScores(Integer[] sno){
        List<StudentScore> studentScores = new ArrayList<>();
        for (Integer snos:sno){
            StudentScore studentScore = studentScoreMapper.selectBysnoScores(snos);
            studentScores.add(studentScore);
        }
        return studentScores;
    }

    /**
     * 根据老师的名字查询对应该老师的学生
     * @param tname
     * @return
     */
    public TeacherStudent SelectTeacherBysname(String tname){
        return studentScoreMapper.SelectTeacherBysname(tname);
    }
}
