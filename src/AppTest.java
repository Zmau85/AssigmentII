
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

		// Setting values for discount card attributes for owner, and turnover
		bronze.setOwner("Dragan");
		bronze.setTurnover(0);

		silver.setOwner("Dejan");
		silver.setTurnover(600);

		gold.setOwner("Dusan");
		gold.setTurnover(1500);

		// * Instantiating paydesk object
		PayDesk payDesk1 = new PayDesk();
		PayDesk payDesk2 = new PayDesk();
		PayDesk payDesk3 = new PayDesk();
		
		
		// adding bronze card to paydesk object and setting value for purchase value
		payDesk1.addDiscountCard(bronze);
		payDesk1.setPurchaseValue(150);

		// adding bronze card to paydesk object and setting value for purchase value
		payDesk2.addDiscountCard(silver);
		payDesk2.setPurchaseValue(850);

		// adding bronze card to paydesk object and setting value for purchase value
		payDesk3.addDiscountCard(gold);
		payDesk3.setPurchaseValue(1300);

		
		// Printing out results for all three cards
		System.out.println("Example output for bronze discount card: -----------------------------------------");
		System.out.println("Purchase value is : " + payDesk1.getPurchaseValue());	//calling getter for purchaseValue of payDesk1 instance
		System.out.println("Discount rate is : " + bronze.discountRate() * 100 + "%"); //calling method discountRate for bronze card object
		System.out.println(				// Calling method for counting discount, and passing needed values 
				"Purchase discount is : " + payDesk1.discount(payDesk1.getPurchaseValue(), bronze.getDiscountRate()));
		System.out.println("Total purchase value is : "		// Calling method for counting total purchase value, and passing needed values 
				+ payDesk1.totalPurchaseValue(payDesk1.getPurchaseValue(), bronze.getDiscountRate()));
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Example output for silver discount card: -----------------------------------------");
		System.out.println("Purchase value is : " + payDesk2.getPurchaseValue());//calling getter for purchaseValue of payDesk2 instance
		System.out.println("Discount rate is : " + silver.discountRate() * 100 + "%"); //calling method discountRate for silver card object
		System.out.println(				// Calling method for counting discount, and passing needed values 
				"Purchase discount is : " + payDesk2.discount(payDesk2.getPurchaseValue(), silver.getDiscountRate()));
		System.out.println("Total purchase value is : "		// Calling method for counting total purchase value, and passing needed values 
				+ payDesk2.totalPurchaseValue(payDesk2.getPurchaseValue(), silver.getDiscountRate()));
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Example output for gold discount card: -------------------------------------------");
		System.out.println("Purchase value is : " + payDesk3.getPurchaseValue());//calling getter for purchaseValue of payDesk3 instance
		System.out.println("Discount rate is : " + gold.discountRate() * 100 + "%"); //calling method discountRate for gold card object
		System.out.println(				// Calling method for counting discount, and passing needed values 
				"Purchase discount is : " + payDesk3.discount(payDesk3.getPurchaseValue(), gold.getDiscountRate()));
		System.out.println("Total purchase value is : "		// Calling method for counting total purchase value, and passing needed values 
				+ payDesk3.totalPurchaseValue(payDesk3.getPurchaseValue(), gold.getDiscountRate()));
		System.out.println("----------------------------------------------------------------------------------");
	}
}
