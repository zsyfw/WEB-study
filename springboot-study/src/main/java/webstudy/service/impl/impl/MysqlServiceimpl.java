/**
 * @author FW
 * @date 2023/9/13 19:44
 * @Software: IntelliJ IDEA WEB-study
 * @version 1.0
 */
package webstudy.service.impl.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webstudy.Class.User;
import webstudy.dao.MysqlDao;
import webstudy.service.impl.MysqlService;

@Service
public class MysqlServiceimpl implements MysqlService {
    @Autowired
    private MysqlDao mysqlDao;


    @Override
    public int insertUser(User user) {
        int result = mysqlDao.insertUser(user);
        return result;
    }

    @Override
    public int deleUser(String openid) {
        int result = mysqlDao.deleteUser(openid);
        return result;
    }
}
