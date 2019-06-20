package discountcards;

// Bronze card that inherit discount card class
public class BronzeCard extends DiscountCard {

	// Overridden methods from parent class
	@Override
	public String getOwner() {
		return super.getOwner();
	}

	@Override
	public void setOwner(String owner) {
		super.setOwner(owner);
	}

	@Override
	public double getTurnover() {
		return super.getTurnover();
	}

	@Override
	public void setTurnover(double turnover) {
		super.setTurnover(turnover);
	}

	@Override
	public double getDiscountRate() {
		return super.getDiscountRate();
	}

	@Override
	public void setDiscountRate(double discountRate) {
		super.setDiscountRate(discountRate);
	}

	// Overridden method for counting discount rate that depends from bronze card's turnover
	@Override
	public double discountRate() {
		double discountRate = 0;		//initialization of local variable and first condition if turnover is lower than 100
		if (getTurnover() >= 100 && getTurnover() <= 300) {
			discountRate = 0.01;
			setDiscountRate(discountRate);//usage of local variable to adjustment setter
		} else if (getTurnover() > 300) {
			discountRate = 0.0025;
			setDiscountRate(discountRate);
		}
		return discountRate;
	}

	// toString method 
	@Override
	public String toString() {
		return super.toString();
	}

}
