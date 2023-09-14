package webstudy.dao;

import webstudy.Class.User;

public interface MysqlDao {

    public int insertUser(User user);

    public int deleteUser(String openid);
}
