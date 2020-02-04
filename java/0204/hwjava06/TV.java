package hwjava06_서울_9_조민경;

public class TV extends Product{
	
	private int inch;
	private String type;
	
	public TV() {
		super();
	}
	public TV(int id, String name, int price, int remainder, int inch, String type) {
		super(id, name, price, remainder);
		this.inch = inch;
		this.type = type;
	}
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "TV "+super.toString()+", inch=" + inch + ", type=" + type + "]";
	}
	
	
}
