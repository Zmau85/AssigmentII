
import discountcards.DiscountCard;

// Paydesk class containing methods that output the discount and total purchase value
public class PayDesk {

	// Empty constructor 
	public PayDesk() {
	}

	// Method for calculating discount
	public static double discount(DiscountCard discountCard, double purchaseValue) {
		double discount = purchaseValue * discountCard.getDiscountRate();
		return discount;
	}

	// Method for calculating total purchase value
	public static double totalPurchaseValue(DiscountCard discountCard, double purchaseValue) {
		double totalPurchaseValue = purchaseValue - purchaseValue * discountCard.getDiscountRate();
		return totalPurchaseValue;
	}

	// Method for getting discount Rate for the card
	public static double discountRate(DiscountCard discountCard) {
		discountCard.discountRate();
		return discountCard.getDiscountRate();
	}

}