import java.util.*;
public class AcesDes{

    public static void main(String[] args){
        int arr[] = {1,2,3,3,3,4,4,5,5};
        Arrays.sort(arr);
        HashSet <Integer> set = new HashSet<Integer>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        Object setArray[] = set.toArray();
        HashMap <Integer,Integer> map = new HashMap <>();
        for(int i = 0; i < setArray.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if((int)setArray[i] == arr[j]){
                    count++;
                }
            }
            map.put((int)setArray[i], count);
        }
        System.out.println(map);
        
        int a[] = new int[map.size()];
        int b[] = new int[map.size()];
        for(int i = 1; i <= map.size(); i++){
            int max = 0;
            for(int j = 0; j < map.size(); j++){
                if(max<map.get(i)){
                    max = map.get(i);
                }
            }
            for(int j=0;j<max;j++){
                System.out.print(map.keySet(i)+" ");
            }
        }
    }
}