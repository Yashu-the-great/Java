import java.util.Scanner;

public class decimal_to_any_base {
	public static void main(String args[]) {
		System.out.println("-------------------- START --------------------\n\n");

		Scanner ss = new Scanner(System.in);
		double num = 0, base = 0, fract = 0;
		String R = "", s = "0123456789ABCDEF"; // available till base to 16 ;

		System.out.print("Enter the number : ");
		num = ss.nextDouble();

		System.out.print("Enter the base : ");
		base = ss.nextDouble();

		int n = (int) num;
		fract = num-n;

		while(n > 0) {
			int r = n % ((int)base);
			R = s.charAt(r) + R;
			n /= base;
		}

		R+=".";

		if(fract == 0.0) {
			R+=0;
			System.out.println("\nThe Base : " + base);
			System.out.println("Converted Number : " + R);
			System.out.println("\n\n-------------------- END --------------------");
			System.exit(0);
		}

		for(int i = 0;i<= 10;i+=1) {
			fract *= base;
			n = (int) fract;
			R+=s.charAt(n);
			fract -= n;
			if(fract == 0.0) {
				break;
			}
		}

		System.out.println("\nThe Base : " + base);
		System.out.println("Converted Number : " + R);
		System.out.println("\n\n-------------------- END --------------------");
		System.exit(0);

	}
}
