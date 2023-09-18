public class Arrays {
    public static void main(String[] args) {
     /*   int[] intArray = new int[10];

        intArray[4] = 25;

        //Arrays börjar alltid på index 0!!

        double[] doubleArray = new double[10];

        intArray[0] = 20;
        intArray[7] = 55;*/


        int[] tenInts = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("First number in array is: " + tenInts[4]);

        int tenIntsLength = tenInts.length;

        System.out.println("Length of array is: " + tenIntsLength);

        //det här kastar ett fel
        //System.out.println("Last index of array is: " + tenInts[tenIntsLength]);

        System.out.println("Last index of array is: " + tenInts[tenIntsLength -1]);

        // detta funkar lika så väl utan att skapa en variabel innan att kalla på.
        //System.out.println("Last index of array is: " + tenInts[tenInts.length -1]);

        int[] testArray;
        //det här är inte tillåtet
        //testArray = {1, 2, 3, 4, 5}

        testArray = new int[] {1, 2, 3, 4, 5};

        for (int i = 0; i < testArray.length; i++) {
            System.out.println(testArray[i] + " ");
        }










    }
}
