package method.q05;

public class Triangle {

	public static void main(String[] args) {
		int bottom = 8;
		int height = 5;
		System.out.println("底辺：" + bottom);
		System.out.println("高さ：" + height);
		System.out.println("三角形の面積：" + getTriangleArea(bottom, height));
	}
	
	public static int getTriangleArea(int bottom, int height) {
		int area = (bottom * height) / 2; 
		return area;
	}
}
