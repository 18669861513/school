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
public class PermissionTest {

	@Test
	public void testIsPermitted(){
		login("classpath:shiro-permission.ini", "zhang", "123");
		Subject subject = SecurityUtils.getSubject();
		//判断拥有权限user:create
		Assert.assertTrue(subject.isPermitted("user:create"));
		//判断拥有权限user:update and user:delete
		Assert.assertTrue(subject.isPermittedAll("user:create","user:delete"));
		//判断没有权限user:view
		Assert.assertFalse(subject.isPermitted("user:view"));
	}
	
	@Test
	public void testCheckPermission(){
		login("classpath:shiro-permission.ini", "zhang", "123");
		Subject subject = SecurityUtils.getSubject();
		//断言拥有权限user:create
		subject.checkPermission("user:create");
		//断言拥有权限user:update and user:delete
		subject.checkPermissions("user:update","user:delete");
		//断言拥有权限user:view失败抛出异常
		subject.checkPermission("user:view");
	}
	
	private void login(String configFile, String username, String password) {
		// 获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager
		Factory<org.apache.shiro.mgt.SecurityManager> factory = new IniSecurityManagerFactory(
				configFile);
		//得到SecurityManager实例，并绑定给SecurityUtils
		org.apache.shiro.mgt.SecurityManager securityManager = factory
				.getInstance();
		SecurityUtils.setSecurityManager(securityManager);
		//得到Subject及创建用户名/密码身份验证token(及用户身份/凭证)
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(username,password);
		
		subject.login(token);
	}
}
