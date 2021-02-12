public class Class {

    public static void main(String[] args) {

        Object o1 = new Object("Kamil","Slimak", 28, 'M',"Sales assistant");
        Object o2 = new Object("Janusz","Nosacz",54,'M',"Unemployeed");
        Object o3 = new Object("Eleonora","Ptasznik",87,'F',"Retired");
        Object o4 = new Object("Anna","Goral",19,'F',"Student");
        Object o5 = new Object("Mariusz","Borsuk", 30,'M',"Manager");
        Object o6 = new Object("Janina","Papaja", 50,'F',"Accountant");

        String name = o1.getName();
        o1.setName("Krzysztof");
        name = o1.getName();
        o1.setName("Barabasz");
        o1.display();
        name = o2.getName();
        o2.setName("JSon");
        o2.display();


    }
}
