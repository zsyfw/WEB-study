package webstudy.service.impl;

import org.springframework.stereotype.Service;
import webstudy.Class.Page;
import webstudy.Class.User;

import java.util.List;

public interface MysqlService {
    public int insertUser(User user);

    public int deleUser(String openid);

    public Page selectUserPage(Integer page,Integer pagesize);
}
