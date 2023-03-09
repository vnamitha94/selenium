package selenium;
import accessmodifiers.protectedExample;

public class publicExample extends protectedExample {

	public static void main(String[] args) {
		publicExample pe1 = new publicExample();
		pe1.print1();
		pe1.print4();
		}
		

	
	public void print1() {
		System.out.println("hello there im public");
	}


}
//public static double convertToMeters(double distance, String unit) {
//    switch (unit) {
//        case "km":
//            return distance * 1000;
//        case "mi":
//            return distance * 1609.34;
//        case "ft":
//            return distance * 0.3048;
//        case "yd":
//            return distance * 0.9144;
//        default:
//            return distance;
//    }
//}