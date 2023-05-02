import java.util.Arrays;

class Solution71 {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double average = 0;

        for (int i = 1; i < salary.length - 1; i++) {
            average += salary[i];
        }

        return average / (salary.length - 2);
    }
}

public class average_salary_excluding_min_and_max {
    public static void main(String[] args) {
        Solution71 s = new Solution71();
        System.out.println(s.average(new int[]{4000, 3000, 1000, 2000}));
    }
}
