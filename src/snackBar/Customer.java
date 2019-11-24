package snackBar;

public class Customer
{
	private int id;
	private String name;
	private double cash;

	public Customer (int id, String name, double cash)
	{
		this.id = id;
		this.name = name;
		this.cash = cash;
	}

	public String getName()
	{
		return name;
	}

	public double getCash()
	{
		return cash;
	}

	public void setName(String newName)
	{
		this.name = newName;
	}

	public void addCash(double amount)
	{
		this.cash += amount;
	}

	public void buy(double amount)
	{
		this.cash -= amount;
	} 
}