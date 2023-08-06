public class LightColors {

    private static String[] lightColorArray = new String[]{"RED", "YELLOW", "GREEN"};

    public static String getColor(int getIndex) {

        return lightColorArray[getIndex];
    }

    public static int lightColorArrayGetSize(){
        return lightColorArray.length;
    }
}

