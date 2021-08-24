package week3.day1;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("This is axisbank deposit method");

	}

	public static void main(String[] args) {
		BankInfo obj = new BankInfo();
		obj.fixed(0);
		obj.saving();
		obj.deposit();
		obj.deposit();
		
        
	}

}
