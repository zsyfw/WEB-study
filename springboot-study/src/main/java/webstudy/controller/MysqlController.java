/**
 * @author FW
 * @date 2023/9/13 19:31
 * @Software: IntelliJ IDEA WEB-study
 * @version 1.0
 */
package webstudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import webstudy.Class.User;
import webstudy.Mapper.UserMapper;
import webstudy.Result.Result;
import webstudy.service.impl.MysqlService;

@RestController
public class MysqlController {
    @Autowired
    private MysqlService mysqlService;

    @RequestMapping("/Register")     //注册操作
    public Result Register(@RequestBody User user){
        System.out.println(user);
        int result = mysqlService.insertUser(user);
        if(result>0){
        return Result.success(user.getId());
        }
        else return Result.error("error");
    }

    @RequestMapping("/Delete")     //删除用户
    public Result Delete(@RequestParam(name = "openid") String openid){
        int result = mysqlService.deleUser(openid);
        if(result>0){
            return Result.success();
        }
        else return Result.error("error");
    }
}
