package dao;
import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class UserDao {
    private JdbcTemplate jdbcTemplate;
    private final static String sql = "Select count(*) from user_name where username=? and password = ?";
    private final static String sqlInsert = "insert into user_name(username,password) values(?,?)";
    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    public int FindUser(String username,String password){
        return jdbcTemplate.queryForObject(sql,new Object[]{username,password},Integer.class);
    }
    public void InsertUser(String username,String password){
        jdbcTemplate.update(sqlInsert,username,password);
    }
}
