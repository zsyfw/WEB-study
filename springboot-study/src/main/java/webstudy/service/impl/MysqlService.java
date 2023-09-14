package webstudy.service.impl;

import org.springframework.stereotype.Service;
import webstudy.Class.User;

public interface MysqlService {
    public int insertUser(User user);

    public int deleUser(String openid);
}
