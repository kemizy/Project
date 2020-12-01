import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 枯墨竹
 * @date 2020/11/29
 **/

public class Servlet {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql:///learnjdbc?serverTimezone=UTC", "root", "123456");
        PreparedStatement statement = conn.prepareStatement("select * from students");
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
                long id = rs.getLong(1); // 注意：索引从1开始
              String name = rs.getString(2);
              int gender = rs.getInt(3);
                long grade = rs.getLong(4);
                int score = rs.getInt(5);
                System.out.println(String.valueOf(id) + grade + name + gender+score);
        }
        Iterator<Integer> iterator = new ArrayList<Integer>().iterator();
        if (iterator.hasNext()) {
            iterator.next();
        }

    }
}
