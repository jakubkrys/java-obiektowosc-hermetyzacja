import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class CommunicationDeptApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        RequestsDatabase requestsDatabase = new RequestsDatabase(50);
        int option;
        int requestNumber = 1;

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
                    System.out.print("Name:");
                    String name = scanner.nextLine();
                    System.out.print("Surname:");
                    String surname = scanner.nextLine();
                    System.out.print("Plate type (Car, Motorcycle, Vintage):");
                    String type = scanner.nextLine();

                    Request request = new Request(name, surname, type, "", requestNumber);
                    requestsDatabase.add(request);
                    requestNumber++;

                    break;
                case 2:
                    System.out.print("Request number: ");
                    int searchNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Which status you want to set (1 - W realizacji; 2 - Do odbioru:");
                    int choose = scanner.nextInt();
                    scanner.nextLine();
                    requestsDatabase.changeStatus(searchNumber, choose);
                    
                    break;
                case 3:
                    requestsDatabase.displayALL(); // kontrolne wyświetlanie wszystkich rekordów

                    break;
                case 0:
                    break;
            }
        } while (option != 0);
    }
}
