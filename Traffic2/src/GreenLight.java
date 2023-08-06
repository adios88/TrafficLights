public class GreenLight implements ITraffic{

    @Override
    public ITraffic nextState(ITraffic currentLight) {
        return new YellowGreenLight();
    }

    @Override
    public String toString() {
        return "The light is GREEN";
    }
}
