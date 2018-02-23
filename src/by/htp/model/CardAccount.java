package by.htp.model;

public class CardAccount extends Account{

	private Card card;
	
	public CardAccount(){
		super();
		this.card = new Card();	
	}
	
	public CardAccount(int amount, String cardType){
		super(amount);
		this.card = new Card(cardType);	
	}
	
	public Card getCard(){
		return this.card;
	}
	
	@Override
	public void blockAccount(){
		this.setAccountState(false);
		this.card.setCardState(false);
		
	}
	
	@Override
	public void unblockAccount(){
		this.setAccountState(true);
		this.card.setCardState(true);
		
	}
	
	@Override
	public void printAccount(){
		System.out.println("Карт-счет: ");
		System.out.println("Остаток: " + this.getAccountAmount() + " Состояние: " + this.stringAccountState());
		System.out.println("Карта: " + this.getCard().getCardType() + " Состояние карты: " + this.getCard().stringCardState());
		System.out.println("-----------------------------------------------");
	}
	
}
