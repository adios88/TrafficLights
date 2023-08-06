public class Main {
    public static void main(String[] args) {
        ITraffic trafficObject = new Traffic();
        trafficObject.printStatus()
                .nextState()
                .nextState()
                .nextState()
                .nextState()
                .printStatus()
                .previousState()
                .previousState();

    }
}

