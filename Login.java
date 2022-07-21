import java.util.*;

public class Login {
    private static Scanner in = new Scanner(System.in);
    private static String user;
    private static int passw;
    private static ArrayList users = new ArrayList<>(Arrays.asList("Amr", "Roshdy", "Hassan", "OxSlaYeR"));
    private static ArrayList pass = new ArrayList<>(Arrays.asList(123, 111, 122, 133));
    static int amt, balance;
    static Scanner input = new Scanner(System.in);

    public static void deposit() {
        System.out.println("Enter amount to deposit: ");
        amt = input.nextInt();
        balance += amt;
        System.out.println("Your balance now is: " + balance);

    }

    public static void withdraw() {
        System.out.println("Enter amount to withdraw: ");
        amt = input.nextInt();
        if (amt > balance) {
            System.out.println("insuffiecient balnce");
            withdraw();
        } else {
            balance -= amt;
            System.out.println("Your balance now is: " + balance);
        }
    }

    public static void check() {
        System.out.println("Your balance now is: " + balance);
    }

    public static void Do() {
        System.out.println("What do u want to do: ");
        System.out.println("1>Withdraw\n2>Deposit\n3>check");
        int ans = input.nextInt();
        switch (ans) {
            case 1:
                withdraw();
                break;
            case 2:
                deposit();
                break;
            case 3:
                check();
        }
    }

    public static void doAgain() {
        System.out.println("Do You want to do another operation? y/n");
        char answ = input.next().charAt(0);
        switch (answ) {
            case 'y':
                Do();
                doAgain();
                break;
            case 'n':
                System.out.println("Hope You Enjoyed\nMade By 0xSlaYeR");

        }
    }

    public static void checkPassw() {
        if (pass.contains(passw)) {
            System.out.println("welcome " + user);
        } else {
            System.out.print("the password is wrong\nPlease enter a valid password > ");
            passw = in.nextInt();
            checkPassw();
        }
    }

    public static void checkUsr() {
        if (users.contains(user) == true) {
            System.out.print("Enter your password > ");
            passw = in.nextInt();
            checkPassw();
        } else {
            System.out.print("the username you entered wasn't found in the database\nPlease enter a valid username > ");
            user = in.next();
            checkUsr();
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter your username > ");
        user = in.next();
        checkUsr();
        ArrayList info = new ArrayList<>();
        System.out.print("Enter Your Account Number: ");
        info.add(input.next());
        System.out.println(info);
        Do();
        doAgain();
    }
}