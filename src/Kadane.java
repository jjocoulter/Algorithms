/**
 * Implementation of Kadane's algorithm to find largest contiguous sum in an array.
 *
 * @author Josh Coulter
 * @version December 2019
 */
public class Kadane {
    /**
     * Implementation will take O(n) time complexity.
     *
     * @param array input array
     * @return maximum contiguous sum
     */
    public int kadane(int[] array){
        int maxSoFar =  array[0], maxEndingHere = array[0];
        for (int i = 0; i < array.length; i++){
            maxEndingHere = Math.max(array[i], array[i] + maxEndingHere);
            maxSoFar = Math.max(maxEndingHere, maxSoFar);
        }
        return maxSoFar;
    }
}
