package web;
import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.RootService;
import service.UserService;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    private UserService userService;
    private RootService rootService;
    @Autowired
    public void setUserService(UserService userService){
        this.userService = userService;
    }
    @Autowired
    public void setRootService(RootService rootService){
        this.rootService = rootService;
    }
    @RequestMapping(value = "index.html")
    public String tologin(){
        return "login";
    }
    @RequestMapping(value = "/login")
    public ModelAndView login(HttpServletRequest request,User user){
        boolean isValidUser = userService.Match(user.getUsername(),user.getPassword());
        if(isValidUser){
            request.getSession().setAttribute("User",user.getUsername()+":登陆成功");
            return new ModelAndView("success");}
            else{
                return new ModelAndView("login");
        }
    }
    @RequestMapping(value = "/Rootlogin")
        public String Rootlogin(){
            return "rootlogin";
        }

     @RequestMapping(value = "/rootlogin")
     public ModelAndView rootlogin(HttpServletRequest request,User user){
        boolean isValidUser = rootService.rootMatch(user.getUsername(),user.getPassword());
        if(isValidUser){
            List<Map<String, Object>> usertable = new ArrayList<Map<String, Object>>();
            usertable = rootService.rootManage();
            for (Map<String, Object> map : usertable) {
                for (String s : map.keySet()) {
                    request.getSession().setAttribute("usertbale",map.get(s)+"用户"+s);
                    System.out.print(map.get(s) + s+"  ");
                }
            }
            //request.getSession().setAttribute("User",user.getUsername()+":登陆成功");
            return new ModelAndView("rootPage");}
        else{
            return new ModelAndView("rootlogin");
        }
    }


    @RequestMapping(value = "/insert")
    public String InsertUser(User user,Model model){
        userService.InsertUser(user.getUsername(),user.getPassword());
        model.addAttribute("Insert","注册成功");
        return "success1";
    }
    @RequestMapping("/Rootreg")
    public String Rootreg(){
        return "rootreg";
    }
    @RequestMapping("/rootreg")
    public String RootInsert(User user,Model model){
        rootService.rootInsertUser(user.getUsername(),user.getPassword());
        model.addAttribute("Insert","管理员注册成功");
        return "success1";
    }
    @RequestMapping("/insertPage")
    public String InsertPage(){
        return "register";
    }
}
