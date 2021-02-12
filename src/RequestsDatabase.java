public class RequestsDatabase {

    Request[] requests;
    int i = 0;

    public RequestsDatabase(int size) {
        requests = new Request[size];
    }

    public void add(Request request) {
        requests[i++] = request;
    }

    public void displayALL() {
        for (int i = 0; i < requests.length && requests[i] != null; i++) {
            System.out.println("--------------------");
            requests[i].display();
        }
    }

    public void changeStatus(int searchNumber, int choose) {
        for (int j = 0; j < requests.length && requests[j] != null; j++) {
            if (requests[j].getRequestNumber() == searchNumber) {
                switch (choose) {
                    case 1 -> requests[j].setStatus("In progress");
                    case 2 -> requests[j].setStatus("Done");
                }
            }
        }
    }

    public void checkStatus(int finalStatusNumber) {
        for (int j = 0; j < requests.length && requests[j] != null; j++) {
            if (requests[j].getRequestNumber() == finalStatusNumber) {
                switch (requests[j].getStatus()) {
                    case "In progress" -> System.out.println("No, your request is still in progress.");
                    case "Done" -> System.out.println("Yes, you can pick your plates up.");
                }
            }
        }
    }
}
