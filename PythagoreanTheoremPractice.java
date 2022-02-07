import java.util.Scanner;
// here is only could put numbers, not Strings. I need numeric keypad.
class PythagoreanTheoremPractice {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		// should use String, I need null value.
		System.out.println("put values you know. put 00(double zero) to the value you wanna know.");
		System.out.printf("Short Side 1= ", "\n");
		float a = in.nextFloat();
		System.out.printf("Shout Side 2= ", "\n");
		float b = in.nextFloat();
		System.out.printf("Long Side = ", "\n");
		float c = in.nextFloat();
		System.out.printf("\n");
		
		// double 보다 float을 많이 씀.
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		System.out.println("c= " + c);
		System.out.printf("\n");
		
		if (a == 00) {
			double B = b;
			double C = c;
			
			double A = Math.sqrt(Math.pow(C, 2) - Math.pow(B, 2));
			System.out.printf("Short Side 1= " + A);

		} else {
			
			if (b == 00) {
				double A = a;
				double C = c;
				
				double B = Math.sqrt(Math.pow(C, 2) - Math.pow(A, 2));
				System.out.printf("Short Side 2= " + B);
			} else {

				if (c == 00) {
					double A = a;
					double B = b;
					
					double C = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2));
					System.out.printf("long Side= " + C);
				}
			}
		}
	}
}
