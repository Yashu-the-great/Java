public class Addition {
	public static void main(String args[]) {
		// Program starts here.
		System.out.print("-------------------- START --------------------\n\n");
		String first="", second="",Result="";

		// Variable to get the numbers
		String v = "0123456789ABCDEF";

		// Getting the numbers
		System.out.print("Enter the First Number : ");
		first = new java.util.Scanner(System.in).nextLine();
		System.out.print("Enter the Second Number : ");
		second = new java.util.Scanner(System.in).nextLine();

		// Making length of both numbers equal by adding zeros;
		while(first.length() != second.length()) {
			if(first.length() > second.length()) {
				second = "0" + second;
			}
			if(first.length() < second.length()) {
				first = "0" + first;
			}
		}

		// Adding extra zeros for carry number;
		first = "0" + first;
		second = "0" + second;

		// Getting the base of the numbers.
		System.out.print("Enter the Base : ");
		int base = new java.util.Scanner(System.in).nextInt();
		int c = 0, m = 0;

		// Adding the Numbers
		for(int i=first.length()-1;i>=0;i-=1) {
			m = c + v.indexOf(first.charAt(i)) + v.indexOf(second.charAt(i));
			Result = v.charAt(m % base) + Result;
			c = m/base;
		}

		// Printing the result.
		System.out.println("The Result is : " + Result);

		System.out.println("\n\n-------------------- END --------------------");

		// End of the program.
	}
}
