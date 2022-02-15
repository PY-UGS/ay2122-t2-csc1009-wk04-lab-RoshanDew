import java.lang.Math;

public class BMI {private double weight;
    private double height;

    static final double WEIGHTCONVERT = 0.45359237;
    static final double HEIGHTCONVERT = 0.0254;

    public BMI (double weight, double height){
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getConvertWeight(){
        return weight * 0.45359237;
    } 

    public double getConvertHeight(){
        return (Math.pow((height * 0.0254),2));
    } 

    public void calculateBMI(){
        
        double bmiConverted = weight * WEIGHTCONVERT / Math.pow(height * HEIGHTCONVERT ,2);
        System.out.println("BMI is " + bmiConverted);

        if (bmiConverted < 18.5){
            System.out.println("Underweight");
            return;
        }
        if (bmiConverted < 25.0){
            System.out.println("Normal");
            return;
        }
        if (bmiConverted < 30.0){
            System.out.println("Overweight");
            return;
        }
        if (bmiConverted >= 30.0){
            System.out.println("Obese");
            return;
        }
    }
}