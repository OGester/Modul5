public class Methods {
    public static void main(String[] args) {
        // här inne i main kan vi kalla på vår metod som kommer att köras när programmet startar

        calcTotal(3, 5);
        calcTotal(18, 38);
        calcTotal(2, 10);



        //methodName();


    }

    //här skall vi skapa vår metod
    public static void calcTotal(int a, int b) {
        int result = a + b;
        System.out.println("Total sum is: " + result);
    }
}
