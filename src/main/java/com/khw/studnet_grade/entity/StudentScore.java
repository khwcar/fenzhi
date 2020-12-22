package com.khw.studnet_grade.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentScore {
    private Integer sno;
    private String sname;
    private List<Course> courses;

    @Override
    public String toString() {
        return "StudentScore{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                ", courses=" + courses +
                '}';
    }
}
