package week3.day1;

public class SmartPhone extends AndroidPhone {
	public void connectWhatsApp()
	{
		System.out.println("we can connect whatsapp");
	}
	@Override
	public void takeVideo() {
		System.out.println("we can take video1 by overridden class");
	}

}
