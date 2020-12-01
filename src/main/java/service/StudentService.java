package service;

import entity.Student;

import java.util.List;

/**
 * @author Administrator
 * @date 2020/12/1
 **/
public interface StudentService {
    List<Student> StudentLogin(String username, String password);
    int deleteStudent(String username, String password);
}
