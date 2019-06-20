package discountcards;

// Super class for discount cards
public class DiscountCard {

	// Fields of DiscountCard class
	private String owner;			

	private double turnover;

	private double discountRate;

	// Empty constructor 
	public DiscountCard() {
	}

	// Constructor with fields
	public DiscountCard(String owner, double turnover,double discountRate) {
		this.owner = owner;
		this.turnover = turnover;
		this.discountRate = discountRate;
	}

	// Getters and setters
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getTurnover() {
		return turnover;
	}

	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	// Method for counting discount rate that depends from turnovers
	public double discountRate() {
		return discountRate;
	}

	// toString method 
	@Override
	public String toString() {
		return "DiscountCard [owner=" + owner + ", turnover=" + turnover + "]";
	}

	

}
