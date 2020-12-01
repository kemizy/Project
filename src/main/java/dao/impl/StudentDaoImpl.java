package dao.impl;

import dao.StudentDao;
import entity.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import utils.DBUtils;

import java.util.List;

/**
 * @author 枯墨竹
 * @date 2020/11/30
 **/
public class StudentDaoImpl implements StudentDao {
    JdbcTemplate jt = new JdbcTemplate(DBUtils.getDataResource());
    BeanPropertyRowMapper<Student> opr = new BeanPropertyRowMapper<>(Student.class);

    @Override
    public int addStudent(String username, String password) {
        return jt.update("insert into student values(?,?,?)", null, username, password);
    }

    @Override
    public int updateStudent(int id, String username, String password) {
        return jt.update("update student set username=?, password=? where id=? ", username, password, id);
    }

    @Override
    public int deleteStudent(String username, String password) {
        return jt.update("delete from student where username=? and password=?", username, password);
    }

    @Override
    public List<Student> queryStudentById(int id) {
        return jt.query("select * from student where id=?", opr, id);
    }

    @Override
    public List<Student> queryStudentByNameAndPassword(String username,String password) {
        return jt.query("select * from student where username=? and password=?", opr, username,password);
    }

    @Override
    public List<Student> queryAllStudents() {
        return jt.query("select * from student ", opr);
    }

    @Override
    public Integer queryStudentsTotal() {
      return   jt.queryForObject("select count(*) from student", Integer.class);
    }
}
