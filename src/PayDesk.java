import java.util.ArrayList;
import java.util.List;

import discountcards.DiscountCard;

// Paydesk class containing methods that output the discount and total purchase value
public class PayDesk {

	DiscountCard discountCard = new DiscountCard();

	private double discountRate = discountCard.discountRate();

	private double purchaseValue;

	// List collection that keeps discount card objects
	private List<DiscountCard> discountCards;

	// Empty constructor (formality)
	public PayDesk() {
	}

	// Method for counting discount
	public double discount(double purchaseValue, double discountRate) {
		double discount = purchaseValue * discountRate;
		return discount;
	}

	// Method for counting of total purchase value
	public double totalPurchaseValue(double purchaseValue, double discountRate) {
		double totalPurchaseValue = purchaseValue - purchaseValue * discountRate;
		return totalPurchaseValue;
	}

	// Constructor with fields
	public PayDesk(DiscountCard discountCard, double purchaseValue, ArrayList<DiscountCard> discountCards) {
		this.discountCard = discountCard;
		this.purchaseValue = purchaseValue;
		this.discountCards = discountCards;
	}

	// Getters and setters
	public double getPurchaseValue() {
		return purchaseValue;
	}

	public void setPurchaseValue(double purchaseValue) {
		this.purchaseValue = purchaseValue;
	}

	public List<DiscountCard> getDiscountCards() {
		return discountCards;
	}

	public void setDiscountCards(List<DiscountCard> discountCards) {
		this.discountCards = discountCards;
	}

	//Method for adding discountCards in list
	public void addDiscountCard(DiscountCard tempDC) {
		if (tempDC == null) {
			discountCards = new ArrayList<>();
		}
		//discountCards.add(tempDC);

	}

	// toString method (formality)
	@Override
	public String toString() {
		return "PayDesk [discountCard=" + discountCard + ", purchaseValue=" + purchaseValue + ", discountCards="
				+ discountCards + "]";
	}

}
