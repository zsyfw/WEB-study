/**
 * @author FW
 * @date 2023/9/13 19:31
 * @Software: IntelliJ IDEA WEB-study
 * @version 1.0
 */
package webstudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import webstudy.Class.Page;
import webstudy.Class.User;
import webstudy.Result.Result;
import webstudy.service.impl.MysqlService;

@RestController
public class UserMysqlController {
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
            return Result.success(result);
        }
        else return Result.error("error");
    }
    @RequestMapping("/Update_nickname")
    public Result Update_nickname(@RequestParam String openid ,@RequestParam String nickname){

        int result = mysqlService.updateNickname(openid , nickname);
        if(result>0){
            return Result.success();
        }
        else return Result.error("error");
    }

    @RequestMapping("/SelectUserPage")//分页查询用户
    public Result SelectUserPage(@RequestParam(defaultValue = "1") Integer page,
                                 @RequestParam(defaultValue = "10") Integer pagesize)//第一个参数是起始页码，第二个参数是每页记录数,默认为1和10
    {
        Page pagelist = mysqlService.selectUserPage(page,pagesize);

        return Result.success(pagelist);
    }
    @RequestMapping("/SelectUserPage")
    public Result SelectNews(){

        return Result.success();
    };
}
