package capgday4;

class MetLevException {

	public void myException() throws Exception {

		int a = 10;
		int b = 0;
		System.out.println(a / b);

	}
}

public class MLException {

	public static void main(String args[]) throws Exception {

		MetLevException exception = new MetLevException();

		exception.myException();

	}

}