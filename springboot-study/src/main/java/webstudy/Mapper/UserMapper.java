package webstudy.Mapper;

import org.apache.ibatis.annotations.*;
import webstudy.Class.User;

import java.util.List;

@Mapper   //运行时会自动生成一个该接口的实现类对象(代理)，并且将该对象交给IOC容器管理,成为了一个bean
public interface UserMapper {

    /*@Results({
            @Result(column = "open_id",property = "openId")//指定数据库字段封装哪个属性
    })
    @Select("select * from users")*/
    public List<User> userList();
    @Delete("delete from users where open_id =#{openId}")
    public int deleteUser(String openId);

    @Options(keyProperty = "id",useGeneratedKeys = true)//为传入的对象添加主键值便于返回查看
    @Insert("insert into users (avatar, nickname, password, open_id, mobile) " +
            "values (#{avatar},#{nickname},#{password},#{openId},#{mobile})")
    public int insertUser(User user);
}
