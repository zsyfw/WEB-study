package webstudy.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import webstudy.Class.User;
import webstudy.Mapper.UserMapper;

import java.util.List;

@SpringBootTest
class SpringbootStudyApplicationTests {

	@Autowired
	private UserMapper userMapper;
	@Test
	public void userListTest(){
		List<User> userList = userMapper.userList();
		userList.stream().forEach(user -> {
			System.out.println(user);
		});
	}
	@Test
	public void insertTest(){
		User user = new User();
		user.setNickname("马城");
		user.setAvatar("http://yjy-xiaotuxian-dev.oss-cn-beijing.aliyuncs.com/avatar/2023-09-03/f407d4a0-0ff3-42fe-9406-3c2a3eb85c6e.png");
		user.setOpenId("AmKkJxeXrT");
		user.setMobile("15736459839");
		userMapper.insertUser(user);
	}
}
