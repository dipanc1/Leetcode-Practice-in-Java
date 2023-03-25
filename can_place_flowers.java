class Solution54 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0){
                int next = (i == flowerbed.length - 1) ? 0 : flowerbed[i+1];
                int prev = (i == 0) ? 0 : flowerbed[i-1];
                if (next == 0 && prev == 0){
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count == n;
    }
}

public class can_place_flowers {
    public static void main(String[] args) {
        Solution54 s = new Solution54();
        System.out.println(s.canPlaceFlowers(new int[] {1,0,0,0,1}, 1));
    }
}
