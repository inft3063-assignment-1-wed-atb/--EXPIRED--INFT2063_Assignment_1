import java.util.Scanner;

public class CashRegister {
	public static void main(String[] args) {
		String dollar_symbol = "$";

		String s, c;
		char proceed;
		double balance;
		boolean endProgram = true;

		Scanner in = new Scanner(System.in);

		System.out.print("Please enter cash register's float:");
		s = in.nextLine();
		balance = Double.parseDouble(s);

		while (endProgram) {
			
			System.out.println("Would you like to proceed with the transaction? (y/n)");
			proceed = in.next().charAt(0);

			if (proceed == 'y' || proceed == 'Y') {

				System.out.print("Please enter the item's name:");
				s = in.nextLine();

				System.out.print("Please enter the item's cost:");
				c = in.nextLine();

				Transaction trans = new Transaction(s, Double.parseDouble(c));

				System.out.print("Please enter the cash amount tendered:");
				s = in.nextLine();
				c = Double.toString(Double.parseDouble(s) - trans.getCost());

				System.out.println("Amount of change required = " + dollar_symbol + c);

				c = Double.toString(balance + trans.getCost());

				System.out.println("Balance of the Cash Register: " + dollar_symbol + c);

			}
// thanks for coming should be changed in the next update
			else if (proceed == 'n' || proceed == 'N') {
				System.out.println("Thanks for coming.");
				endProgram=false;
			}

			else {
				System.out.println("Invalid input. Please try again");
			}

		}


	}
}
