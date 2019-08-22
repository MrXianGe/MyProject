package cn.itcast.user.service;

import cn.itcast.user.mapper.Usermapper;
import cn.itcast.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private Usermapper usermapper;

    public User queryUserById(Long id){
        return this.usermapper.selectByPrimaryKey(id);
    }
    @Transactional
    public void deleteUserById(Long id){
        this.usermapper.deleteByPrimaryKey(id);
    }

    public List<User> queryUserAll(){
        return this.usermapper.selectAll();
    }
}
