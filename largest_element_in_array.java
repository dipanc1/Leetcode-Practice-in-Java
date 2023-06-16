class Compute {

    public int largest(int arr[], int n)
    {
        int ans = 0;
        for (int i = 0; i < n; i++) {
           if (arr[i] > ans) ans = arr[i];
        }
        return ans;
    }
}
public class largest_element_in_array {
    public static void main(String[] args) {
        Compute compute = new Compute();
        System.out.println(compute.largest(new int[] {1, 8, 7, 56, 90}, 5));
    }
}
