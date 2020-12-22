package com.khw.studnet_grade.Test;

/**
 * @ClassName: Manager
 * @Description: TODO
 * @author: kanghongwei
 * @date: 2020/12/14  14:23
 */
public class Manager {
    int no;
    String name;
    Manager(int no,String name)
    {
                this.no=no;
                this.name=name;
            }
    public boolean equals(Object o)
    {
                if(this==o) return true;
                if(o instanceof Manager)
                    {
                      Manager m = (Manager)o;
                      if(m.no == this.no && m.name.equals(this.name))
                            {
                              return true;
                            }
                    }
                return false;
            }
}
