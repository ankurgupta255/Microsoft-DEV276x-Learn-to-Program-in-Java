import java.util.*;
public class OddsandEvens {
    public static void main(String[] args) {
        System.out.println("Let’s play a game called  Odds and Evens");
        System.out.println("\nWhat is your name?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello " + name + ", which do you choose? (O)dds or (E)vens?");
        Scanner input1 = new Scanner(System.in);
        String choice = input1.next();
        if (choice.equals("O")) {
            System.out.println("name has picked odds! The computer will be evens.");
        } else if (choice.equals("E")) {
            System.out.println("name has picked evens! The computer will be odds.");
        }
            System.out.println("------------------------------");

        System.out.println("How many “fingers” do you put out?");
        Scanner input2 = new Scanner(System.in);
        int fingers = input2.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer played fingers= " + computer);
        System.out.println("------------------------------");
        int num = fingers + computer;
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
        if (num % 2 == 0) {
            if (choice.equals("O")) {
                System.out.println("The computer wins.");
            } else {
                System.out.println(name + "wins. :)");
            }
        } else {
            if (choice.equals("O")) {
                System.out.println(name + "wins. :)");
            } else {
                System.out.println("The computer wins.");
            }
        }
    }
}
