public class Opgave2 {
    public static void main(String[] args) {
        new Opgave2().run();
    }
    //RUN
    public void run() {
        printFirstname();
        printMiddleName();
        printLastName();
    }

    //METHODS
    public void printFirstname() {
        System.out.print("Nanna ");
    }

    public void printMiddleName() {
        System.out.print("Hofgård ");
    }

    public void printLastName() {
        System.out.print("Petersen\n");
    }
}