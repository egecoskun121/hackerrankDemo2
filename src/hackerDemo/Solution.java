package hackerDemo;

public class Solution {
	static boolean flag;
	static int[] x= {0,0};
	static int B;
	static int H;
	

	public static void calculateArea(int B, int H) throws java.lang.Exception {
		x[0]=B;
		x[1]=H;
		

		if (x[0] <= 0 || x[1] <= 0) {
			throw new java.lang.Exception("Breadth and height must be positive");
		} else if (x[0] < 100 && x[0] > -100 && x[1] < 100 && x[1] > -100) {
			
			
			flag = true;

		} else {
			throw new java.lang.Exception("Breadth and height must be positive");
			
			
		}
	}
	static {
		try {
			calculateArea(1,2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args){
		if (flag) {
			int area = B*H;
			System.out.print(area);
		}

	}

}
