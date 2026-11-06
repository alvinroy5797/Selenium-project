package kptestpkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import kpbasepkg.Keralabaseclass;

public class Keralalogintest extends Keralabaseclass
{

	@Test
	public void testmthd() 
	{
		kloginobj.titleverification();
		kloginobj.loginmthd("Ahsfh@gmail.com", "123456");
		
		String actual=kloginobj.titleverification();
		Assert.assertEquals(actual, "Post your Property - Login | Keralaproperty");
	}
}
