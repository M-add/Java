import java.util.*;

public class ani {

    void verify(int arr[]) {
        int i, j, max = 0, index = 0, count = 0, val = 0;
        while (count != arr.length - 1) {
            count = 0;
            for (i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                    index = i;
                }
            }
            val++;
            for (j = 0; j < arr.length; j++) {
                if (j == index) {
                    continue;
                } else {
                    arr[j] += 1;
                }
            }
            int compare = arr[0];
            for (j = 1; j < arr.length; j++) {
                if (arr[j] == compare) {
                    count++;
                }
            }
        }
        System.out.println(val);
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        ani obj = new ani();
        obj.verify(arr);
    }
}