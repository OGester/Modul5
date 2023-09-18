public class Switch {
    public static void main(String[] args) {

        String switchDay = "Wednesday";

        switch (switchDay) {
            case "Monday":
                System.out.println("It´s monday, time to study");
                break;
            case "Tuesday":
                System.out.println("It´s Tuesday, time to do laundry");
                break;
            case "Wednesday":
                System.out.println("It´s Wednesday, time to go to school");
                break;
            case "Thursday":
                System.out.println("It´s Thursday, time to go to the gym");
                break;
            case "Friday":
                System.out.println("It´s Friday, time to study");
                break;
            default:
                System.out.println("It´s the weekend, enjoy your time off");
                break;
        }
    }
}
