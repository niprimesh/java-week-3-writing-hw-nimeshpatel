import java.util.Scanner;

public class p8PrintCityName {
    public static void main(String[] args) {
        //scanner call in for input
        Scanner scanner = new Scanner(System.in);
        System.out.println("plese enter alphabet between A to F :");
        char city = scanner.next().charAt(0);
        // Object creation
        p8PrintCityName t =new p8PrintCityName();
        t.printCityName(city);
        //closing the scanner object
        scanner.close();
    }
    //printing city name
    public void printCityName(char city){
        if (city == 'A' || city == 'a') {
            System.out.println("Aberdeen");
        } else if (city == 'B' || city == 'b') {
            System.out.println("Belfast");
        } else if (city == 'C' || city == 'c') {
            System.out.println("Cambridge");
        } else if (city == 'D' || city == 'd') {
            System.out.println("Derby");
        } else if (city == 'E' || city == 'e') {
            System.out.println("Edinburgh");
        } else if (city == 'F' || city == 'f') {
            System.out.println("Feltham");
        } else {
            System.out.println("The alphabet you enter is not between A to F");
        }
    }
}

