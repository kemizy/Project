package utils;

import dao.StudentDao;
import dao.impl.StudentDaoImpl;
import entity.PageResult;
import entity.Student;

/**
 * @author 枯墨竹
 * @date 2020/12/1
 **/
public class JsonCase {
    public static PageResult<Student> getStudentJsonCase() {
        PageResult<Student> spr = new PageResult<>();
        StudentDao sd = new StudentDaoImpl();
        spr.setCode(0);
        spr.setMsg("");
        spr.setCount(sd.queryStudentsTotal());
        spr.setData(sd.queryAllStudents());
        return spr;
    }
}
