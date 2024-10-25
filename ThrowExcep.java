public class ThrowExcep {
	public static void throwsClause () throws ArithmeticException {
		int a = 10;
		int b = 0;
		int c = a/b;
		System.out.print(c);
	}

	public static void main(String args[]) {
		try {
			throwsClause();
		} catch (ArithmeticException e){
			System.out.println(e);
		}
	}
}
