import java.util.Scanner;
public class TripPlanner {
    public static void main(String[] args){
        Greeting();
        System.out.println();
        TimeBudjet();
        System.out.println();
        TimeDiff();
        System.out.println();
        Area();

    }
    public static void Greeting(){
        System.out.println("Welcome to the vacation Planner");
        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Nice to meet you "+ name + ", where are u travelling to?");
        Scanner input1 = new Scanner(System.in);
        String place = input1.nextLine();
        System.out.println("Great! "+ place + " is a great place.");

    }
    public static void TimeBudjet(){
        System.out.println("No. of days= ");
        Scanner input2 = new Scanner(System.in);
        int days= input2.nextInt();
        System.out.println("Money in USD= ");
        Scanner input3= new Scanner(System.in);
        double money= input3.nextDouble();
        System.out.println("Currency symbol of the destination= ");
        Scanner input4 = new Scanner(System.in);
        String symbol= input4.next();
        System.out.println("How many "+ symbol + " are in 1 USD");
        Scanner input5 = new Scanner(System.in);
        double value= input5.nextDouble();
        System.out.println();
        double money1=money/days;
        double total=money*value;
        System.out.println("You will spend "+ (days*24)+ " hours or "+ (days*24*60)+ " minutes");
        System.out.println("Your budget in USD= "+ money+ "\nYou can spend "+money1+ " Dollars Everyday");
        System.out.println("Your total budget in " + symbol+ " is= "+ total+ "\tper day or ="+ (total/days));
    }
    public static void TimeDiff(){
        System.out.println("What is the time difference between your home and destination in hours?");
        Scanner input6 = new Scanner(System.in);
        int diff= input6.nextInt();
        int time=diff%24;
        System.out.println("This means when it is midnight at home it will be "+ time +"AM at the destimation amd when it is noon at the home it will be "+ (12+time));

    }
    public static void Area(){
        System.out.println("What is the area of the destination in square km.=");
        Scanner input7 = new Scanner(System.in);
        double Area= input7.nextDouble();
        System.out.println("In square miles it is =" + (Area*0.386102));

    }
}