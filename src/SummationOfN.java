public class SummationOfN {
    //parametrrized
    public void summationOfN(int sum, int n){
        if(n < 1){
            System.out.println(sum);
            return;
        }
        sum += n;
        summationOfN(sum, n-1);
    }
    //functional recursion
    public int functionalSummation(int n){
        if(n == 0)
            return 0;
        return n + functionalSummation(n-1);
    }
}
