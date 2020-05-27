import java.util.TreeMap;

public class Sale {
	private long saleID;
	private TreeMap<Product, Integer> products;
	private int subTotal;
	private static double tax = 0.10;
	private int discount;
	private int total;
	
	Sale(int saleId){
		this.saleID = saleId;
	}

	public long getSaleID() {
		return saleID;
	}

	public double getTax() {
		return Sale.tax;
	}

	public int getDiscount(Customer name) {
		return (name.getTotalRewardPoints()) / 10;
	}
	
	public void setProduct(Product item) {
		if(products.containsKey(item)) {
			products.replace(item, products.get(item) + 1);
		} else {
			products.put(item, 1);
		}
	}
	
	public void setProduct(RestrictedProduct item, Customer name, Employee worker) {
		if(item.requestEmployeeApproval(worker, name)) {
			if(products.containsKey(item)) {
				products.replace(item, products.get(item) + 1);
			} else {
				products.put(item, 1);
			}
			
		}
	}
	
	public TreeMap<Product, Integer> getProducts() {
		return products;
	}
	
	public void getSubTotal(TreeMap<Product, Integer> items) {
		for(Product item : items.keySet()) {
			this.subTotal += item.getPrice() * items.get(item);
		}
	}
	
	public void calculateTotal() {
		 this.total = (int) ((this.subTotal * Sale.tax) - (this.subTotal * (this.discount / 100)));
	}
	
	public double getTotal() {
		return this.total;
	}
	
	public String toString() {
		return this.saleID + " ";
	}
	
}
