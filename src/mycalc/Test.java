package mycalc;

import java.io.*;

public class Test {

	public static void main(String[] args) throws NumberFormatException,
			IOException, InstantiationException, IllegalAccessException,
			ClassNotFoundException {
		// TODO Auto-generated method stub
		float a, b;
		String op;
		BufferedReader object = new BufferedReader(new InputStreamReader(
				System.in));
		a = Float.parseFloat(object.readLine());
		op = object.readLine();
		b = Float.parseFloat(object.readLine());

		//CPA: сделайте так, чтобы можно было использовать я калькуялторе обычные знаки +-,/ 
		// без использования if и switch
		Operation Y = (Operation) Class.forName("mycalc." + op).newInstance();

		System.out.println(Y.count(a, b));
	}

}
