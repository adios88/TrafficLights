public class YellowRedLight implements ITraffic{

    @Override
    public ITraffic nextState(ITraffic currentLight) {
        return new GreenLight();
    }

    @Override
    public String toString() {
        return "The light is YELLOW";
    }
}
