package bcits.java.page2;

public class ProductInfoBean {
	
	int id;
	String Name;
	double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ProductInformation \n	id=" + id + "\n	Name=" + Name + "\n	price=" + price ;
	}
}
