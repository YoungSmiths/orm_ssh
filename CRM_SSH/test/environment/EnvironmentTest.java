package environment;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.user.dao.impl.UserDAOImpl;

public class EnvironmentTest {
	@Test
	public void testEnvironment() {
		@SuppressWarnings("resource")
		ApplicationContext  mApplicationContext  = new ClassPathXmlApplicationContext("/aplicationContext.properties");
		UserDAOImpl bean = (UserDAOImpl)mApplicationContext.getBean("userDAOImpl");
		System.out.println(bean.getmUser());
	}
}
