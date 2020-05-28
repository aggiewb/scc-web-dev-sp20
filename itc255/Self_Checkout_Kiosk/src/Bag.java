
public class Bag extends Area {
	
	public void alertCustomer(Product item, double productWeight) {
		if(!Area.checkWeight(item, productWeight)) {
			System.out.println("Remove product from bagging area and try again.");
		} else {
			System.out.println("Scan next item.");
		}
	}
	
	public void alertCustomer(RestrictedProduct item, double productWeight) {
		if(!Area.checkWeight(item, productWeight)) {
			System.out.println("Remove product from bagging area and try again.");
		} else {
			System.out.println("Scan next item.");
		}
	}

}
