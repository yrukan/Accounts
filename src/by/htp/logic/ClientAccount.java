package by.htp.logic;
import by.htp.model.*;

public class ClientAccount {

	private int totalBalance;
	private Client client;
	private Account[] accountsList;
	
	public ClientAccount(){
		
	}
	
    public ClientAccount(Client client, Account[] accounts){
		this.client = client;
		this.accountsList = accounts;
	}
	
	public int countClientTotalBalance(){
		this.totalBalance = 0;
		for(Account a: this.accountsList)
			this.totalBalance = this.totalBalance + a.getAccountAmount();
		return this.totalBalance;
	}
	
	public void printClientTotalBalance(){
		System.out.println("Итоговый баланс по всем счетам клиента: " + this.totalBalance);
	}
	
	public void printClientAccount(){
		this.client.printClient();
		this.printClientTotalBalance();
		for(Account a: this.accountsList)
			a.printAccount();
	}
	
	public void blockAllAccounts(){
		for(Account a: this.accountsList)
			a.blockAccount();
	}
	
	public void unblockAllAccounts(){
		for(Account a: this.accountsList)
			a.unblockAccount();
	}
	
	public void sortByAccountAmountAsc(){
		
	}
	
}
