
public class Scan extends Area {
	
	public void checkoutProduct(Sale order, Product item) {
		order.setProduct(item);
	}
	
	public void checkoutProduct(Sale order, RestrictedProduct item, Employee nameEmployee, Customer nameCustomer) {
		order.setProduct(item, nameCustomer, nameEmployee);
	}
	
}
