import java.util.*;

class subarray {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        
        int count = 0;
        int product = 1;
        int left = 0;
        int right = 0;
        
        while(right < n) {
            
            product *= arr[right];
            
            while(product >= k && left <= right) {
                product /= arr[left];
                left++;
            }
            
            count += right - left + 1;
            right++;
        }
        
        System.out.println(count);
    }
}
