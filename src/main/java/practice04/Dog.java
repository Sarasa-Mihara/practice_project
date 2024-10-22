package practice04;

public class Dog extends Animal {
	
	private String fulColor;
	
	public Dog(String name, int age, String fulColor) {
		super(name, age);
		this.fulColor = fulColor;
	}
	
	public String getFulColor() {
		return this.fulColor = fulColor;
	}
	public void setFulColor(String fulColor) {
		this.fulColor = fulColor;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("毛の色：" + this.getFulColor());
	}
	
	public void cry() {
		System.out.println("鳴き声：ワン");
	}
}
