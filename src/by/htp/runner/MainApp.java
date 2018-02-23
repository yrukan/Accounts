package by.htp.runner;
import by.htp.model.*;
import by.htp.logic.*;

public class MainApp {

	public static void main(String[] args) {
			
		Client client = new Client("James", "Bond");
		DepositAccount deposit = new DepositAccount(5000);
		CardAccount cardacc = new CardAccount(1000, "Visa");
		CreditAccount creditacc = new CreditAccount(0, 2000);
	
		Account[] accounts = new Account[]{deposit, cardacc, creditacc};
		
		ClientAccount acc = new ClientAccount(client, accounts);
		
		acc.blockAllAccounts();
		//acc.unblockAllAccounts();
		
		acc.sortByAccountAmountAsc();
		acc.printClientAccount();
	
	}

}
