package method.q09;

import java.util.Random;

public class Even {

	public static void main(String[] args) {
		Random ran = new Random();
		int num = ran.nextInt(20);
		if (checkEven(num)) {
			System.out.println(num + "は偶数です。");
		} else {
			System.out.println(num + "は奇数です。");
		}
	}
	
	public static boolean checkEven(int num) {
		boolean judgement;
		if (num % 2 == 0) {
			judgement = true;
		} else {
			judgement = false;
		}
		return judgement;
	}
}
