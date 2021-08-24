package week3.day1;

public class Myphone {

	public static void main(String[] args) {
		AndroidPhone objphone = new AndroidPhone();
		System.out.println("************AndroidPhone**************");
		objphone.sendmsg();
		objphone.makeCall();
		objphone.saveContact();
		objphone.takeVideo();
		System.out.println("************SmartPhone**************");
		SmartPhone objsmart = new SmartPhone();
		objsmart.sendmsg();
		objsmart.makeCall();
		objsmart.saveContact();
		objsmart.takeVideo();
		objsmart.connectWhatsApp();
		
	}

}
