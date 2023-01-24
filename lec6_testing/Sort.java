package lec6_testing;

public class Sort {
	/** Sort the strings in alphabetical order. */
	public static void sort(String[] x) {
		sort(x, 0);
	}

	public static void sort(String[] x, int k) {
		if (k == x.length) {
			return;
		}
		int smallest = findSmallest(x, k);
		swap(x, k, smallest);
		sort(x, k + 1);
	}

	/** Returns index of smallest string. */
	public static int findSmallest(String[] x, int k) {
		int currentSmallest = k;
		for (int i = k; i < x.length; i += 1) {
			int cmpResult = x[i].compareTo(x[currentSmallest]);

			if (cmpResult < 0) {
				currentSmallest = i;
			}
		}
		return currentSmallest;
	}

	public static void swap(String[] input, int a, int b) {
		String temp = input[a];
		input[a] = input[b];
		input[b] = temp;
	}
}