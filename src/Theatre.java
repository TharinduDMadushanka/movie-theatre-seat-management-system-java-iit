public class Theatre {

    static int[] row1 = new int[12];
    static int[] row2 = new int[16];
    static int[] row3 = new int[20];

    public static void main(String[] args) {

        menu();

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
    }
}