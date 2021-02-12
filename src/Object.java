public class Object {

    private String name;
    private String surname;
    private int age;
    private char gender;
    private String job;

    public Object(String name, String surname, int age, char gender, String job) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.job = job;
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Surame: "+surname);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Job: "+job);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
