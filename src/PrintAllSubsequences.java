import java.util.ArrayList;
import java.util.Arrays;

public class PrintAllSubsequences {
    public void printSubsequences(int i, int[] nums, ArrayList<Integer> arr){
        if(i==nums.length){
            System.out.println(arr);
            return;
        }
        arr.add(nums[i]);
        printSubsequences(i+1,nums,arr);
        arr.remove(arr.size()-1);
        printSubsequences(i+1,nums,arr);
    }
}
