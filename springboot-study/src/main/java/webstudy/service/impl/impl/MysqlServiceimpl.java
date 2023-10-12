/**
 * @author FW
 * @date 2023/9/13 19:44
 * @Software: IntelliJ IDEA WEB-study
 * @version 1.0
 */
package webstudy.service.impl.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webstudy.Class.Page;
import webstudy.Class.User;
import webstudy.dao.MysqlDao;
import webstudy.service.impl.MysqlService;

import java.util.List;

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

    @Override
    public int updateNickname(String openid, String nickname) {
        int result = mysqlDao.updateNickname(openid , nickname);
        return result;
    }

    @Override
    public Page selectUserPage(Integer page,Integer pagesize) {
        PageHelper.startPage(page,pagesize);

        List<User> userList = mysqlDao.selectUserPage();
        com.github.pagehelper.Page<User> p = (com.github.pagehelper.Page<User>) userList;//强转类型

        Page page1 = new Page(p.getTotal(),p.getResult());

        return page1;
    }


}
