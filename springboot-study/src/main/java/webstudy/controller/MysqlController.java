/**
 * @author FW
 * @date 2023/9/13 19:31
 * @Software: IntelliJ IDEA WEB-study
 * @version 1.0
 */
package webstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import webstudy.Class.User;
import webstudy.Mapper.UserMapper;
import webstudy.service.impl.MysqlService;

@Controller
public class MysqlController {
    private UserMapper userMapper;
    private MysqlService mysqlService;

    @RequestMapping("/insert")
    public int insert(@RequestBody User user){
        int result =
        return 1;
    }
}
