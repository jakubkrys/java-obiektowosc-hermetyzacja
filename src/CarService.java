import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class CarService {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.println("----- Car Service App -----");
        System.out.println("1. Add employee");

        int option = scanner.nextInt();
        scanner.nextLine();

            switch (option){
                case 1:
                    System.out.print("Name:");
                    String name = scanner.nextLine();
                    System.out.print("Age:");
                    int age = scanner.nextInt();

                    Employee employee = new Employee(name, age);
                    System.out.print(employee.getName()+employee.getAge());
                    break;
                }




    }
}
