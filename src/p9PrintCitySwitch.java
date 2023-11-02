import java.util.Scanner;

public class p9PrintCitySwitch {

        public static void main(String[] args) {
            //Scanner declaration for reading input form console
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter alphabet between A to F : ");
            String city = scanner.next().toUpperCase();
            //Create object and call instance method
            p9PrintCitySwitch cityName = new p9PrintCitySwitch();
            cityName.printCityName(city);
            //Closing the scanner object
            scanner.close();
        }

        //Printing city name
        public void printCityName(String city) {
            switch (city) {
                case "A":
                    System.out.println("Aberdeen");
                    break;
                case "B":
                    System.out.println("Belfast");
                    break;
                case "C":
                    System.out.println("Cambridge");
                    break;
                case "D":
                    System.out.println("Derby");
                    break;
                case "E":
                    System.out.println("Edinburgh");
                    break;
                case "F":
                    System.out.println("Feltham");
                    break;
                default:
                    System.out.println("The alphabet you enter is not between A to F");
            }
        }
    }


