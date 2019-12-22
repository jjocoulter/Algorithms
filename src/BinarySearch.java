/**
 * Simple binary search implementation
 *
 * @author Josh Coulter
 * @version December 2019
 */
public class BinarySearch {
    /**
     * Iterative implementation of binary search algorithm
     *
     * @param sortedArray initial sorted array
     * @param target element to find
     * @return index of element or -1 for not found
     */
    public int binarySearch(int[] sortedArray, int target){
        int low = 0, high = sortedArray.length;
        int mid;
        while (low <= high){
            mid = low + (high - low) / 2;
            if (sortedArray[mid] == target) return mid;
            else if (sortedArray[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return  -1;
    }
}
