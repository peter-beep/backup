package Sem2;

public class Package {
	String item;
	public Package(String i)
	{
		item = i;
	}
	public String toString()
	{
		return item;
	}
	public boolean equals(Object x)
	{
		if(x instanceof Package)
		{
			Package p = (Package) x;
			return toString().equals(p.toString());
		}
		return false;
	}

}
