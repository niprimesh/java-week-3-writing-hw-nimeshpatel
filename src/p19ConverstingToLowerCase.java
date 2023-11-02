import java.util.Scanner;

public class p19ConverstingToLowerCase {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the uppercase sentence :");
        String uppercase = scanner.nextLine();
        p19ConverstingToLowerCase t = new p19ConverstingToLowerCase();
        t.convertStringToLowerCase(uppercase);
        // closing the scanner object
        scanner.close();
    }
    //convert string the to lower case
    public void convertStringToLowerCase(String str) {
        System.out.println("the lowercase of string is = "+str.toLowerCase());
    }
}
