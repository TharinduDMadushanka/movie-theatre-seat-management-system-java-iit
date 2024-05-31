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

    public static void buyTicket() {

        menuStuff();
        System.out.println("\n|\t\t\t\t BUY TICKET\t\t\t\t |");
        menuStuff();
        System.out.println();

        boolean validRow = true;

        while (validRow) {
            System.out.print("Enter Row number (1-3):");
            int row = input.nextInt();

            if (checkRow(row)) {
                validRow = false;

                System.out.println("Row 1->12\tRow 2->16\tRow 3->20");

                boolean validSeat = true;
                while (validSeat) {

                    System.out.print("Enter seat number:");
                    int seat = input.nextInt();

                    if (checkSeat(row, seat)) {
                        validSeat = false;
                        System.out.println("Successfully booked row " + row + " seat " + seat + " .");
                    } else {
                        System.out.println("Please enter valid seat number!");
                    }
                }
            } else {
                System.out.println("Please enter valid seat number!");
            }

            System.out.print("Seat booked successfully.\nDo you want to book another seat (y/n): ");


            boolean validAnswer = false;
            while (!validAnswer) {
                char inputDataAgain = input.next().toLowerCase().charAt(0);
                if (inputDataAgain == 'y') {
                    validAnswer = true;
                } else if (inputDataAgain == 'n') {
                    validAnswer = true;
                    validRow = false;
                } else {
                    System.out.print("Invalid input. Please enter (y/n) :");
                }
            }
        }
    }

    public static boolean checkRow(int row) {
        return row > 0 && row < 4;
    }

    public static boolean checkSeat(int row, int seat) {
        if (row == 1) {
            return seat > 0 && seat <= 12;
        } else if (row == 2) {
            return seat > 0 && seat <= 16;
        } else if (row == 3) {
            return seat > 0 && seat <= 20;
        }
        return false;
    }
}