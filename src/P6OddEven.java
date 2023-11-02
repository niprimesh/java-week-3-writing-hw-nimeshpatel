import java.util.Scanner;

public class P6OddEven {
    public static void main(String[] args) {
        //scanner declartion for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to check :");
        int number = scanner. nextInt();
        P6OddEven t = new P6OddEven();
        System.out.println(number + " is " + t.isitEvenOrOddNumber(number)+ "number");
        //closing the scanner object
        scanner.close();
    }
    //checking the odd or even
    public String isitEvenOrOddNumber(int number) {
        if (number %2 == 0) {
            return "even";
        } else { return "odd";

        }
    }
}
