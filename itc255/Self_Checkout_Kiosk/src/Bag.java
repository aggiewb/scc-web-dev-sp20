
public class Bag extends Area {
	Bag(int weight){
		super(weight);
	}
	
	public void alertCustomer(double productWeight) {
		if(productWeight != super.getWeight()) {
			System.out.println("Remove product from bagging area and try again.");
		}
	}

}
