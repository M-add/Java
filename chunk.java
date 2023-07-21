import java.util.*;
public class chunk {
    public static int[][] chunkArray(int[] arr, int size) {
        int numc = (int) Math.ceil((double) arr.length / size);
        int[][] chunkedArray = new int[numc][];
        int startIndex = 0;

        for (int i = 0; i < numc; i++) {
            int endIndex = Math.min(startIndex + size, arr.length);
            int chunkSize = endIndex - startIndex;
            int[] chunk = new int[chunkSize];

            for (int j = 0; j < chunkSize; j++) {
                chunk[j] = arr[startIndex + j];
            }

            chunkedArray[i] = chunk;
            startIndex += size;
        }

        return chunkedArray;
    }

    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		int size =sc.nextInt();
        int[][] chunkedArray = chunkArray(arr, size);
        printArray(chunkedArray);
    }

    public static void printArray(int[][] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                if (j < arr[i].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.print("]");
            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}