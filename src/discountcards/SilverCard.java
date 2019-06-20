package discountcards;

// Silver card that inherit discount card class
public class SilverCard extends DiscountCard {

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

	// Overridden method for counting discount rate that depends from silver card's turnover
	@Override
	public double discountRate() {
		double discountRate = 0;	//initialization of local variable
		if (getTurnover() < 100) {
			discountRate = 0.02;
			setDiscountRate(discountRate);	//usage of local variable for adjustment setter
		} else if (getTurnover() > 300) {
			discountRate = 0.035;
			setDiscountRate(discountRate);

		}
		return discountRate;
	}

	//* toString method 
	@Override
	public String toString() {
		return super.toString();
	}

}
