package day15_스트림을이용하여패키지여행비용계산;

public class TravelCustomer {
	
	private String name;
	private int age;
	private int price;
	
	//컨스트럭터
	public TravelCustomer(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getPrice() {
		return price;
	}
	
	public void setNAme(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public String toString() {
		return "name: " + name+" age: "+age+" price: "+price;
	}
}
