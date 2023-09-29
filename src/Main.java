import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Tip Calcualtor!");
        System.out.println();
        System.out.println("Enter the bill: ");
        double bill = sc.nextDouble();
        System.out.println("Enter the desired tip Percentage: " );
        int tipPercentage = sc.nextInt();
        System.out.println("Enter the amount of people that will be splitting the tip.");
        int people = sc.nextInt();
        double tip = (int) ((tipPercentage) * bill) / 100 ;
        double tipPerPerson = (tip/people);
        double totalBill = bill + tip;
        double totalPerPerson = totalBill / people;
        System.out.println("The total tip is $" + tip);
        System.out.println("The tip per person is $" + tipPerPerson);
        System.out.println("The total bill including the tip is $" + totalBill);
        System.out.println("The total per person is $" + totalPerPerson);



    }
}