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
        Snack s1= new Snack("Chips", 36, 1.75, vm1.id);
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, vm1.id);
        Snack s3 = new Snack("Pretzel", 30, 2.00, vm1.id);
        Snack s4 = new Snack("Soda", 24, 2.50, vm2.id);
        Snack s5 = new Snack("Water", 20, 2.75, vm2.id);

        // get cost
        double cost = s4.snackCost(3);
        // reduce cash
        c1.makePurchase(cost);
        // print cash
        System.out.println("Jane has: $" + c1.cashOnHand());
        // reduce quantity
        s4.buySnack(3);
        // print quantity
        System.out.println("Sodas: " + s4.getQuantity());

        // get cost
        cost = s3.snackCost(1);
        // reduce cash
        c1.makePurchase(cost);
        // print cash
        System.out.println("Jane has: $" + c1.cashOnHand());
        // reduce quantity
        s3.buySnack(1);
        // print quantity
        System.out.println("Pretzels: " + s3.getQuantity());

        // get cost
        cost = s4.snackCost(2);
        // reduce cash
        c2.makePurchase(cost);
        // print cash
        System.out.println("Bob has: $" + c2.cashOnHand());
        // reduce quantity
        s4.buySnack(2);
        // print quantity
        System.out.println("Soda: " + s4.getQuantity());

        // Add $10 to c1
        c1.addCash(10);
        System.out.println("Jane now has $" + c1.cashOnHand());

        // get cost
        cost = s2.snackCost(1);
        // reduce cash
        c1.makePurchase(cost);
        // print cash
        System.out.println("Jane has: $" + c1.cashOnHand());
        // reduce quantity
        s2.buySnack(1);
        // print quantity
        System.out.println("Chocolate Bars: " + s2.getQuantity());

        // add 12 to snack 3
        s3.addQuantity(12);
        System.out.println("Pretzels: " + s3.getQuantity());


        // get cost
        cost = s3.snackCost(3);
        // reduce cash
        c2.makePurchase(cost);
        // print cash
        System.out.println("Bob has: $" + c2.cashOnHand());
        // reduce quantity
        s3.buySnack(3);
        // print quantity
        System.out.println("Pretzels: " + s3.getQuantity());
    }

    // Where things are actually being done
    public static void main(String[] args)
    {
        workWithData();
    }
}
