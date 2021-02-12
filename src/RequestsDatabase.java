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
            requests[i].display();
        }
    }

    public void changeStatus(int searchNumber, int choose) {
        for (int j = 0; j < requests.length && requests[j] != null; j++) {
            if (requests[j].getRequestNumber() == searchNumber) {
                switch (choose) {
                    case 1:
                        requests[j].setStatus("W realizacji");
                        break;
                    case 2:
                        requests[j].setStatus("Do odbioru");
                        break;
                }
            }
        }
    }

    public void checkStatus(int finalStatusNumber) {
        for (int j = 0; j < requests.length && requests[j] != null; j++) {
            if (requests[j].getRequestNumber() == finalStatusNumber) {
                switch (requests[j].getStatus()) {
                    case "W realizacji":
                        System.out.println("NO");
                        break;
                    case "Do odbioru":
                        System.out.println("YES");
                        break;
                }
            }
        }
    }
}
