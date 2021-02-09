public class CarService {
    private Employee[] employees;
    private int index = 0;

    private Task[] tasks;
    private int taskIndex = 0;

    public CarService() {
        employees = new Employee[10];
    }

    public void addEmployee(Employee employee){
        employees[index++] = employee;
        }

    public void displayEmployees() {
        for (int i = 0; i < employees.length && employees[i] != null; i++) {
            employees[i].display();
        }
    }

    public Employee findEmployee(int identifier){
        for (int i = 0; i < employees.length && employees[i] != null; i++) {
            if(employees[i].getIdentifier() == identifier){
                return employees[i];
            }
        }
        return null;
    }

    public void addTask(Task task) {
        tasks[taskIndex++] = task;
    }
}
