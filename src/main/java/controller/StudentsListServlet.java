package controller;

import entity.PageResult;
import entity.Student;
import utils.JsonCase;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @author 枯墨竹
 * @date 2020/12/1
 **/
//获取学生列表信息转化为json格式传给页面接口
@WebServlet("/StudentsListServlet")
public class StudentsListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PageResult<Student> jsc = JsonCase.getStudentJsonCase();
        ServletOutputStream os = resp.getOutputStream();
        os.print(jsc.toString());
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

}
