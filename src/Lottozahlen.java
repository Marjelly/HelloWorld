
public class Lottozahlen {
	public static void main(String[] args) {
		boolean[] zahlen = new boolean[49];

		for (int i = 0; i < 7; i++) {
			int ziehung = (int) (Math.random() * 48) + 1;

			while (zahlen[ziehung] == true) {

				ziehung = (int) (Math.random() * 48) + 1;
			}
			zahlen[ziehung] = true;
		}
		for (int i = 0; i < zahlen.length; i++) {
			if (zahlen[i] == true) {
				System.out.print(i + 1 + " ");
			}

		}
	}
}
