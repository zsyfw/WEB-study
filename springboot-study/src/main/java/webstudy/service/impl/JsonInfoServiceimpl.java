/**
 * @author FW
 * @date 2023/9/7 23:29
 * @Software: IntelliJ IDEA WEB-study
 * @version 1.0
 */
package webstudy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webstudy.Class.User;
import webstudy.dao.JsonInfoDao;
import webstudy.service.JsonInfoService;


//@Component    //表示将当前类交给IOC容器管理，成为IOC容器中的bean
//声明的bean可以通过(value = "bean_name")或("bean_name")指定名字,否则默认为首字母小写的类名
//@Primary//当同一接口有两个类时,可以通过在要注入的类加上@Primary指定
@Service        //@Component的衍生注解，常用于处理业务逻辑的类
public class JsonInfoServiceimpl implements JsonInfoService {

    @Autowired   //运行时，IOC容器会提供该类型的bean对象，并赋值给该变量,不用再手动实例化对象----依赖注入(此方法依赖JsonInfoDao类)
    private JsonInfoDao jsonInfoDao;
    @Override
    public User userinfo(User user) {
       User updateUser = jsonInfoDao.userinfo(user);
       updateUser.setNickname("更改后的名字");
        return updateUser;
    }
}
