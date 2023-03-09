package selenium;
import accessmodifiers.protectedExample;

public class privateExample extends protectedExample {

	public static void main(String[] args) {
		privateExample pe2 = new privateExample();
		pe2.print2();
		publicExample pe1 = new publicExample();
		pe1.print1();

	}
	private void print2() {
		System.out.println("hello there im private");
	}
	

}
