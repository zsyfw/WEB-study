/**
 * @author FW
 * @date 2023/9/7 23:15
 * @Software: IntelliJ IDEA WEB-study
 * @version 1.0
 */
package webstudy.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import webstudy.Class.User;
import webstudy.dao.JsonInfoDao;

import java.util.List;

//@Component    //表示将当前类交给IOC容器管理，成为IOC容器中的bean
//声明的bean可以通过(value = "bean_name")或("bean_name")指定名字,否则默认为首字母小写的类名
@Repository   //@Component的衍生注解，常用于获取数据的类
public class JsonInfoDaoImpl implements JsonInfoDao {

    @Override
    public User userinfo(User user) {
        return user;
    }
}
