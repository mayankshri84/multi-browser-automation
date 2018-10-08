package test;

public class FinalTest{
	public static void main(String[] args) {
		String[] myBrowsers = {"firefox", "ie","chrome", "lul"};
		for(String browser : myBrowsers){
			Thread obj = new Thread(new MyTests(browser));
			obj.start();	
		}
		
	}
}