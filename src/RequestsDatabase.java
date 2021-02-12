public class RequestsDatabase {

    Request[] requests;
    int i = 0;

    public RequestsDatabase (int size) {
        requests = new Request[size];
    }

    public void add(Request request) {
        requests[i++] = request;
    }

    public void displayALL() {
        for (int i = 0; i < requests.length && requests[i] != null ; i++) {
            requests[i].display();
        }
    }

    public void displayRequest(int searchNumber) {
        for (int j = 0; j < requests.length && requests[j] != null; j++) {
            if (requests[j].getRequestNumber() == searchNumber){
                requests[j].display();
            }
        }
    }
}
