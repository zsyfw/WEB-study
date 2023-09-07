/**
 * @author FW
 * @date 2023/9/7 23:15
 * @Software: IntelliJ IDEA WEB-study
 * @version 1.0
 */
package webstudy.dao.impl;

import webstudy.Class.User;
import webstudy.dao.JsonInfoDao;

import java.util.List;

public class JsonInfoDaoImpl implements JsonInfoDao {

    @Override
    public User userinfo(User user) {
       user.setName("更改后");
        return user;
    }
}
