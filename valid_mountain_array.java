class Solution25 {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false;
        int l = 0;
        int r = arr.length - 1;
        while(l + 1 < arr.length - 1 && arr[l] < arr[l + 1]) l++;
        while(r - 1 > 0 && arr[r] < arr[r - 1]) r--;
        return l == r;
    }
}
public class valid_mountain_array {
    public static void main(String[] args) {
        Solution25 s = new Solution25();
        System.out.println(s.validMountainArray(new int[] {0,3,2,1}));
    }
}
