
public class BottleTester {
	public static void main(String args[])
	{
		Bottle b1 = new Bottle("2");
		Bottle b2 = new Bottle("2");
		Bottle b3 = new Bottle("2");
		Bottle b4 = new Bottle("2");
		Bottle b5 = new Bottle("2");
		Bottle b6 = null;
		
		//if you are in the code of an if statement, then you cannot get into the body of the else portion; you cannot carry out both alternatives.
		
		if (b6==null && b3!=b6) {
			System.out.println(1);
			if (b4.toString().compareTo(b3.toString()) >= 0) //if a number comes earlier, it has a lower ranking than its corresponding numbers.
			{
				System.out.println(2);
				if (b3.toString().compareTo(b5.toString()) < 0) //for numbers, subtract them when using the compareTo method, which can help to deteermine whether they are less or greater than zero.
				{
					System.out.println(3);
				}
				if (b3.toString() != b4.toString()) //refers to an object, not a number or string.
					//When you use ".equals" which can onlty be used with Strings, you are comparing the individual values to each other and they are the same.
					//When you have  "==" sign, you are comparing objects which takes into account its name etc...
					System.out.println(9);
				else {
					System.out.println(4);
					for (int h = 9; h > 0; h--)
					{
						for (int x = h; x > 0; x--) 
						{
							System.out.println(h * x);
						}
					}
					return;
				}
				System.out.println(10);
			} else
				System.out.println(5);
		} else {
			System.out.println(6);
			if (b5.toString().equals(b2.toString()))
				System.out.println("success");
		}
	}
	}
