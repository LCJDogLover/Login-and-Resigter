package service;
import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {
    private UserDao userDao;
    @Autowired
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
    public boolean Match(String username,String password){
        int count = userDao.FindUser(username,password);
        return count>0;
    }
    public void InsertUser(String username,String password){
        userDao.InsertUser(username,password);
    }
}
