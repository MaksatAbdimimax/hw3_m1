public class Main {
    public static void main(String[] args) {

        double[] numbers = {1.5, 1.5, -1.5, -1.5, -1.5, 1.5, -1.5, 1.5, 1.5, -1.5, -1.5, 1.5, -1.5, 1.5, 1.5,};
        double sum = 0.0;
        boolean isNegative = false;
        int quantity = 0;

        for (double num : numbers) {
            if (num < 0) {
                isNegative = true;
            } else if (num > 0&& isNegative) {
                sum += num;
                quantity++;
            }
        }

        System.out.println(sum/quantity);

    }
}