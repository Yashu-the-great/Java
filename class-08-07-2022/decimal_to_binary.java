import java.util.Scanner;

public class decimal_to_binary {

	static String decimal_to_binary(int num) {
		// Using Strings
		String bin = ""; // Variable to store binary string;
		while(num > 0) {
			int digit = num % 2;
			bin = digit + bin;
			num /= 2;
		}
		return bin;
	}

	static void decimal_to_binary2(int num) {
		// Using Number system converstion
		int p=1, copy = num;
		while( p <= copy/2) {
			p*=2;
		}

		while(p>0) {

			if(num >= p) {
				System.out.print("1");
				num -= p;
			} else {
				System.out.print("0");
			}
			p /= 2;
		}

	}

	public static void main(String args[]) {
		System.out.println("\n\n------------------------- START ---------------------------\n\n");

		Scanner ss = new Scanner(System.in); // Scanner Class declaration
		System.out.print("Enter a number :");

		// Getting user input
		int num = ss.nextInt();
		System.out.println();

		// Using String single loop method
		System.out.println("Using String single Loop :" +  decimal_to_binary(num));

		// Using Number system method.
		System.out.print("Using Number system:");
		decimal_to_binary2(num);

		// End of the program
		System.out.println("\n\n------------------------- END ---------------------------");
	}
}
