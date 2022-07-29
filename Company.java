import java.util.*;
import java.util.concurrent.TimeUnit;
public class Company {
    static String usr,passw;
    static Scanner input = new Scanner(System.in);
    static ArrayList info = new ArrayList<>(Arrays.asList("Amr","OxSlaYeR","123","amramoor123"));

    public static void login() {
        System.out.print("Username > ");
        usr = input.next();
        System.out.print("Password > ");
        passw = input.next();
        if (info.contains(usr) & info.contains(passw)) {
            System.out.println("welcome " + usr);
            settings();
        }
        else {
            System.out.println("Something went wrong please try another username / password");
            login();
        }
        navigate();
    }

    public static void printChoices() {
        System.out.println("1. Login\n2. About\n3. Contact us\n4. Exit");
        System.out.print("> ");
        choicemake();
    }

    public static void changePassw() {
        System.out.print("Enter the current password > ");
                if (passw.equals(input.next())) {
                    System.out.print("Enter new passwrod > ");
                    info.add(input.next());
                    System.out.println("Done !");
                    settings();
                }
                else {
                    System.out.println("You entered a wrong password please try again");
                    changePassw();
                }
    }

    public static void settings() {
        System.out.print("Settings:\n\t1) Edit Profile\n\t2) change password\n\t3) Sign Out\n\t4) Back\n> ");
        int ans = input.nextInt();
        switch (ans) {
            case 1 : 
                System.out.print("Enter new username > ");
                info.add(input.next());
                System.out.println("Done");
                navigate();
                break;
            case 2:
                changePassw();
                break;
            case 3:
                System.out.println("Done !");
                printChoices();
                break;
            case 4:
                printChoices();
        }
    }

    public static void about() {
        System.out.println("We are a company that handles all digital services.\nWe have Programmers, Writers, Designers and every digitaljob any one will need\nSince 2022");
        System.out.println("You can know more about us or hire someone to do your job  by visitng our Contact us page");
        System.out.print("Goto Contact us? y/n >");
        char ans = input.next().charAt(0);
        if (ans == 'y') {
            contact();
        }
        else {
            navigate();
        }
    }

    public static void contact() {
        System.out.println("Welcome at our contact us page\n--------------------------\nEmail: amr123456@gmail.com\nMobile: 01113732113\nTelephone: 0224957479\n--------------------------\nFeel free to use any of the listed methods to contact us :)");
        navigate();
    }

    public static void exit() {
        System.out.println("Exiting...");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
        System.exit(0);
    }

    public static void navigate() {
        System.out.print("Where do you want to go now > ");
        String dest = input.next();
        switch (dest) {
            case "login" :
                login();
                break;
            case "about" :
                about();
                break;
            case "contact" :
                contact();
                break;
            case "exit" :
                exit();
                break;
        }
    }

    public static void choicemake() {

        int choice = input.nextInt();

        switch (choice) {

            case 1 :
                login();
                break;

            case 2 :
                about();
                break;

            case 3 :
                contact();
                break;

            case 4 :
                exit();
                return;
        }
    }

    public static void main(String[] args) {

        System.out.println("date: "+ new Date() +"\n\n---------------- Welcome To El-Program ----------------");
        printChoices();
        
    }
}