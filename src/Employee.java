public class Employee {

    private String name;
    private int age;
    private int identifier;

    public Employee(String name, int age, int identifier) {
        this.name = name;
        this.age = age;
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public void display() {
        System.out.println("---------------------------");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Identifier: "+identifier);
    }
}
