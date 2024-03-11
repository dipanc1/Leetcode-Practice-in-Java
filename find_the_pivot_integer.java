class Solution221 {
    public int pivotInteger(int n) {
//        int sum = (n + 1) * n / 2;
//        int pivot = (int) Math.sqrt(sum);
//        return pivot * pivot == sum ? pivot : -1;
        int l = 1, r = n, fullSum = (n * (n + 1) / 2);

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int firstHalf = (mid * (mid + 1)) / 2;
            int secondHalf = fullSum - firstHalf + mid;
            if (firstHalf == secondHalf) return mid;
            else if (firstHalf < secondHalf) l = mid + 1;
            else r = mid - 1;
        }

        return -1;
    }
}

public class find_the_pivot_integer {
    public static void main(String[] args) {
        Solution221 s = new Solution221();
        System.out.println(s.pivotInteger(8));
    }
}
