import java.math.BigInteger;

import static java.lang.Math.min;

/**
 * Created by pchen on 3/14/2017.
 */
public class Problem3 {
    private static final long nStart = 600851475143L;
    // the sqrtN is a upper bound on the largest prime
    private static double sqrtN = Math.sqrt(nStart);
    // set max prime to 1 for now
    int max = 1;
    public int returnMaxPrime(long n, int i) {
        // if the divisor is greater than sqrt(N), or the remaining factor of n, return the max prime
        // factor
        if (i > min(sqrtN,n)) {
            return max;
        }
        // if i divides n, recursively call returnMaxPrime on n/i , i
        if (n % i == 0) {
            max = i;
            return returnMaxPrime(n/i, i);
        }
        // if i doesn't divide n, recursively call returnMaxPrime on n/i,i
        // we could have made this faster by first checking if i divides n, then calling the function,
        // but this is more clear
        else {
            return returnMaxPrime(n, i + 1);
        }
    }
    //test of our solution
    public static void main(String[] args) {
        Problem3 solution = new Problem3();
        System.out.println(solution.returnMaxPrime(nStart, 2));
    }
}
