public class Request {

    private String name;
    private String surname;
    private String type;
    private String status;
    private int requestNumber;

    public Request(String name, String surname, String type, String status, int requestNumber) {
        this.name = name;
        this.surname = surname;
        this.type = type;
        this.status = "Złożono";
        this.requestNumber = requestNumber;
    }

    public int getRequestNumber() {
        return requestNumber;
    }

    public void setRequestNumber(int requestNumber) {
        this.requestNumber = requestNumber;
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Surname: "+surname);
        System.out.println("Plate type: "+type);
        System.out.println("Current status: "+status);
        System.out.println("Request number: "+requestNumber);
    }
}
