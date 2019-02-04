package snackBar
// needs id, name, quantity, cost, vending machine id


public class Snack
{
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    public Snack(String name, int quantity, double cost, int vendingMachineId)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    // set name
    public void setName(String name)
    {
        this.name = name;
    }

    // get quantity
    public int getQuantity()
    {
        return this.quantity;
    }

    // add quantity given quantity
    public void addQuantity(int quantity)
    {
        this.quantity += quantity;
    }

    // buy snack given quantity
    public void buySnack(int quantity)
    {
        this.quantity -= quantity;
    }

    // get total cost given quantity
    public double snackCost(int quantity)
    {
        return (this.cost * quantity);
    }
}
