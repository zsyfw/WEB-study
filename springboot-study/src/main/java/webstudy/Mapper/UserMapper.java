package webstudy.Mapper;

import org.apache.ibatis.annotations.*;
import webstudy.Class.User;

import java.util.List;

@Mapper   //运行时会自动生成一个该接口的实现类对象(代理)，并且将该对象交给IOC容器管理,成为了一个bean
public interface UserMapper {

    @Select("select * from users") //查询用户
    public List<User> userList();
    @Delete("delete from users where open_id =#{openId}")  //根据id删除用户
    public int deleteUser(String openId);
    @Update("update users set nickname = #{nickname} where open_id =#{openid}") //根据openid修改用户昵称
    public int updateNickname(String openid, String nickname);
    public void deleteList(List<String> openIds);//批量删除用户

    /*@Results({
            @Result(column = "open_id",property = "openId")//指定数据库字段封装到哪个属性
    })*/
    @Options(keyProperty = "id",useGeneratedKeys = true)//为传入的对象添加主键值便于返回查看
    @Insert("insert into users (avatar, nickname, password, open_id, mobile,admin) " +
            "values (#{avatar},#{nickname},#{password},#{openId},#{mobile},#{admin})")
    public int insertUser(User user);//增加用户


}
