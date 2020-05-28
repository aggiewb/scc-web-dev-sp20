import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Sale {
	private long saleID;
	private ArrayList<Product> products = new ArrayList<Product>();
	private BigDecimal subTotal = new BigDecimal(0);
	private BigDecimal taxRate = new BigDecimal(0.10);
	private BigDecimal totalTax = new BigDecimal(0);
	private BigDecimal total = new BigDecimal(0);
	private BigDecimal discountDivisor = new BigDecimal(15);
	private BigDecimal discount = new BigDecimal(0);
	
	Sale(int saleId){
		this.saleID = saleId;
	}

	public long getSaleID() {
		return saleID;
	}
	
	public void setDiscount(Customer name) {
		BigDecimal rewardPoints = new BigDecimal(name.getTotalRewardPoints());
		// points divided by amount of points per 1%
		rewardPoints = rewardPoints.divide(this.discountDivisor, 2);
		// percent representation divided by 100 to get percent in decimal
		//multiply subtotal times decimal percentage off to get totalDiscount
		this.discount = this.subTotal.multiply(rewardPoints.divide(new BigDecimal(100)));
	}
	
	public BigDecimal getDiscount() {
		return this.discount.setScale(2, RoundingMode.HALF_EVEN);
	}
	
	public void setProduct(Product item) {
		products.add(item);
	}
	
	public void setProduct(RestrictedProduct item, Customer name, Employee worker) {
		if(item.requestEmployeeApproval(worker, name)) {
			this.setProduct(item);
		}
	}
	
	public ArrayList<Product> getProducts() {
		return products;
	}
	
	public void setSubTotal() {
		for(Product item : this.products) {
			BigDecimal price = new BigDecimal(item.getPrice());
			MathContext mc = new MathContext(String.valueOf(item.getPrice()).length());
			this.subTotal = price.add(this.subTotal, mc);
		}
	}
	
	public BigDecimal getSubTotal() {
		return this.subTotal.setScale(2);
	}
	
	public void setTotal(Customer name) {
		this.total = totalTax.add(this.subTotal.subtract(this.discount));
	}
	
	public BigDecimal getTotal() {
		return this.total.setScale(2, RoundingMode.HALF_EVEN);
	}
	
	public void setTotalTax() {
		this.totalTax = this.subTotal.multiply(this.taxRate);
	}
	
	public BigDecimal getTotalTax() {
		return this.totalTax.setScale(2, RoundingMode.HALF_EVEN);
	}
	
	public BigDecimal getTaxRate() {
		return this.taxRate.multiply(new BigDecimal(100)).setScale(2, RoundingMode.HALF_UP);
	}
	
	public String toString() {
		return "Order Number: " + this.saleID;
	}
	
	public void removeItem(int productIndex) {
		this.products.remove(productIndex);
	}
	
	public void removeAllItems() {
		this.products.clear();
	}
	
}
