package snackBar;
// needs id, name, cash on hand
// add cash, buy cash, get and set name, get cash on hand

public class Customer
{
    private static int maxId = 0;
    private int id;
    private String name;
    private double cash;

    public Customer(String name, double cash)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.cash = cash;
    }

    // Add cash
    public void addCash(double cash)
    {
        this.cash += cash;
    }

    // Buy stuff
    public void makePurchase(double cash)
    {
        this.cash -= cash;
    }

    // get name
    public String getName()
    {
        return this.name;
    }

    // set name
    public void setName(String name)
    {
        this.name = name;
    }

    // Get cash on hand
    public double cashOnHand()
    {
        return this.cash;
    }
}
