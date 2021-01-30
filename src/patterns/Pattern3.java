package patterns;

/*
 * $ $ $ $
 * $     $
 * $     $
 * $ $ $ $
 */
public class Pattern3 {
	public static void main(String[] args) {
		int i, j, n = 4;
		// Outer loop that represent how many lines are to be executed
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n; j++) {
				if ((i == 0 || i == n) || (j == 1 || j == n)) {
					System.out.print("$" + " ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
