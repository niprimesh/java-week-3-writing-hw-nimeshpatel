import java.util.Scanner;

public class p1_oddEvenTenaryOperator {
    public static void main(String[] args) {
        //scanner call in
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number: ");
        int number = scanner.nextInt();
        isItoddORevenNumber(number);
        //scanner closed
        scanner.close();
    }
    public static void isItoddORevenNumber(int number){
        //tenary operator is used
        String evenORodd = (number%2 ==0) ?
    "even" : "odd";
        System.out.println("The " +number+ " is " +evenORodd + " number");
    }
}
