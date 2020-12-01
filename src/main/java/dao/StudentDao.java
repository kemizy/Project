package dao;

import entity.Student;

import java.sql.ResultSet;
import java.util.List;

/**
 * @author 枯墨竹
 * @date 2020/11/30
 **/
public interface StudentDao {
    //添加学生信息
    int addStudent(String username, String password);

    //修改学生信息
    int updateStudent(int id, String username, String password);

    //删除学生信息
    int deleteStudent(String username, String password);

    //根据id查询学生信息
    List<Student> queryStudentById(int id);

    //根据用户名和密码查询学生信息
    List<Student> queryStudentByNameAndPassword(String username, String password);

    //查询所有学生信息
    List<Student> queryAllStudents();

    //查询学生总人数
    Integer queryStudentsTotal();


}
