package method.q07;

public class SumNumbers2 {

	public static void main(String[] args) {
		int integer = 5;
		double realNumber = 3.3;
		System.out.println("第一引数：" + integer);
		System.out.println("第二引数：" + realNumber);
		System.out.println("加算結果：" + calculateSum(integer, realNumber));
	}
	
	public static int calculateSum(int integer, double realNumber) {
		int num = integer + (int)realNumber;
		return num;
	}
}
