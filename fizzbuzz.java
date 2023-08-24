class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            String output = "";
            if ((i % 3 == 0) && (i % 5 == 0)) {
                output += "FizzBuzz";
            } else if (i % 5 == 0) {
                output += "Buzz";
            } else if (i % 3 == 0) {
                output += "Fizz";
            } else {
                output += i;
            }
            System.out.println(output);
        }

    }

}

public class fizzbuzz {
    public static void main(String[] args) {
        Result.fizzBuzz(15);
    }
}
