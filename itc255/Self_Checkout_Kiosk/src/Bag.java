
public class Bag extends Area {
	private int barcodeId;
	
	Bag(int weight){
		super(weight);
	}
	
	public void setBarcodeId(int barCode) {
		this.barcodeId = barCode;
	}

	public int getBarcodeId() {
		return barcodeId;
	}

}
