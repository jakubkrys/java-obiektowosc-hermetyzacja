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
}
