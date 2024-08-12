import java.util.*;

public class SubsequencesWithSumK {
    static List<List<Integer>> res;

    public List<List<Integer>> subsetsWithSumK(int[] nums, int sum) {
        res = new ArrayList<>();
        Arrays.sort(nums);
        subsequences(0, nums, res, new ArrayList<Integer>(), sum, 0);
        return res;
    }

    public void subsequences(int i, int[] nums, List<List<Integer>> res, List<Integer> arr, int providedSum, int subsequenceSum) {
        if (i == nums.length && subsequenceSum == providedSum) {
            res.add(new ArrayList<>(arr));
            System.out.println("Sum " + subsequenceSum + " and array ");
            System.out.println(arr);
            return;
        }
        if (i < nums.length && subsequenceSum <= providedSum) {
            arr.add(nums[i]);
            subsequences(i + 1, nums, res, arr, providedSum, subsequenceSum + nums[i]);
            arr.remove(arr.size() - 1);
            subsequences(i + 1, nums, res, arr, providedSum, subsequenceSum);
        }
    }
}
