package snackBar;

public class Main
{
    private static void workWithData()
    {
        // Instantiate 2 customers
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        // Instantiate 3 vending machines
        VendingMachine vm1 = new VendingMachine("Food");
        VendingMachine vm2 = new VendingMachine("Drink");
        VendingMachine vm3 = new VendingMachine("Office");

        // Instantiate 5 snacks
        Snack s1= new Snack("Chips", 36, 1.75, food.getId());
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, food.getId());
        Snack s3 = new Snack("Pretzel", 30, 2.00, food.getId());
        Snack s4 = new Snack("Soda", 24, 2.50, drink.getId());
        Snack s5 = new Snack("Water", 20, 2.75, drink.getId());

        // get cost
        // reduce cash
        // print cash
        // reduce quantity
        // print quantity
    }

    // Where things are actually being done
    public static void main(String[] args)
    {
        workWithData();
    }
}
