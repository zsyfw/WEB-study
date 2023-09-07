package webstudy.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import webstudy.Class.User;
import webstudy.Result.Result;
import webstudy.service.impl.JsonInfoService;
import webstudy.service.impl.impl.JsonInfoServiceimpl;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController   //将类标记为请求注解类
public class ServiceController {


    @RequestMapping("/hello")//设置浏览器调用路径
    public Result hello(){
        System.out.println("hello,world");
        return Result.success("hello,world");
    }
    @RequestMapping("/SelectForId")
    public Result SelectForId(int id){
        return Result.success("id是:"+id);
    }
    @RequestMapping("/SelectForId_2")                  //此时会根据name来接收参数,但此参数必须存在,除非设置required = false
    public Result SelectForId_2(@RequestParam(name = "name") int id){
        return Result.success("id是:"+id);
    }
    @RequestMapping("/UserInfo")
    public Result UserInfo(User user){
        System.out.println(user);
        return Result.success(user.toString());
    }
    @RequestMapping("/UserAddressInfo")
    public Result UserAddressInfo(User user){
        System.out.println(user);
        return Result.success(user.toString());
    }
    @RequestMapping("/ArrayInfo")
    public Result ArrayInfo(String[] hobby){   //数组型数据接收
        System.out.println(Arrays.toString(hobby));
        return Result.success(hobby);
    }

    @RequestMapping("/ListInfo")
    public Result ListInfo(@RequestParam List<String> hobby){   //集合型数据接收必须在前面加上RequestParam绑定关系
        System.out.println(hobby);
        return Result.success(hobby);
    }
    @RequestMapping("/DateTimeInfo")                  //时间型数据接收时可以在前面加上@DateTimeFormat指定时间格式
    public Result DateInfo(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime time){
        System.out.println(time);
        return Result.success(time);
    }
    private JsonInfoService jsonInfoService = new JsonInfoServiceimpl();
    @RequestMapping("/JsonInfo")       //json型数据接收时需要在前面加上@RequestBody将数据封装到对象中
    public Result JsonInfo(@RequestBody User user){
        User updateUser = jsonInfoService.userinfo(user);
        return Result.success(updateUser);
    }
    @RequestMapping("/Path/{id}/{name}")       //路径型数据接收时需要在前面加上@RequestMapping("/Path/{id}")将路径中的数据动态赋值给形参接收
    public Result PathInfo(@PathVariable Integer id ,@PathVariable String name){  //形参前面需要加上@PathVariable来接收@RequestMapping中的动态数据
        System.out.println(id);
        return Result.success("id:"+id+",name:"+name);
    }

}
