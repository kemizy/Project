package controller;


import entity.Student;
import org.apache.commons.beanutils.BeanUtils;
import service.StudentService;
import service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * @author 枯墨竹
 * @date 2020/11/30
 **/
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentService ss = new StudentServiceImpl();
        String name = req.getParameter("username");
        String password = req.getParameter("password");
        Student student = new Student();
        if (ss.StudentLogin(name, password).size() == 0) {
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        } else {
            try {
                BeanUtils.populate(student,req.getParameterMap());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            req.getSession().setAttribute("student", student);
            resp.sendRedirect("/master.jsp");
        }
    }
}
