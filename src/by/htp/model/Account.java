package by.htp.model;

import by.htp.logic.Actions;

public abstract class Account implements Actions{

	private int accountAmount;
	private boolean accountState;
		
	public Account(){
		
	}
	
	public Account(int amount){
		this.accountAmount = amount;
		this.accountState = true;
	}
	
	public void setAccountAmount(int amount){
		this.accountAmount = amount;
	}
	
	public void setAccountState(boolean state){
		this.accountState = state;
	}
	
	public int getAccountAmount(){
		return this.accountAmount;
	}
	
	public boolean getAccountState(){
		return this.accountState;
	}
	
	public void blockAccount(){
		this.accountState = false;
	}
	
	public void unblockAccount(){
		this.accountState = true;
	}
	
	public String stringAccountState(){
		String str;
		if(this.accountState == true)
			str = "активен";
		else
			str = "заблокирован";
		return str;
	}
	
}
