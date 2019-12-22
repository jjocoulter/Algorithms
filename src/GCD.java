/**
 * Find greatest common divisor for a pair or an array of numbers.
 *
 * @author Josh Coulter
 * @version December 2019
 */
public class GCD {

    /**
     * Find GCD of 2 numbers recursively.
     *
     * @param a first int
     * @param b second int
     * @return GCD
     */
    public int singleGCD(int a, int b){
      if (a==0) return b;
      return singleGCD(b % a, a);
    }

    /**
     * Use singleGCD method to test all elements of array and find GCD.
     *
     * @param gcdArray input array of numbers
     * @return GCD
     */
    public int arrayGCD(int[] gcdArray){
        int gcd = gcdArray[0];
        for (int i = 1; i < gcdArray.length; i++){
            if (gcd == 1) return gcd;
            gcd = singleGCD(gcd, gcdArray[i]);
        }
        return gcd;
    }
}
