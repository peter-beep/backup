
public class PiggyBankTester 



{
	
	public static void main(String args[])
	
	
	{
		
		String a = "test ";
		String b = "this";
		System.out.println(a+b);
		
		
		PiggyBank piggy = new PiggyBank();
		PiggyBank p1 = new PiggyBank();
		
		System.out.println(a.length()+ b.length());
		System.out.println((a+b).length());
		
		String substring = "MynameisVatsalShah";
		System.out.println(substring.substring(0,2)+ " " +substring.substring(2,6)+ " " + substring.substring(6,8)+ " " + substring.substring(8,14));
		
		System.out.println(substring.charAt(14));
		
		char f = substring.charAt(2);
		int temp = (int)f;
		temp++;
		f = (char)temp;
		System.out.println(f);
		
	
		
		
		
		piggy.addPennies(1);
		piggy.addNickels(1);
		piggy.addDimes(5);
		piggy.addQuarters(3);
		
		piggy.getNumberOfPennies();
		piggy.getNumberOfNickels();
		piggy.getNumberOfDimes();
		piggy.getNumberOfQuarters();
		
		piggy.totalValue();
		
		
		System.out.println(piggy.getNumberOfPennies() + " "+piggy.getNumberOfNickels() + " "+ piggy.getNumberOfDimes() + " " +piggy.getNumberOfQuarters());
		System.out.println(piggy.totalValue());
		
		
	
	}

}
