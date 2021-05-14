package DividendCalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		try{
			
		}catch(NumberFormatException e)
		{
			System.exit(0);
		}

		System.out.println("Copyright stuff © ");
		System.out.print("What is the ticker symbol? ");
		String ticker = input.nextLine();
		System.out.print("What is the current price? ");
		double price = input.nextDouble();
		input.nextLine();
		System.out.print("How much do you want to invest? ");
		double invest = input.nextDouble();
		input.nextLine();

		// if statements { stock = true } else { stock = false }
		boolean stock = true;
		
		
		String type = (stock)?"Stock":"ETF";
		
		double dividends[] = null;
		String mORq = "";
		double distRate = 0;

		if (stock) {
			dividends = new double[4];
			for (int i = 0; i < 4; i++) {
				System.out.print("Quarter " + (i + 1)
						+ " dividend payment amount (actual/projected): ");
				dividends[i] = input.nextDouble();
				input.nextLine();
			}
		} else {
			System.out.print("Does the ETF pay monthly or quarterly? ");
			mORq = input.nextLine();
			System.out.print("What is the Current Distribution per share? ");
			distRate = input.nextDouble();
			input.nextLine();
		}

		int purchased = (int) (invest / price);
		double left = invest - (price * purchased);
		int divide = (mORq.equalsIgnoreCase("Monthly")) ? 4 : 12;
		double percent = (distRate * divide) / price * 100;
		double payment = distRate*purchased;

		System.out.println("Stock Symbol: " + ticker);
		System.out.println("Type: " + type);
		System.out.println();
		System.out.println("Price: $" + price);
		System.out.println();
		System.out.println("Investment Amount: $" + invest);
		System.out.println();

		System.out.println("Total shares that can be purchased: " + purchased);
		System.out.println("Money left over from investment: "
				+ Double.parseDouble(new DecimalFormat("#.##").format(left)));

		double sum = 0;
		double m = 0;
		double d = 0;
		if (stock) {
			for (double i : dividends)
				sum += i;
			m = (sum / 4.0) * purchased;
			d= sum / price * 100;
			System.out.println("Quarterly Dividend Payout is: "
					+ Double.parseDouble(new DecimalFormat("#.##")
							.format(m)));
		} else {			
			d = percent;
			m= payment;
			if(divide == 4)
				System.out.println("Quarterly Dividend Payout is: "
					+ Double.parseDouble(new DecimalFormat("#.##")
							.format(m)));
			else
				System.out.println("Monthly Dividend Payout is: "
						+ Double.parseDouble(new DecimalFormat("#.##")
								.format(m)));
		}
		System.out.println("Projected Dividend rate is : "
				+ Double.parseDouble(new DecimalFormat("#.##").format(d)) + "%");
	}

}