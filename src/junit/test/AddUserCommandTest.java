package junit.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import com.uta.command.AddUserCommand;
import com.uta.domain.User;

public class AddUserCommandTest {

	@Test
	public void test() {
		User user=new User();
		user.setBirthday(new Date());
		user.setEmail("bb@sina.com");
		user.setId("8953556");
		user.setPassword("123");
		user.setNickname("linngd");
		user.setUsername("bbbb");
		
		AddUserCommand auc=new AddUserCommand(user);
		auc.execute();
		assertEquals(user, auc.getResult());
	}

}
