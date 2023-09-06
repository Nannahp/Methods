import java.util.Scanner;
public class Opgave6 {
    public static void main(String[] args) {
        new Opgave6().run();
    }

    //RUN
    public void run(){

        Scanner scanner = new Scanner(System.in);
        int grundPrice = 300;
        double price;

        //Are  you an active member? If yes then ask further questions. If no then
        //You only have to pay 25,-.
        System.out.println("\nAre you an active member? (true/false)");
        boolean ispassive = scanner.nextBoolean();
        if (!ispassive) {
            System.out.println("Your price this month is: " + calcPassive(ispassive) + ",-");
        }
        else {
            System.out.println("Are you a student? (true/false)");
            boolean student = scanner.nextBoolean();
            calcStudent(student); // call the student discount method with the previous
                                  // answer as the argument.
            System.out.println("Are you retired? (true/false)");
            boolean retired = scanner.nextBoolean();
            calcRetired(retired);

            System.out.println("Is this month your birthday month? (true/false)");
            boolean birthday = scanner.nextBoolean();
            calcBirthday(birthday);

            System.out.println("How long have you been a member (months)?");
            int months = scanner.nextInt();
            calcMonths(months);

            // Calculates the price
            price = grundPrice - rabat;  // Rabat is defined by the methods.
            System.out.println("Your price this month is: " + price + ",-");
            System.out.println("You have saved:  "+ rabat);
        }
    }
    //METHODS
    double rabat = 0; // If nothing applies then the discount is 0
    // Student discount.
    public double calcStudent( boolean student) {
        if (student) {
            rabat += (300 * 0.4); // adds the discount
        }
        return rabat;
    }

    public double calcRetired( boolean retired) {
        if (retired) {
            rabat += (300 * 0.2);
        }
        return rabat;
    }

    public double calcMonths( int months) {
        if (months >= 3 && months < 6) {
            rabat += (300 * 0.05);
        } else if (months >= 6 && !(months % 12 == 0)) {
            rabat += (300 * 0.1);
        } else if (months % 12 == 0) {
            rabat += (300 * 0.25);
        }
        return rabat;
    }

    public double calcPassive(boolean active) {
        if (!active ) {
            rabat = 25;
        }
        return rabat;
    }

    public double calcBirthday( boolean birthday) {
        if (birthday) {
            rabat += 300 * 0.15;
        }
        return rabat;
    }

}
