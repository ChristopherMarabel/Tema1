package be_compiler_C;

public class Be_compiler_C {

	public static void main(String[] args) {
		int x = 5;
		while (x > 1) {
			x = x - 1;
			if (x < 3) {
				System.out.println("small x");
			}
		}
	}
}
