package webstudy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import webstudy.Class.User;

import javax.servlet.http.HttpServletRequest;

@RestController   //将类标记为请求注解类
public class helloworld {
    @RequestMapping("/hello")//设置浏览器调用路径
    public String hello(){
        System.out.println("hello,world");
        return "hello,world";
    }
    @RequestMapping("/SelectForId")
    public String SelectForId(int id){
        return "id是"+id;
    }
    @RequestMapping("/SelectForId_2")                  //此时会根据name来接收参数,但此参数必须存在,除非设置required = false
    public String SelectForId_2(@RequestParam(name = "name") int id){
        return "id是"+id;
    }
    @RequestMapping("/UserInfo")
    public String UserInfo(User user){
        System.out.println(user);
        return user.toString();
    }
    @RequestMapping("/UserAddressInfo")
    public String UserAddressInfo(User user){
        System.out.println(user);
        return user.toString();
    }


}
