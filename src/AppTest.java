
import java.text.DecimalFormat;
import discountcards.BronzeCard;
import discountcards.DiscountCard;
import discountcards.GoldCard;
import discountcards.SilverCard;

/**
 * Three different discounts for three different cards type.
 * 
 **/
public class AppTest {

	public static void main(String[] args) {

		// Instantiating discount card objects
		DiscountCard bronze = new BronzeCard();
		DiscountCard silver = new SilverCard();
		DiscountCard gold = new GoldCard();

		double bronzePurchase = 150;
		double silverPurchase = 850;
		double goldPurchase = 1300;

		// Setting values for discount card attributes for owner, and turnover
		bronze.setOwner("Dragan");
		bronze.setTurnover(0);

		silver.setOwner("Dejan");
		silver.setTurnover(600);

		gold.setOwner("Dusan");
		gold.setTurnover(1500);

		double bronzeDiscountRate = PayDesk.discountRate(bronze);
		double bronzeDiscount = PayDesk.discount(bronze, bronzePurchase);
		double bronzePurchaseValue = PayDesk.totalPurchaseValue(bronze, bronzePurchase);

		double silverDiscountRate = PayDesk.discountRate(silver);
		double silverDiscount = PayDesk.discount(silver, silverPurchase);
		double silverPurchaseValue = PayDesk.totalPurchaseValue(silver, silverPurchase);

		double goldDiscountRate = PayDesk.discountRate(gold);
		double goldDiscount = PayDesk.discount(gold, goldPurchase);
		double goldPurchaseValue = PayDesk.totalPurchaseValue(gold, goldPurchase);

		// Formating double result, trimming it to two decimal
		DecimalFormat df = new DecimalFormat("#.##");
		// Printing out results for all three cards
		System.out.println("Example output for bronze discount card: -----------------------------------------");
		System.out.println("Purchase value is : " + df.format(bronzePurchase));
		System.out.println("Discount rate is : " + df.format(bronzeDiscountRate * 100) + "%");
		System.out.println("Purchase discount is : " + df.format(bronzeDiscount));
		System.out.println("Total purchase value is : " + df.format(bronzePurchaseValue));
		System.out.println("----------------------------------------------------------------------------------");

		System.out.println("Example output for silver discount card: -----------------------------------------");
		System.out.println("Purchase value is : " + df.format(silverPurchase));
		System.out.println("Discount rate is : " + df.format(silverDiscountRate * 100) + "%");
		System.out.println("Purchase discount is : " + df.format(silverDiscount));
		System.out.println("Total purchase value is : " + df.format(silverPurchaseValue));
		System.out.println("----------------------------------------------------------------------------------");

		System.out.println("Example output for gold discount card: -------------------------------------------");
		System.out.println("Purchase value is : " + goldPurchase);
		System.out.println("Discount rate is : " + df.format(goldDiscountRate * 100) + "%");
		System.out.println("Purchase discount is : " + df.format(goldDiscount));
		System.out.println("Total purchase value is : " + df.format(goldPurchaseValue));
		System.out.println("----------------------------------------------------------------------------------");
	}
}