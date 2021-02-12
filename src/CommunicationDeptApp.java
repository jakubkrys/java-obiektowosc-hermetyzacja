import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class CommunicationDeptApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        int option;

        do {
            System.out.println("------------------------------------");
            System.out.println("Communication Dept. - Plates Section");
            System.out.println("------------------------------------");
            System.out.println("1. New plate - request");
            System.out.println("2. Change request status");
            System.out.println("3. Check request status");
            System.out.println("0. Quit");
            System.out.println();
            System.out.print("What you want to do?:");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println(1);

                    break;
                case 2:
                    System.out.println(2);

                    break;
                case 3:
                    System.out.println(3);

                    break;
                case 0:
                    break;
            }
        } while (option != 0);
    }
}
