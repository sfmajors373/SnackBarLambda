package snackBar;
// needs id and name
// set and get name

public class VendingMachine
{
    private static int maxId = 0;
    public int id;
    private String name;

    public VendingMachine(String name)
    {
        maxId++;
        id = maxId;
        this.name = name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }
}
