import java.util.Arrays;

public class ReverseAnArray {
    public int[] reverseAnArray(int i, int size, int[] res, int[] arr){
        if(size < 0){
            return res;
        }
        res[size] = arr[i];
        return reverseAnArray(i+1, size-1, res, arr);
    }
}
