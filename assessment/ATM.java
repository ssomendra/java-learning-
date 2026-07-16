import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 10000;

        try {
            System.out.print("Enter Withdrawal Amount: ");

            int amount = sc.nextInt();

            if (amount > balance) {

                throw new ArithmeticException("Insufficient Balance");

            }

            balance = balance - amount;

            System.out.println("Withdrawal Successful");

            System.out.println("Remaining Balance = ₹" + balance);

        }

        catch (ArithmeticException e) {

            System.out.println(e.getMessage());

        }

        catch (Exception e) {

            System.out.println("Invalid Input");

        }

        sc.close();

    }
}
