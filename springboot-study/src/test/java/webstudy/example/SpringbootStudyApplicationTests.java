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
}
