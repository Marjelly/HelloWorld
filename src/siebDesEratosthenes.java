import java.util.Arrays;

public class siebDesEratosthenes {
	public static void main(String[] args) {
		long timer= System.nanoTime();
		  int length = 100000;

		boolean[] zahlen = new boolean[length + 1];
		Arrays.fill(zahlen, Boolean.TRUE);
		for (int i = 2; i <= length; i++) {

			if (zahlen[i]) {

				for (int a = i; a <= length; a = a + i) {

					zahlen[a] = false;
 
				}
			 
				System.out.println(i);
			}
		 

		}
		timer = System.nanoTime()-timer;
		System.out.println(	timer/1000000+"ms") ;
	}
}