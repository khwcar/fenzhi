package com.khw.studnet_grade.Test;

import java.util.Objects;

/**
 * @ClassName: Employee
 * @Description: TODO
 * @author: kanghongwei
 * @date: 2020/12/14  14:48
 */
public class Employee {
    String no;
    String name;

    Employee(String no, String name) {
        this.no = no;
        this.name = name;
    }

/*    @Override
    //重写equals方法，如果员工编号相同，并且名字相同，则是同一个对象
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Employee) {
            Employee e = (Employee) o;
            return e.no.equals(this.no) && e.name.equals(this.name);
        }
        return false;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(no, employee.no) &&
                Objects.equals(name, employee.name);
    }

    //重写hashCode方法
    public int hashCode() {
        return no.hashCode();
    }
}
