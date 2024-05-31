import java.util.Scanner;

public class Theatre {

    static Scanner input = new Scanner(System.in);
    static int[] row1 = new int[12];
    static int[] row2 = new int[16];
    static int[] row3 = new int[20];

    public static void main(String[] args) {

        int useChoice;
        do {
            menu();
            System.out.print("\nEnter your option:");
            useChoice = input.nextInt();

            switch (useChoice) {
                case 1:
                    buyTicket();
                    break;

                case 2:

                case 3:

                case 4:

                case 5:

                case 6:

                case 7:

                case 8:

            }

        } while (useChoice != 0);


    }

    public static void menuStuff() {

        for (int i = 0; i < 42; i++) {
            System.out.print("-");
        }
    }

    public static void menu() {

        menuStuff();
        System.out.println("\n| \t\tWELCOME TO THE NEW THEATRE\t\t |");
        menuStuff();

        System.out.println("\n\t1. Buy a ticket");
        System.out.println("\t2. Print seating area");
        System.out.println("\t3. Cancel ticket");
        System.out.println("\t4. List available seat ");
        System.out.println("\t5. Save to file");
        System.out.println("\t6. Load from file");
        System.out.println("\t7. Print ticket information and total price");
        System.out.println("\t8. Sort ticket by price");
        System.out.println("\t0. Quit");

        menuStuff();
    }

    public static void buyTicket(){

        menuStuff();
        System.out.println("\n|\t\t\t BUY TICKET\t\t\t |");
        menuStuff();
        System.out.println();
    }
}