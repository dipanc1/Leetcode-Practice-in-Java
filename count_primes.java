class Solution11 {
    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;

        for (int i = 2; i < n; i++) {
            if(!notPrime[i]) count++;
            for (int j = 2; i*j < n; j++) {
                notPrime[i*j] = true;
            }
        }

        return count;
    }
}

public class count_primes {
    public static void main(String[] args) {
        Solution11 s = new Solution11();
        System.out.println(s.countPrimes(10));
    }
}
