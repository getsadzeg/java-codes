public class Arrays {
	public static void main(String[] args) {
		int total = 0;
		int[] oneten = new int[10]; //Create arrays. One way.
		int[] primes = {2, 3, 5, 7, 11}; //Create arrays. Second way. Better way.
		for (int i = 0; i < primes.length; i++) {
			System.out.println(primes[i]);
			total += primes[i];
		}
		System.out.println("Total: " + total);
		total = 0;
		System.out.println("With enhanced loop:\n");
		for (int i : primes) {
			System.out.println(i);
			total += i;
		}
		System.out.println("Total(with enhanced loop): " + total);
	}
}