package webstudy.Mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import webstudy.Class.User;

import java.util.List;

@Mapper   //运行时会自动生成一个该接口的实现类对象(代理)，并且将该对象交给IOC容器管理,成为了一个bean
public interface UserMapper {

    @Select("select * from users")
    public List<User> userList();
    @Delete("delete from users where openid =#{opid}")
    public int delete(String opid);
    @Insert("insert into users (avatar, nickname, password, openid, mobile) " +
            "values (#{avatar},#{nickname},#{password},#{openid},#{mobile})")
    public int insert(User user);
}
