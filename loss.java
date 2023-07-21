import java.util.Scanner;

public class loss{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }
        int max = prices[0];
        int maxLoss = 0;
        for (int i = 1; i < n; i++) {
            if (prices[i] > max) {
                max = prices[i];
            } else {
                int loss = max - prices[i];
                if (loss > maxLoss) {
                    maxLoss = loss;
                }
            }
        }
        System.out.println(maxLoss);
    }
}
