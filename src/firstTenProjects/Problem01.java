package firstTenProjects;

public class Problem01 {
    public static int getSum() {
        int sum = 0;

        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum = getSum();
        System.out.println("Sum of all multiples of 3 or 5 below 1000 is: " + sum);
    }
}
