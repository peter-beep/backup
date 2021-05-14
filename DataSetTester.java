
public class DataSetTester {
	public static void main(String args[])
	{
		DataSet d = new DataSet();
		d.addValue(5);
		d.addValue(10);
		d.addValue(15);
		d.addValue(20);
		System.out.println("Actual output: " + d.getSum());
		System.out.println("Expected: 50");
		System.out.println("Actual output: " + d.getAverage());
		System.out.println("Expected: 12.5");
	}
}
