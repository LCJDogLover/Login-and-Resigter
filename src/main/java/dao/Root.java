package dao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class Root {
    private JdbcTemplate jdbcTemplate;
    private final static String sql = "Select count(*) from root_user where username=? and password=?";
    private final static String insertsql = "insert into root_user(username,password) values(?,?)";
    private final static String sqlshow = "Select * from user_name";
    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){this.jdbcTemplate=jdbcTemplate;}
    public int FindRoot(String username,String password){
        return jdbcTemplate.queryForObject(sql,new Object[]{username,password},Integer.class);
    }
    public void InsertRoot(String rootname,String rootpass){
        jdbcTemplate.update(insertsql,rootname,rootpass);
    }
    public List<Map<String, Object>> showuser(){
        return jdbcTemplate.queryForList(sqlshow);
    }
}
