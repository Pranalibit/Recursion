public class OneToN {
    public void OneToN(int i, int n){
        if(i > n){
            return;
        }
        System.out.println(i);
        OneToN(i+1,n);
    }
}
