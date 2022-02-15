import java.util.Scanner;

public class MainBMI {public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter weight in inches: ");
    double weightInput = input.nextDouble();
    System.out.print("Enter height in pounds: ");
    double heightInput = input.nextDouble();

    BMI bmi = new BMI(weightInput, heightInput);
    bmi.calculateBMI();

    input.close();
}
}