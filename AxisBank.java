package week3.day1.assignment;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("deposit regularly for each month");
	}
	public static void main(String[] args) {
		
		BankInfo info=new BankInfo();
		info.deposit();
		info.fixed();
		info.saving();
		
		AxisBank override=new AxisBank();
		override.deposit();
		
		
	}

}
