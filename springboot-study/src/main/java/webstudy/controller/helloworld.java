package webstudy.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import webstudy.Class.User;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

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
    @RequestMapping("/ArrayInfo")
    public String ArrayInfo(String[] hobby){   //数组型数据接收
        System.out.println(Arrays.toString(hobby));
        return "success";
    }
    @RequestMapping("/ListInfo")
    public String ListInfo(@RequestParam List<String> hobby){   //集合型数据接收必须在前面加上RequestParam绑定关系
        System.out.println(hobby);
        return "success";
    }
    @RequestMapping("/DateTimeInfo")                  //时间型数据接收时可以在前面加上@DateTimeFormat指定时间格式
    public String DateInfo(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime time){
        System.out.println(time);
        return "success";
    }
    @RequestMapping("/JsonInfo")       //json型数据接收时需要在前面加上@RequestBody将数据封装到对象中
    public String JsonInfo(@RequestBody User user){
        System.out.println(user);
        return "success";
    }
    @RequestMapping("/Path/{id}/{name}")       //路径型数据接收时需要在前面加上@RequestMapping("/Path/{id}")将路径中的数据动态赋值给形参接收
    public String PathInfo(@PathVariable Integer id ,@PathVariable String name){  //形参前面需要加上@PathVariable来接收@RequestMapping中的动态数据
        System.out.println(id);
        return "success";
    }

}
