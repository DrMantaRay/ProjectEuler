/**
 * Created by pchen on 3/14/2017.
 */
public class Problem2 {
    private int sum;
    private int n;
    Problem2(int n) {
        this.n = n;
        sum = 0;
    }
    public int evenFibSum(int aOne, int aTwo) {
        // if aTwo is divisble by two, add to the sum
        if (aTwo % 2 == 0) {
            sum+= aTwo;
        }
        // if the next number in the fibonacci sequence is greater than n, return the sum.
        if (aOne + aTwo > n) {
            return sum;
        }
        // otherwise call the function recursively on aTwo and aOne + aTwo
        else {
            return evenFibSum(aTwo, aOne + aTwo);
        }
    }
    public static void main(String[] args) {
        //Using n = 4000000
        Problem2 solution = new Problem2(4000000);
        System.out.println(solution.evenFibSum(1,2));
    }
}
