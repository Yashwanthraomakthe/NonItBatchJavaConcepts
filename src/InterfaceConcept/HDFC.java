package InterfaceConcept;

public  class HDFC implements RBI, Bank {

	public static void main(String[] args) {
		HDFC h = new HDFC();
		h.displayBalance();

	}

	@Override
	public void displayBalance() {
		int balance = 4000;
		System.out.println("You should maintaina min balance " + minBalance);
		System.out.println("Your available balance is " + balance);

	}

	@Override
	public void winthdraw1() {
		// TODO Auto-generated method stub
		
	}

	

	

}
