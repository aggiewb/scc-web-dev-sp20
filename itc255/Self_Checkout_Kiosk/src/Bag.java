
public class Bag extends Area {
	
	public String alertCustomer(Product item, double productWeight) {
		if(!Area.checkWeight(item, productWeight)) {
			String alertMessage = "Remove product from bagging area and try again.";
			System.out.println(alertMessage);
			return alertMessage;
		} else {
			String alertMessage = "Scan next item.";
			System.out.println(alertMessage);
			return alertMessage;
		}
	}
	
	public String alertCustomer(RestrictedProduct item, double productWeight) {
		if(!Area.checkWeight(item, productWeight)) {
			String alertMessage = "Remove product from bagging area and try again.";
			System.out.println(alertMessage);
			return alertMessage;
		} else {
			String alertMessage = "Scan next item.";
			System.out.println(alertMessage);
			return alertMessage;
		}
	}

}
