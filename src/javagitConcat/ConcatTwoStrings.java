package javagitConcat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ConcatTwoStrings {

	
	@Test
	public void concatenatingTwoWords()
	{
		Assert.assertEquals("loHi",minCat("Hello", "Hi"));
		Assert.assertEquals("ellojava",minCat("Hello", "java")); 
		Assert.assertEquals("javaello",minCat("java", "Hello")); 
	}

	public String minCat(String str1, String str2) {
		String str3 = "";
		if(str1.length()==str2.length())
			str3 = str1+str2;
		if(str1.length() > str2.length())
		{
			str3 = str1.substring(str1.length()-str2.length(),str1.length())+str2;
		}
		else 
		{
			str3 = str1 + str2.substring(str2.length()-str1.length(),str2.length());
		}
		System.out.println("Str3 : "+str3);
		return str3;
	}
}

