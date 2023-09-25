public class MethodOverloadTask {
    public static void main(String[] args) {

        //double conversion = InchToCm(10);
        System.out.println("The length in cm is " + InchToCm(10));

        //double conversionTwo = InchToCm(1, 50);
        System.out.println("Total length in cm is " + InchToCm(1, 50));

    }

    public static double InchToCm (int inch) {
        return inch * 2.54;
    }

    public static double InchToCm (int meter, int centimeter) {
        double methodOne = InchToCm(20);
        //System.out.println("The length together is " + (methodOne + meter * 100 + centimeter));
        int totalLength = (meter *100) + centimeter;
        return totalLength;
    }
    /*public static double InchToCm (int meter, int centimeter) {
        int totalLength = (meter * 100) + centimeter;
        return InchToCm(20) + totalLength;
    }*/
}

