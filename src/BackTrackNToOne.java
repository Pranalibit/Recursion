public class BackTrackNToOne {
    public void backTrackNToOne(int i, int n){
        if(i > n){
            return;
        }
        backTrackNToOne(i+1,n);
        System.out.println(i);
    }

}
