import java.util.ArrayList;
import java.util.Scanner;

// Create a program that reads in a list of numbers from the user, stores them in an array, and then finds the largest and smallest numbers in the array. Your program should also calculate the average of the numbers in the array.

// Here are some additional requirements to make it harder:

// The program should keep prompting the user for numbers until they enter a non-numeric value to stop.
// The program should handle exceptions if the user enters non-numeric values.
// The program should use a separate method for each task (finding largest, smallest, and average).

public class task3 {
    public static void main(String[] args) {
        double[] numArr = listOfInt();
        System.out.println(findMax(numArr));
        System.out.println(findMin(numArr));
        System.out.println(findAvr(numArr));
    }

    public static double[] listOfInt(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list1 = new ArrayList<>();
        while(true){
            try {
                System.out.println("Enter a number (or a non-numeric value to stop): ");
                double num = Double.parseDouble(sc.nextLine());
                list1.add(num);
            } 
            catch (NumberFormatException e) {
                sc.close();
                break;
            }
        }
        double[] numArr = new double[list1.size()];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = list1.get(i);
        }
        return numArr;
    
    }


    public static double findMax(double[] numArr){
        double max = numArr[0];
        for (int i = 1; i < numArr.length; i++) {
            if(numArr[i] > max){
                max = numArr[i];
            }
        }
        return max;
    }

    public static double findMin(double[] numArr){
        double min = numArr[0];
        for (int i = 1; i < numArr.length; i++) {
            if(numArr[i] < min){
                min = numArr[i];
            }
        }
        return min;
    }

    public static double findAvr(double[] numArr){
        double sumAll = 0;
        for (int i = 0; i < numArr.length; i++) {
            sumAll += numArr[i];
        }
        double avr = sumAll / numArr.length;
        return avr;
    }
}
