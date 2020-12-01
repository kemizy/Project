package dao.impl;

import entity.Student;
import junit.framework.TestCase;

import java.util.List;

/**
 * @author 枯墨竹
 * @date 2020/11/30
 **/
public class StudentDaoImplTest extends TestCase {
    StudentDaoImpl studentDao = new StudentDaoImpl();


    public void testAddStudent() {
        System.out.println(studentDao.addStudent("zs", "123"));
    }

    public void testUpdateStudent() {
        System.out.println(studentDao.updateStudent(2, "ls", "123"));
    }

    public void testDeleteStudent() {
        System.out.println(studentDao.deleteStudent("ls", "456"));
    }

    public void testQueryStudentById() {
        List<Student> students = studentDao.queryStudentById(2);
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void testQueryStudentByName() {
        List<Student> students = studentDao.queryStudentByNameAndPassword("admin","admin");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void testQueryAllStudents() {
        List<Student> students = studentDao.queryAllStudents();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void testQueryStudentsTotal() {
        System.out.println(studentDao.queryStudentsTotal());
    }
}