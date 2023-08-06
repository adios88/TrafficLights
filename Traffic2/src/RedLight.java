public class RedLight implements ITraffic {

    @Override
    public ITraffic nextState(ITraffic currentLight) {
        return new YellowRedLight();
    }

    @Override
    public String toString() {
        return "The light is RED";
    }
}
