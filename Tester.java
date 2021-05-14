package Sem2;

import java.util.ArrayList;

public class Tester {
	public static void main(String args[]) {

		
		
		int[] list = {2,5,9,6,3,7,4};
		
		
		
		int index = 3;
		int value = 8;
		
		
		
		int[] tempList = new int[list.length+1];
		for(int i = 0; i < index; i++)
		{
			tempList[i] = list[i];
		}
		
		//  tempList = [2, 5, 9,...]
		
		tempList[index] = value;
		
	//  tempList = [2, 5, 9, 8,...]
		
		
		for(int i = index; i<= list.length-1; i++)
		{
			tempList[i+1] = list[i];
		}
	//  tempList = [2, 5, 9, 8, 6, 3, 7, 4]
		
//		int store = -1;
		
		System.out.println(tempList);
		
		for(int i = 0; i<tempList.length; i++)
		{
			System.out.println(tempList[i]);
//			if(max>list[i])
//			{
//				max = list[i];
//			}
			
		}
		
		
		
//		System.out.println(store);
//		System.out.println(max);
//		ArrayList<Package> st = new ArrayList<Package>();
//
//		st.add(new Package("hi"));
//		st.add(new Package("hello"));
//		st.add(new Package("blah"));
//		st.add(new Package("bye"));
//
		// for(int i = 0; i < st.size(); i++)
		// {
		// st.set(i, new Package("to"));
		// }
		//
		// System.out.println(st);

//		for (int i = 0; i < st.size(); i++) 
//		{
//			Package p = st.get(i);
//			p = new Package("1");
//		}
//		
//		for (Package p : st) 
//		{			
//		}
//		System.out.println(st);

		// st.add("Hello");
		// st.add("World");
		// for(int i = 0; i < st.size(); i++)
		// {
		// st.set(i, "Hi");
		// }

		// for(String s : st)
		// {
		// System.out.println(s);
		// }

		// Scanner kbReader = new Scanner(System.in);
		// String s = kbReader.nextLine();

		// Scanner sc = new Scanner(s.trim());
		// int sum=0;// = sc.nextInt();
		// sc.useDelimiter("\\s*\\+\\s*|\\s*\\-\\s*");
		// sc.skip(Pattern.compile("\\s*\\-\\s*"));

		// while(sc.hasNextInt())
		// {
		// sum = sum + sc.nextInt();
		// }
		// System.out.println("Sum is: " + sum);
		// 3 + 3 + 6 - 5 - 2 + 4

		// while(true)
		// {
		// sc.findInLine("+");
		// if(sc.hasNextInt())
		// {
		// int temp = sc.nextInt();
		// sum+=temp;
		// }
		// else
		// break;
		// }
		// sc= new Scanner(s.trim());
		// while(sc.hasNext())
		// {
		// sc.findInLine("-");
		// if(sc.hasNextInt())
		// {
		// int temp = sc.nextInt();
		// sum-=temp;
		// }
		// else
		// break;
		// }
		// System.out.println(sum);

		// char[] ch = new char[45];
		// char x = 'a';
		// ch --> array
		// ch[i] --> varibale inside array

		// int a, y, z; //--> 3 int variables
		//
		// int[] q, w, j; // --> all 3 are integer arrays
		//
		// q = new int[45];
		// q[23] = 34;
		//
		// q = null;
		//
		// System.out.println(q[23]);

		// System.out.println(ch);

		// for(int i = 0; i < 50; i++)
		// {
		// if(i%2==0)
		// System.out.println(i);
		// }
		//
		// public Object get(int index) throws IndexOutOfBoundsException
		// {
		// ...
		// }

	}
}
