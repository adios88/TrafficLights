public class YellowLight implements  ITraffic{
    @Override
    public ITraffic nextState(ITraffic currentLight) {
        return currentLight instanceof RedLight ? new GreenLight() : new RedLight();
    }

    @Override
    public String toString() {
        return "The light is YELLOW";
    }
}
