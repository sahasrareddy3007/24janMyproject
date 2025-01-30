
public class Car {
	
	String brand;
	String model;
	String name;
	float price;
	public Car(String brand, String model, String name, float price) {
		super();
		this.brand = brand;
		this.model = model;
		this.name = name;
		this.price = price;
	}
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", name=" + name + ", price=" + price + "]";
}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public static void main(String[] args) { 
        Car C = new Car("BMW","BMW M5","Z4 Roaster",1000000); 
        System.out.println(C); 
	}
}