public class BackTrackOneToN {
    public void backTrackOneToN(int i, int n){
        if(i < 1){
            return;
        }
        backTrackOneToN(i-1,n);
        System.out.println(i);
    }
}
