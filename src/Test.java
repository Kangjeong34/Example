	class Phone {
	private int price;
	private String model;
	private static final String MADE = "APPLE";
	private static int count = 0;
	
	public Phone() {
		// TODO Auto-generated constructor stub
	}
	public Phone(int price, String model) {
		super();
		this.price = price;
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
public class Test {
public static void main(String[] args) {
	
	Phone p = new Phone(2, "Iphone11");
}
}
