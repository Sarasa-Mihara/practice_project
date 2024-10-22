package practice01;

public class EmployeeTest {
	
	public static void main(String[] args) {
		Employee e01 = new Employee();
		e01.name = "山田";
		e01.age = 20;
		e01.showInfo();
		System.out.println("------------------");
		
		Employee e02 = new Employee();
		e02.name = "鈴木";
		e02.age = 30;
		e02.showInfo();

	}
}
