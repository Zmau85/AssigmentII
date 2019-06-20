package discountcards;

// Gold card that inherit discount card class
public class GoldCard extends DiscountCard {

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

	// Overridden method for counting discount rate that depends from gold card's turnover
	@Override
	public double discountRate() {
		double discountRate = 0;	//initialization of local variable
		if (getTurnover() < 100) {
			discountRate = 0.02;	//usage of local variable for adjustment setter 
			setDiscountRate(discountRate);
		} else {
			for (int i = 1; i < 9; i++) {		//for loop to achive  discount rate grow of 1% for each $100 from the turnover, capping at 10%.
				if (getTurnover() >= 100 * i) {
					discountRate = 0.02 + 0.01 * i;
				}
				setDiscountRate(discountRate);
			}
		}
		return discountRate;
	}

	// toString method 
	@Override
	public String toString() {
		return super.toString();
	}

}
