/**
 * @author FW
 * @date 2023/9/7 23:29
 * @Software: IntelliJ IDEA WEB-study
 * @version 1.0
 */
package webstudy.service.impl.impl;

import webstudy.Class.User;
import webstudy.dao.JsonInfoDao;
import webstudy.dao.impl.JsonInfoDaoImpl;
import webstudy.service.impl.JsonInfoService;

public class JsonInfoServiceimpl implements JsonInfoService {

    private JsonInfoDao jsonInfoDao = new JsonInfoDaoImpl();
    @Override
    public User userinfo(User user) {
       User updateUser = jsonInfoDao.userinfo(user);
        return updateUser;
    }
}
