import java.util.Scanner;
public class Opgave5 {
    public static void main(String[] args) {
        new Opgave5().run();
    }

    //RUN
    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your height? [cm]");
        int answer1 = scanner.nextInt(); //dårligt navn I know
        System.out.println("What is your weight? [kg]");
        int answer2 = scanner.nextInt();

        //Call Method with arguments
        calculateBmi(answer1, answer2);}

    //METHODS

    public void calculateBmi(int height, int weight) {

        double BMI = weight / Math.pow(height * 0.01, 2);
        String assesment = "";
        if (BMI <= 18.5) {
            assesment = "underweight";
        } else if (BMI > 18.5 && BMI <= 25) {
            assesment = "normal weight";
        } else if (BMI > 25 && BMI <= 30) {
            assesment = "overweight";
        } else if (BMI > 30) {
            assesment = "severly overweight";
        }

        System.out.printf("Your BMI is %.02f, and you are %s ", BMI, assesment);

    }
}
