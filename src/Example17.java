
import  java.util.Scanner;
public class Example17 {
    public static void main(String[] args) {
        int seconds;
        int minutes;
        int hours;
        System.out.println("Enter your time in seconds:");
        Scanner inputvalue;
        inputvalue = new Scanner(System.in);
        seconds = inputvalue.nextInt();
        System.out.println("Enter your minutes");
        minutes = inputvalue.nextInt();
        System.out.println("Enter your hours");
        hours = inputvalue.nextInt();
        if (seconds == 60) {
            seconds = 0;
            minutes = minutes + 1;
        }

        else if (minutes == 60) {
            minutes = 0;
            hours = hours + 1;
        }
        System.out.println("Your New time is: " + hours + ":" + minutes + ":" + seconds);
    }
}

