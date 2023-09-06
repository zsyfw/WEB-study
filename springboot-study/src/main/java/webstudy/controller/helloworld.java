package webstudy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    @RequestMapping("/SelectForId_2")
    public String SelectForId_2(@RequestParam(name = "name") int id){
        return "id是"+id;                      //此时会根据name来接收参数
    }

}
