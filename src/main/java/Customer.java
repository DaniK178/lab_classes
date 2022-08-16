public class Customer {

    private int id;
    private String firstName;
    private String lastName;
    private double heldMoney;

    public Customer (int newId, String newFirstName, String newLastName, double newheldMoney){
        this.id = newId;
        this.firstName = newFirstName;
        this.lastName = newLastName;
        this.heldMoney = newheldMoney;
    }
public int getId(){
        return id;
}

    int min= 0;
    int max = 1000
    int newId = (int)Math.floor(Math.random()*(max-min+1)+min);
}

