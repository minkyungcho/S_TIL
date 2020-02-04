package hwjava06_서울_9_조민경;

public class Product {
	
	private int id;
	private String name;
	private int price;
	private int remainder;

	public Product() {
	}
	
	public Product(int id, String name, int price, int remainder) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.remainder = remainder;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRemainder() {
		return remainder;
	}

	public void setRemainder(int remainder) {
		this.remainder = remainder;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", price=" + price + ", remainder=" + remainder;
	}
	
}
