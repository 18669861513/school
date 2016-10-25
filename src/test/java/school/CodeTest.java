package school;

import java.security.Key;

import junit.framework.Assert;

import org.apache.shiro.codec.Base64;
import org.apache.shiro.codec.Hex;
import org.apache.shiro.crypto.AesCipherService;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class CodeTest {

	@Test
	public void test() {
		String str = "hello";
		String base64Encode = Base64.encodeToString(str.getBytes());
		String str2 = Base64.decodeToString(base64Encode);
		Assert.assertEquals(str, str2);
	}

	@Test
	public void hexTest() {
		String str = "hello";
		String base64Encode = Hex.encodeToString(str.getBytes());
		String str2 = new String(Hex.decode(base64Encode.getBytes()));
		Assert.assertEquals(str, str2);
	}

	@Test
	public void md5Test() {
		String str = "hello";
		String salt = "123";
		String md5 = new Md5Hash(str, salt, 2).toString();
	}

	@Test
	public void aesTest() {
		AesCipherService aesCipherService = new AesCipherService();
		aesCipherService.setKeySize(128);// 设置key长度
		// 生成key
		Key key = aesCipherService.generateNewKey();
		String text = "hello";
		// 加密
		String encrptText = aesCipherService.encrypt(text.getBytes(),
				key.getEncoded()).toHex();
		// 解密
		String text2 = new String(aesCipherService.decrypt(
				Hex.decode(encrptText), key.getEncoded()).getBytes());
		Assert.assertEquals(text, text2);
	}
}
