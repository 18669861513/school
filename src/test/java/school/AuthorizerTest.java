package school;

import junit.framework.Assert;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

public class AuthorizerTest {

	public void testIsPermitted(){
		login("classpath:shiro-authorizer.ini", "zhang", "123");
		Subject subject = SecurityUtils.getSubject();
		//判断拥有权限
		Assert.assertTrue(subject.isPermitted("user1:update"));
		Assert.assertTrue(subject.isPermitted("user2:update"));
		//利用二进制位的方式表示权限
		Assert.assertTrue(subject.isPermitted("+user1+2"));//新增权限
		Assert.assertTrue(subject.isPermitted("+user1+8"));//查看权限
		Assert.assertTrue(subject.isPermitted("+user1+10"));//新增及查看
		
		Assert.assertFalse(subject.isPermitted("+user1+4"));//没有删除权限
		Assert.assertTrue(subject.isPermitted("menu:view"));//通过MyRolePermissionResolver解析得到的权限
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
