package school;

import junit.framework.Assert;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class ConfigurationCreateTest {

	@Test
	public void test() {
		try{
			Factory<org.apache.shiro.mgt.SecurityManager> factory = new IniSecurityManagerFactory(
					"classpath:shiro-config.ini");
			org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();
			//将SecurityManager设置到SecurityUtils,方便全局使用
			SecurityUtils.setSecurityManager(securityManager);
			Subject subject = SecurityUtils.getSubject();
			UsernamePasswordToken token = new UsernamePasswordToken("zhang","123");
			subject.login(token);
			Assert.assertTrue(subject.isAuthenticated());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
