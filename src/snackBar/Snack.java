package snackBar;

public class Snack
{
	//fields
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineId;

	public Snack(int id, String name, int quantity, double cost, int vendingMachineId)
	{
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineId = vendingMachineId;
	}

	//getters
	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public double getCost()
	{
		return cost;
	}

	public int getQuantity()
	{
		return quantity;
	}

	//setters
	public void setId(int newId)
	{
		this.id = newId;
	}

	public void setName(String newName)
	{
		this.name = newName;
	}

	public void setCost(double newCost)
	{
		this.cost = newCost;
	}

	public void addQuantity(int amount)
	{
		this.quantity += amount;
	}

	public void buySnack(int amount)
	{
		this.quantity -= amount;
	}

	public double getTotalCost(int amount)
	{
		return this.cost * amount;
	}
}
