package by.htp.model;

public class CreditAccount extends Account{

	private Overdraft overdraft;
	
	public CreditAccount(){
		super();
		this.overdraft = new Overdraft();	
	}
	
	public CreditAccount(int amount, int overdraftLimit){
		super(amount);
		this.overdraft = new Overdraft(overdraftLimit);	
	}
	
	public Overdraft getOverdraft(){
		return this.overdraft;
	}
	
	@Override
	public void blockAccount(){
		this.setAccountState(false);
		this.overdraft.setOverdraftState(false);
		
	}
	
	@Override
	public void unblockAccount(){
		this.setAccountState(true);
		this.overdraft.setOverdraftState(true);
		
	}
	
	@Override
	public void printAccount(){
		System.out.println("Счет с овердрафтом: ");
		System.out.println("Остаток: " + this.getAccountAmount() + " Состояние: " + this.stringAccountState());
		System.out.println("Овердрафт: " + this.getOverdraft().getOverdraftLimit() + " Состояние: " + this.getOverdraft().stringOverdraftState());
		System.out.println("-----------------------------------------------");
	}
	
}
