package service;

import dao.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RootService {
    private Root root;
    @Autowired
    public void setRoot(Root root){
        this.root = root;
    }
    public boolean rootMatch(String username, String password){
        int count = root.FindRoot(username,password);
        return count>0;
    }
    public void rootInsertUser(String username,String password){
        root.InsertRoot(username,password);
    }
    public List<Map<String, Object>> rootManage(){
        return root.showuser();
    }
}
