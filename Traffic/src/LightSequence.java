public class LightSequence implements ILightSequence{

    private int currentLightColor;

    public LightSequence(){
        currentLightColor = 0;
    }
    @Override
    public void previousState() {
        if(currentLightColor == 0){
            currentLightColor = LightColors.lightColorArrayGetSize()-1;
            System.out.println("Traffic status set to: " + LightColors.getColor(currentLightColor));
            return;
        }
        --currentLightColor;
        System.out.println("Traffic status set to: " + LightColors.getColor(currentLightColor));
    }

    @Override
    public void nextState() {
        if(currentLightColor == LightColors.lightColorArrayGetSize()-1){
            currentLightColor = 0;
            System.out.println("Traffic status set to: " + LightColors.getColor(currentLightColor));

            return;
        }
        ++currentLightColor;
        System.out.println("Traffic status set to: " + LightColors.getColor((currentLightColor)));

    }

    @Override
    public void printState() {
        System.out.println("Traffic status: " + LightColors.getColor(currentLightColor));
    }
}
