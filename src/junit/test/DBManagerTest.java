package junit.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.uta.db.manager.DBManager;
import com.uta.domain.User;

public class DBManagerTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		User user=new User();
		user.setBirthday(new Date());
		user.setEmail("jiayan@sina.com");
		user.setId("8953532");
		user.setPassword("123");
		user.setNickname("jiayan");
		user.setUsername("bbbb");
		
		DBManager dbm=new DBManager();
		dbm.addUser(user);
	}

}
