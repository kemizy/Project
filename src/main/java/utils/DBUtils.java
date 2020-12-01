package utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import javax.sql.DataSource;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author 枯墨竹
 * @date 2020/11/30
 **/
public class DBUtils {
    public static DataSource  getDataResource() {
        DataSource dataSource = null;
        try {
            InputStream ras = DBUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
            Properties ps = new Properties();
            ps.load(ras);
            dataSource = new DruidDataSourceFactory().createDataSource(ps);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }

    public static void main(String[] args) {
        System.out.println(getDataResource());
    }
}
