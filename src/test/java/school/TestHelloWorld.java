package school;

import junit.framework.Assert;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
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
public class TestHelloWorld {

//	@Test
//	public void testHelloWorld() {
//		// 1、获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager
//		Factory<org.apache.shiro.mgt.SecurityManager> factory = new IniSecurityManagerFactory(
//				"classpath:shiro.ini");
//		// 2、得到SecurityManager实例 并绑定给SecurityUtils
//		org.apache.shiro.mgt.SecurityManager securityManager = factory
//				.getInstance();
//		SecurityUtils.setSecurityManager(securityManager);
//		// 3、得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）
//		Subject subject = SecurityUtils.getSubject();
//		UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");
//		subject.login(token);
//		Assert.assertEquals(true, subject.isAuthenticated());// 断言用户已经登录
//		// 退出
//		subject.logout();
//	}
//
//	@Test
//	public void testCustomRealm() {
//		// 获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityMananger
//		Factory<org.apache.shiro.mgt.SecurityManager> factory = new IniSecurityManagerFactory(
//				"classpath:shiro-realm.ini");
//		// 得到SecurityManager实例，并绑定给SecurityUtils
//		org.apache.shiro.mgt.SecurityManager securityManager = factory
//				.getInstance();
//		SecurityUtils.setSecurityManager(securityManager);
//		// 得到Subject及创建用户名/密码身份认证Token(即用户身份/凭证)
//		Subject subject = SecurityUtils.getSubject();
//		UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");
//		subject.login(token);
//		Assert.assertEquals(true, subject.isAuthenticated());// 断言用户已经登录
//		// 退出
//		subject.logout();
//	}
//
//	@Test
//	public void testCustomMultiRealm() {
//		// 获取SecurityManager工厂，此处使用Init配置文件初始化SecurityManager
//		Factory<org.apache.shiro.mgt.SecurityManager> factory = new IniSecurityManagerFactory(
//				"classpath:shiro-multi-realm.ini");
//		// 得到SecurityManager实例，并绑定给SecurityUtils
//		org.apache.shiro.mgt.SecurityManager securityManager = factory
//				.getInstance();
//		SecurityUtils.setSecurityManager(securityManager);
//		// 得到Subject及创建用户名/密码身份认证Token(及用户身份/凭证)
//		Subject subject = SecurityUtils.getSubject();
//		UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");
//		try {
//			subject.login(token);// 登录
//		} catch (AuthenticationException e) {
//			System.out.println("登录失败============================");
//		}
//		Assert.assertEquals(true, subject.isAuthenticated());// 断言用户已经登录
//		subject.logout();// 退出
//	}

	@Test
	public void testJdbcRealm() {
		// 获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager
		Factory<org.apache.shiro.mgt.SecurityManager> factory = new IniSecurityManagerFactory(
				"classpath:shiro-jdbc-realm.ini");
		// 得到SecurityManager实例，并绑定给SecurityUtils
		org.apache.shiro.mgt.SecurityManager securityManager = factory
				.getInstance();
		SecurityUtils.setSecurityManager(securityManager);
		//得到Subject及创建用户名/密码身份认证Token(及用户身份/凭证)
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");
		try{
			subject.login(token);
		}catch(AuthenticationException e){
			System.out.println("登录失败==============================================");
		}catch (Exception e) {
			System.out.println("登录失败==============================================");
		}
		
		Assert.assertEquals(true, subject.isAuthenticated());
		subject.logout();
	}
}
