public class Main {
    public static void main(String[] args) {
        ITraffic objectITraffic = new RedLight();
        System.out.println(objectITraffic);
        System.out.println(objectITraffic.nextState(objectITraffic));
        System.out.println(objectITraffic);

        System.out.println("---------------------------------------------------------------------------------------\n");
        objectITraffic = objectITraffic.nextState(objectITraffic).nextState(objectITraffic);
        System.out.println(objectITraffic);
    }
}
