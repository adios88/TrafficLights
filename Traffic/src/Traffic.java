public class Traffic implements ITraffic {

    private LightSequence lightSequence = new LightSequence();

    public ITraffic previousState(){
        lightSequence.previousState();
        return this;
    }

    public ITraffic nextState(){
        lightSequence.nextState();
        return this;
    }

    public ITraffic printStatus(){
        lightSequence.printState();
        return this;
    }
}
