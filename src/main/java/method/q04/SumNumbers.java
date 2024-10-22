package method.q04;

public class SumNumbers {

	public static void main(String[] args) {
		int x = 3;
		int y = 2;
		System.out.println("第一引数：" + x);
		System.out.println("第二引数：" + y);
		System.out.println("加算結果：" + calculateSum(x, y));
	}
	
	public static int calculateSum(int x, int y) {
		return x + y;
	}
}
