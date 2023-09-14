package webstudy.Mapper;

import org.apache.ibatis.annotations.*;
import webstudy.Class.User;

import java.util.List;

@Mapper   //运行时会自动生成一个该接口的实现类对象(代理)，并且将该对象交给IOC容器管理,成为了一个bean
public interface UserMapper {

    @Select("select * from users")
    public List<User> userList();
    @Delete("delete from users where openid =#{openid}")
    public int deleteUser(String openid);

    @Options(keyProperty = "id",useGeneratedKeys = true)//为传入的对象添加主键值便于返回查看
    @Insert("insert into users (avatar, nickname, password, openid, mobile) " +
            "values (#{avatar},#{nickname},#{password},#{openid},#{mobile})")
    public int insertUser(User user);
}
