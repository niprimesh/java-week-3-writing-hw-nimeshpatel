import java.util.Scanner;

public class p7SalesCommision {
    public static void main(String[] args) {
        //scanner call in
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Seller Name: ");
        String name = scanner.nextLine();
        System.out.println("enter Selled ID:");
        int sellerId = scanner.nextInt();
        System.out.println("Enter sales amount:");
        int salesAmount = scanner.nextInt();
        System.out.println("Enter Basic Salary:");
        int basicSalary = scanner.nextInt();
        //creating the object to call instance method
        p7SalesCommision t = new p7SalesCommision();
        int grossSalary = basicSalary + t.calculateCommision(salesAmount);
        System.out.println("Seller name is            : " + name);
        System.out.println("Seller id is              : " + sellerId);
        System.out.println("Seller's sales amount is  : " + salesAmount);
        System.out.println("Seller's basic salary is  : " + basicSalary);
        System.out.println("Seller's gross salary is  : " + grossSalary);
        // closing the scanner object
        scanner.close();
    }

    //calculate the sales commision
    public int calculateCommision(int salesAmount) {
        int commission;
        if (salesAmount >= 50000) {
            commission = (salesAmount * 35) / 100;
            System.out.println("Sales Commission is " + commission);
        } else if (salesAmount >= 30000) {
            commission = (salesAmount * 20) / 100;
            System.out.println("Sales Commission is " + commission);
        } else if (salesAmount >= 20000) {
            commission = (salesAmount * 10) / 100;
            System.out.println("Sales Commission is " + commission);
        } else if (salesAmount >= 10000) {
            commission = (salesAmount * 5) / 100;
            System.out.println("Sales Commission is " + commission);
        } else {
            commission = (salesAmount * 2) / 100;
            System.out.println("Sales Commission is " + commission);
        }
        return commission;
    }
}


