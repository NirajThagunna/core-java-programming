package patterns;

/*
 * A
 * A B
 * A B C
 */
public class Pattern2 {
	public static void main(String[] args) {
		
		int num = 65;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				
				char c = (char)num;
				System.out.print(c + " ");
				num++;
				
			}
			num = 65;
			System.out.println();
		}
	}
}
