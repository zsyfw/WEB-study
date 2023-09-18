package webstudy.dao;

import webstudy.Class.User;

import java.util.List;

public interface MysqlDao {

    public int insertUser(User user);

    public int deleteUser(String openid);

    public List<User> selectUserPage();
}
