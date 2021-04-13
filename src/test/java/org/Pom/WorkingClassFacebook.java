package org.Pom;

public class WorkingClassFacebook extends BaseClass{
	public static void main(String[] args) {
		getDriver();
		loadUrl("https://www.facebook.com/");
		Maximize();
		FacebookLogin test1=new FacebookLogin();
		//FacebookTest1 test1=new FacebookTest1();
		type(test1.getTextemail(),"guruprasad@gmail.com" );
		type(test1.getTextpass(), "Guruprasad");
		click(test1.getTextlogin());
		Quit();
	}

}
