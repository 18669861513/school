package school;

import java.util.Arrays;

import junit.framework.Assert;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class RoleTest {

	@Test
	public void testHasRole(){
		login("classpath:shiro-role.ini");
		Subject subject = SecurityUtils.getSubject();
		//判断拥有角色role1
		Assert.assertTrue(subject.hasRole("role1"));
		//判断拥有角色role1 and role2
		Assert.assertTrue(subject.hasAllRoles(Arrays.asList("role1","role2")));
		//判断是否拥有角色role1,role2,role3
		boolean[] result = subject.hasRoles(Arrays.asList("role1","role2","role3"));
		Assert.assertEquals(true, result[0]);
		Assert.assertEquals(true, result[1]);
		Assert.assertEquals(false, result[2]);
	}
	
	@Test(expected = UnauthorizedException.class)
	public void testCheckRole(){
		login("classpath:shiro-role.ini");
		Subject subject = SecurityUtils.getSubject();
		subject.checkRole("role1");
		subject.checkRoles(Arrays.asList("role1","role2"));
		subject.checkRoles(Arrays.asList("role1","role3"));
	}
	
	private void login(String configFile) {
		// 获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager
		Factory<org.apache.shiro.mgt.SecurityManager> factory = new IniSecurityManagerFactory(
				configFile);
		//得到SecurityManager实例，并绑定给SecurityUtils
		org.apache.shiro.mgt.SecurityManager securityManager = factory
				.getInstance();
		SecurityUtils.setSecurityManager(securityManager);
		//得到Subject及创建用户名/密码身份验证token(及用户身份/凭证)
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");
		
		subject.login(token);
	}
}
