package calculate;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calculateResult = new Calculator(); // Calculator class object creation
        char result;
        do {
            System.out.print("Please Enter the First Number: ");
            int num1 = input.nextInt();
            System.out.print("Please Enter the Second Number: ");
            int num2 = input.nextInt();
            System.out.print("Please enter the operation symbol +, -, * or / : ");
            char symbol = input.next().charAt(0);
            calculateResult.calculateResult(num1, num2, symbol);
            System.out.println(" ");
            System.out.print("Would you like to do more calculation, Please enter 'Y' or 'N' :  ");
            result = input.next().charAt(0);
        } while (result == 'Y' || result == 'y'); // Keep executing do block if user selects Y or y

        input.close(); // Closing the scanner

    }
}