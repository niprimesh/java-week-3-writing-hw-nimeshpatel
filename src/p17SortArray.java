import java.util.Arrays;

public class p17SortArray {
    public static void main(String[] args) {
        //numeric array declaration
        int[] numarray = {1789, 2023, 1899, 2010, 1950, 2255, 7897, 1455, 787};
        //String array declaration
        String[] strArray = {
                "Alpha", "Bravo", "Delta", "Hotel", "Mike", "Sierra", "Peter", "Kilo"};
        System.out.println(" Actual numerical array was ;" + Arrays.toString(numarray));
        // sorting the arrays
        Arrays.sort(numarray);
        System.out.println("Sorted Numerical Array is: " + Arrays.toString(numarray));
        System.out.println("");
        System.out.println("Actual String Array was: " + Arrays.toString(strArray));
        //Sorting the array
        Arrays.sort(strArray);
        System.out.println("Sorted String Array is: " + Arrays.toString(strArray));
    }
}
