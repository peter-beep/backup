public class IfTest {
	public static void main(String args[]) {
		double toCheck = 9.3;
		if (toCheck > 8.235) {
			System.out.println(1);
			if (toCheck > 9.23) {
				System.out.println(2);
				if (toCheck > 9.56) {
					System.out.println(3);
				}
				if (toCheck > 9.4)
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
			if (toCheck >= 8.235)
				System.out.println("success");
		}
	}

}
