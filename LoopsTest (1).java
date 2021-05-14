
public class LoopsTest {
	public static void main(String args[])
	{
		
//		for(int i = 0; i < 10; i++)
//		{
//			System.out.println(i);
//		}
//		
//		int i = 0;
//		
//		while(i<10)
//		{
//	
//			System.out.println(i);
//			i++;
//			
//		}
//		
//		
//		int i = 0;
//		
//		//a do while loop will carry out an operation first and then check if it is FALSE/TRUE afterwards.
//		
//		do {
//			
//			
//			System.out.println(i);
//			i++;
//			
//		}
//		
//		while(i<10);
		
		int i = 2;
		while(i >= -4)
		{
			for(int h = i; h > 0; h--)
			{
				System.out.println(i*h);
			}
			int j = i; //value of i is dependent on the value of j.  What i is, j will be affected by.
			do
			{
				System.out.println(j);
			}
			while(j > 2);
			i--;
		}
		
		/*
		 * 
		 * for(int h = i; i > 0; i++) --> example of an infinite loop
		 * 
		 * 
		 * 4
		 * 2
		 * 2
		 * 1
		 * 1
		 * 0
		 * -1
		 * -2
		 * -3
		 * -4
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
	}

}
