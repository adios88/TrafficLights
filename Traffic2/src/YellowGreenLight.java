public class YellowGreenLight implements ITraffic{

    @Override
    public ITraffic nextState(ITraffic currentLight) {
        return new RedLight();
    }

    @Override
    public String toString() {
        return "The light is YELLOW";
    }
}
