package mycalc;

public class Divide extends Operation{
	public float count(float a, float b) {
		try {
			return a / b;
		} catch (ArithmeticException e) {
			System.out.println("Error");
			return a;
		}

	}
}