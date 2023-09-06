import java.util.Scanner;

public class Opgave4 {
    public static void main(String[] args) {
        new Opgave4().run();
    }
    //RUN
    public void run(){

        System.out.println("What would you like to watch? \nDR, TV2 or BBCNORDIC?");
        Scanner scanner = new Scanner(System.in);
        String pickShow = scanner.nextLine();


        boolean valid= false;
        do{
        if (pickShow.equalsIgnoreCase("DR")) {
            showDR();
            valid =true;
        } else if (pickShow.equalsIgnoreCase("TV2")) {
            showTV2();
            valid =true;
        } else if (pickShow.equalsIgnoreCase("BBCNORDIC")) {
            showBBC();
            valid =true;
        } else {
            System.out.println("This channel is not available in your country,\n" +
                    "please choose another channel");
            pickShow = scanner.nextLine();
        }
        }while(!valid);


    }

    public void showDR() {
        String currentShow = "Rejseholdet";
        System.out.printf("You are watching %s on DR1", currentShow);
    }

    public void showTV2() {
        String currentShow = "Han, Hun og Drømmeslottet";
        System.out.printf("You are watching %s on TV2", currentShow);
    }

    public void showBBC() {
        String currentShow = " QI";
        System.out.printf("You are watching %s on BBCNORDIC", currentShow);
    }
}
