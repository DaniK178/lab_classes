public class Account {

    String id;
    String name;
    int balance;

    public Account (String newId, String newPersonName, int newbalance){
        this.id = newId;
        this.name = newPersonName;
        this.balance = newbalance;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getBalance(){
        return balance;
    }

    public void setId(){
        this.id = id;
    }

    public void setName() {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" + "id='" + id + ", name='" + name + ", balance=" + balance + '}';
    }



}
