public class Theatre {

    static int[] row1 = new int[12];
    static int[] row2 = new int[16];
    static int[] row3 = new int[20];

    public static void main(String[] args) {

        System.out.println("WELCOME TO THE NEW THEATRE");
    }

    public static void menuStuff() {

        for (int i = 0; i < 30; i++) {
            System.out.println("-");
        }
    }

    public static void menu() {

        menuStuff();
        System.out.println("|OPTION MEU|");
        menuStuff();
    }
}