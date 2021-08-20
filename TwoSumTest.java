import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumTest {
    public static void main(String ... args) {
        int arr[] = new int[]{10,5,20,30,90};
        int targetSum = 50;

        TwoSumTest test = new TwoSumTest();
       // System.out.println(Arrays.toString(test.bruiteForce(arr,targetSum)));

        System.out.println("Hash TwoSum solution :: " + Arrays.toString(test.hashFindSum(arr, targetSum)));

    }

    public int[] hashFindSum(int arr[], int targetSum) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++) {
            int balance = targetSum - arr[i];
            if(map.containsKey(balance)) {
                return new int[]{map.get(balance),i};
            }else {
                map.put(arr[i], i);
            }
        }
        return new int[] {};
    }


    public int[] bruiteForce(int[] arr, int targetSum){
        for(int i = 0;i<arr.length;i++) {
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == targetSum) {
                    System.out.println("Target sum index value is :: " + i + " and " + j);
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
