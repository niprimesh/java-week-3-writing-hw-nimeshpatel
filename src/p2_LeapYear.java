import java.util.Scanner;

public class p2_LeapYear {
    public static void main(String[] args) {
        //scanner call in
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the year in YYYY format : ");
        int year = scanner.nextInt();
        p2_LeapYear leapYear = new p2_LeapYear();
        leapYear.isItLeapYear(year);
        // closing the scanner object
        scanner.close();
    }
    //Checking is it leap year or not
    public void isItLeapYear(int year){
        if (year%4 ==0 && year%100 != 0 || year % 400 ==0) {
            System.out.println("The year " +year+ " is leap year");
            return;
        }
        System.out.println("the year" +year+ " is not a leap year");
    }
}
