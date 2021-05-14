
public class DataSet {

	private int count;
	private int sum;
	public DataSet()
	{
		count = 0;
		sum = 0;
	}
	public void addValue(int x)
	{
		sum+=x;
		count++;
	}
	public int getSum()
	{
		return sum;
	}
	public double getAverage()
	{
		return (double)sum/(double)count;
	}
	
}
