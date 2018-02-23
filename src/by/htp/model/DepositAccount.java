package by.htp.model;

public class DepositAccount extends Account{

	public DepositAccount(){
		
	}
	
	public DepositAccount(int amount){
		super(amount);
	}
	
	@Override
	public void printAccount(){
		System.out.println("Депозит: ");
		System.out.println("Остаток: " + this.getAccountAmount() + " Состояние: " + this.stringAccountState());
		System.out.println("-----------------------------------------------");
	}
	
}
