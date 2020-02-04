package hwjava06_서울_9_조민경;

public class Refrigerator extends Product{

	private int liter;
	private int height;
	public Refrigerator() {
		super();
	}
	public Refrigerator(int id, String name, int price, int remainder, int liter, int height) {
		super(id, name, price, remainder);
		this.liter = liter;
		this.height = height;
	}
	@Override
	public String toString() {
		return "Refrigerator "+super.toString()+", liter=" + liter + ", height=" + height + "]";
	}
	
	
	
}
