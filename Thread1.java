import java.util.Scanner;

class Thread1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        AverageTask obj=new AverageTask(arr);
        MaxTask obj1= new MaxTask(arr);
        MinTask obj2= new MinTask(arr);
        Thread averageThread = new Thread(obj);
        Thread maxThread = new Thread(obj1);
        Thread minThread = new Thread(obj2);
        averageThread.start();
        maxThread.start();
        minThread.start();
    }
}

class AverageTask implements Runnable {
    private int[] numbers;

    public AverageTask(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.length;
        System.out.println("The average of the input numbers is: " + average);
    }
}

class MaxTask implements Runnable {
    private int[] numbers;

    public MaxTask(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The maximum number in the input array is: " + max);
    }
}

class MinTask implements Runnable {
    private int[] numbers;

    public MinTask(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("The minimum number in the input array is: " + min);
    }
}