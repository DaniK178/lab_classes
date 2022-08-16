import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Account
        Account myAccount = new Account("ColinB", "Colin", 0);

        System.out.println( myAccount.);
        int myBalance = myAccount.getBalance();
        System.out.println( myBalance);

// Circle
        Circle myCircle = new Circle(23);
        System.out.println();

        // Rectangle
        Rectangle myRectangle = new Rectangle(42, 56);
        System.out.println(myRectangle.getArea());
        System.out.println(myRectangle.getPerimeter());
        System.out.println(myRectangle.getDiagonal());

        //Customer

        Customer myCustomer = new Customer(3, "Anna", "Book",37 );
        System.out.println(myCustomer.get);

    }

}
