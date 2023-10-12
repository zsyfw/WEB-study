/**
 * @author FW
 * @date 2023/9/13 19:45
 * @Software: IntelliJ IDEA WEB-study
 * @version 1.0
 */
package webstudy.dao.impl;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import webstudy.Class.User;
import webstudy.Mapper.UserMapper;
import webstudy.dao.MysqlDao;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class MysqlDaoimpl implements MysqlDao {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int insertUser(User user) {
        int result = userMapper.insertUser(user);
        return result;
    }

    @Override
    public int deleteUser(String openid) {
        int result = userMapper.deleteUser(openid);
        return result;
    }

    @Override
    public int updateNickname(String openid, String nickname) {
        int result = userMapper.updateNickname(openid , nickname);
        return result;
    }

    @Override
    public List<User> selectUserPage() {
        List<User> userList= userMapper.userList();
        return userList;
    }
}
