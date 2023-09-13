/**
 * @author FW
 * @date 2023/9/13 19:44
 * @Software: IntelliJ IDEA WEB-study
 * @version 1.0
 */
package webstudy.service.impl.impl;

import webstudy.Class.User;
import webstudy.dao.MysqlDao;
import webstudy.service.impl.MysqlService;

public class MysqlServiceimpl implements MysqlService {
    private MysqlDao mysqlDao;


    @Override
    public int insert(User user) {
        return 0;
    }
}
