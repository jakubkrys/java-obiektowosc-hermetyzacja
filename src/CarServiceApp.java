import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class CarServiceApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        CarService carService = new CarService();
        int option;

        do {
            System.out.println("----- Car Service App -----");
            System.out.println("1. Add employee");
            System.out.println("2. Display all employees");
            System.out.println("3. Assign task");
            System.out.println("100. Quit");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Name:");
                    String name = scanner.nextLine();
                    System.out.print("Age:");
                    int age = scanner.nextInt();

                    Employee employee = new Employee(name, age);
                    carService.addEmployee(employee);

                    break;
                case 2:
                    carService.displayEmployees();

                    break;
            }
        }while (option != 100);
        scanner.close();
    }
}
