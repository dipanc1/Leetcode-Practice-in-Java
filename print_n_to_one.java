class Solution272 {
    public void nto1(int n) {
        rec(1, n);
    }

    private void rec(int i, int n) {
        if (i > n) return;
        rec( i + 1, n);
        System.out.println(i);
    }

    private void rec2(int i, int n) {
        if (i < 1) return;
        System.out.println(i);
        rec2( i - 1, n);
    }
}

public class print_n_to_one {
    public static void main(String[] args) {
        Solution272 s = new Solution272();
        s.nto1(5);
    }
}
