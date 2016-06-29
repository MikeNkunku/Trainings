import java.util.Scanner;
import java.util.Arrays;
import java.text.DecimalFormat;

class TemperatureConvertor {
	protected DecimalFormat df = new DecimalFormat("0.00");
	protected double toKelvin = 273.15;
	protected String celsiusUnit = "°C";
	protected char kelvinUnit = 'K';
	protected String[] choices = {"Convert temperature to Kelvin", "Convert temperature to Celsius", "Exit"};

	public DecimalFormat getDecimalFormat() {
		return df;
	}

	public double getToKelvin() {
		return toKelvin;
	}

	public String getCelsiusUnit() {
		return celsiusUnit;
	}

	public char getKelvinUnit() {
		return kelvinUnit;
	}

	public double getKelvinTemperatureFromCelsius (double cels) {
		return cels + getToKelvin();
	}

	public double getCelsiusTemperatureFromKelvin (double kelv) {
		return kelv - getToKelvin();
	}

	public String[] getChoices() {
		return choices;
	}

	public void printMenu() {
		String[] temp = getChoices();

		for (byte i = 0; i < temp.length; i++) {
			System.out.println(i + " - " + temp[i]);
		}
		System.out.print("\nWhat's your choice? ");
	}

	public static void main (String[] args) {
		int userChoice;
		float temperature;
		TemperatureConvertor inst = new TemperatureConvertor();
		Scanner sc = new Scanner(System.in);

		int exitChoice = Arrays.asList(inst.getChoices()).indexOf("Exit");
		DecimalFormat df = inst.getDecimalFormat();

		do {
			do {
				inst.printMenu();
				userChoice = sc.nextInt();
			} while (userChoice < 0 || userChoice >= inst.getChoices().length);

			switch(userChoice) {
				case 0:
					System.out.print("\nTap the Celsius temperature you want to convert into Kelvin: ");
					temperature = sc.nextFloat();

					System.out.println('\n' + df.format(temperature) + inst.getCelsiusUnit() + " = " + 
						df.format(inst.getKelvinTemperatureFromCelsius(temperature)) + inst.getKelvinUnit() + '\n');
					break;

				case 1:
					System.out.print("\nTap the Kelvin temperature you want to convert into Celsius: ");
					temperature = sc.nextFloat();

					System.out.println('\n' + df.format(temperature) + inst.getKelvinUnit() + " = " +
						df.format(inst.getCelsiusTemperatureFromKelvin(temperature)) + inst.getCelsiusUnit() + '\n');
					break;

				default:
					System.out.println("\nHope you enjoyed this little test! :-P");
			}

		} while (userChoice != exitChoice);
	}
}