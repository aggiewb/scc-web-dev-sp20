
public class Scan extends Area {
	private int barcodeId;
	
	Scan(int weight){
		super(weight);
	}
	
	public void setBarcodeId(int barCode) {
		this.barcodeId = barCode;
	}

	public int getBarcodeId() {
		return barcodeId;
	}

}
