
public class PrintApp {

	public static void main(String[] args) {
		
		String creator;
		double number1;
		double number2;
		double multipication;
		double addition;
		double substraction;
		double division;
		
		System.out.println("Printer App");
		System.out.println("This app is made by:");
		creator = "Kalpana";
		System.out.println("This app is made by:" + creator);
		
		number1=5;
		number2=2;
		
		
		//System.out.println(number1);
		System.out.println("The value of number1 is " + number1);
		System.out.println("The value of number2 is " + number2);
		
		
		multipication = number1 * number2;
		System.out.println(number1 + "*" + number2 + "=" + multipication);
		
		
		addition = number1 + number2;
		System.out.println(number1 + "+" + number2 + "=" + addition);
		
		
		substraction= number1 - number2;
		System.out.println(number1 + "-" + number2 + "=" + substraction );
		

		division = number1 / number2;
		System.out.println(number1 + "/" + number2 + "=" + division);
		
	}

}
