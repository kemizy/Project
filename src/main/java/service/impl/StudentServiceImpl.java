package service.impl;

import dao.StudentDao;
import dao.impl.StudentDaoImpl;
import entity.Student;
import service.StudentService;

import java.util.List;

/**
 * @author Administrator
 * @date 2020/12/1
 **/
public class StudentServiceImpl implements StudentService {
    StudentDao sd = new StudentDaoImpl();

    @Override
    public List<Student> StudentLogin(String username, String password) {
        return sd.queryStudentByNameAndPassword(username, password);
    }

    @Override
    public int deleteStudent(String username, String password) {
       return sd.deleteStudent(username, password);
    }
}
