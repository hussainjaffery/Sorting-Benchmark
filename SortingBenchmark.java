public class SortingBenchmark {

	public static void main(String[] args) {

	}

	private static int[] mergeTwoSortedArrays(int[] a, int[] b) {

		int i = 0, j = 0, k = 0;
        int[] merged = new int[a.length + b.length];

        // Track indexes into each array, put smaller of the two current elements into result array
        while (i < a.length && j < b.length) {
			merged[k++] = (a[i] <= b[j]) ? a[i++] : b[j++];
        }

        // Add remaining elements from either array
        while (i < a.length)
            merged[k++] = a[i++];

        while (j < b.length)
            merged[k++] = b[j++];

        return merged;
	}
}