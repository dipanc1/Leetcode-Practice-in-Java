

class Solution240 {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] count = new int[2];
        int res = students.length;

        for (int s : students) {
            count[s]++;
        }

        for (int s : sandwiches) {
            if (count[s] > 0) {
                res--;
                count[s]--;
            } else return res;
        }

        return res;
    }
}

public class number_of_students_unable_to_eat_lunch {
    public static void main(String[] args) {
        Solution240 s = new Solution240();
        System.out.println(s.countStudents(new int[]{1, 1, 0, 0}, new int[]{0, 1, 0, 1}));
    }
}
