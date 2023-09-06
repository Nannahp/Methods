import java.util.Random;

public class Opgave3 {
    public static void main(String[] args) {

        new Opgave3().run();}

        //RUN
        public void run(){
            // PRINTS NAMES 25 TIMES. COULD BE A METHOD?
            for (int i = 0; i <= 25; i++) {
                pickRandomNumber();  //Method picks between rip,rap or rup
                System.out.print(", ");
                pickRandomNumber();
                System.out.print(" & ");
                pickRandomNumber();
                System.out.println("\n");}
        }

            //METHODS

            public void printRip () {
                System.out.print("Rip");
            }

            public void printRap () {
                System.out.print("Rap");
            }

            public void printRup () {
                System.out.print("Rup");
            }

            //Picks name at random
            public void pickRandomNumber () {
                Random random = new Random();
                int randomNumber = random.nextInt(3);
                if (randomNumber == 0) {
                    printRip();
                } else if (randomNumber == 1) {
                    printRap();
                } else {
                    printRup();
                }
            }
        }

