/**
 * Binary search implementation for generic comparables.
 *
 * @param <T> type of comparable
 *
 * @author Josh Coulter
 * @version December 2019
 */
public class BinarySearchComparable<T extends Comparable<T>> {
    /**
     * Iterative implementation of binary search for generic comparables.
     *
     * @param sortedArray initial sorted array
     * @param target element to find
     * @return index of element or -1 for not found
     */
    public int binarySearch(T[] sortedArray, T target) {
        int low = 0, high = sortedArray.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sortedArray[mid].compareTo(target) == 0) return mid;
            else if (sortedArray[mid].compareTo(target) > 0) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
}
