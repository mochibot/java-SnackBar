package snackBar;

public class Main
{
	public static void main(String[] args)     //main method to run
	{
		Customer jane = new Customer(1, "Jane", 45.25);
		Customer bob = new Customer(2, "Bob", 33.14);	

		VendingMachine food = new VendingMachine(1, "Food");
		VendingMachine drink = new VendingMachine(2, "Drink");
		VendingMachine office = new VendingMachine(3, "Office");

		Snack chips = new Snack(1, "Chips", 36, 1.75, 1);
		Snack chocolateBar = new Snack(2, "Chocolate bar", 36, 1.00, 1);
		Snack pretzel = new Snack(3, "Preztel", 30, 2.00, 1);
		Snack soda = new Snack(4, "Soda", 24, 2.50, 2);
		Snack water = new Snack(5, "Water", 20, 2.75, 2);

		soda.buySnack(3);
		jane.buy(soda.getTotalCost(3));
		System.out.println(jane.getCash());   //37.75
		System.out.println(soda.getQuantity());  //21

		pretzel.buySnack(1);
		jane.buy(pretzel.getTotalCost(1));
		System.out.println(jane.getCash());    //35.75
		System.out.println(pretzel.getQuantity());   //29

		soda.buySnack(2);
		bob.buy(soda.getTotalCost(2));
		System.out.println(bob.getCash());    //28.14
		System.out.println(soda.getQuantity());   //19

		jane.addCash(10);
		System.out.println(jane.getCash());   //45.75

		chocolateBar.buySnack(1);
		jane.buy(chocolateBar.getTotalCost(1));
		System.out.println(jane.getCash());    //44.75
		System.out.println(chocolateBar.getQuantity());  //35

		pretzel.addQuantity(10);
		System.out.println(pretzel.getQuantity());   //39

		pretzel.buySnack(3);
		bob.buy(pretzel.getTotalCost(3));
		System.out.println(bob.getCash());  //22.14
		System.out.println(pretzel.getQuantity());  //36

		//for stretch
		System.out.println(chips.getQuantity() + " " + chips.getName() + " at total cost of " + chips.getTotalCost(chips.getQuantity()) + " in vending machine " + food.getName());
		System.out.println(chocolateBar.getQuantity() + " " + chocolateBar.getName() + " at total cost of " + chocolateBar.getTotalCost(chocolateBar.getQuantity()) + " in vending machine " + food.getName());
		System.out.println(pretzel.getQuantity() + " " + pretzel.getName() + " at total cost of " + pretzel.getTotalCost(pretzel.getQuantity()) + " in vending machine " + food.getName());
		System.out.println(soda.getQuantity() + " " + soda.getName() + " at total cost of " + soda.getTotalCost(soda.getQuantity()) + " in vending machine " + drink.getName());
		System.out.println(water.getQuantity() + " " + water.getName() + " at total cost of " + water.getTotalCost(water.getQuantity()) + " in vending machine " + drink.getName());
	}
}

/*
Steps to run
1. compile to bytecode
javac snackBar/*.java

2. combine into jar file
jar cvfe snackBar.jar snackBar.Main snackBar/*.class

3. execute jar file
java -jar snackBar.jar
*/