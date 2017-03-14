public class Problem1 {
    private int sum;
    private int n;
    // initiates sum to 0 and sets this.n = n
    Problem1(int n) {
        this.n = n;
        sum = 0;
    }
    // returns sum of multiples of 3 or 5.
    public int solve() {
        // iterates through numbers from 1 to n - 1
        for ( int i = 1 ; i < n ; i++) {
            // if i is divisible by 3 (so it leaves a remainder of 0, increment the sum by i
            if ( i % 3 == 0) {
                sum +=i;
            }
            // otherwise, if i is divisble by 5, increment the sum by i. note that the program
            // never reaches this point if the first if condition is satisfied
            else if ( i % 5 == 0) {
                sum +=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Problem1 solve1000 = new Problem1(1000);
        System.out.println(solve1000.solve());
    }
}
