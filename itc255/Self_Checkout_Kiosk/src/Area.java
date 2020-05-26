
public abstract class Area {
	private double weight;
	
	Area(double weight){
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}
	
	public boolean checkWeight(double weight) {
		if(weight == this.weight) {
			return true;
		} else {
			return false;
		}
	}
}
