public class NToOne {
    public void NToOne(int i, int n){
        if(i <= 0){
            return;
        }
        System.out.println(i);
        NToOne(i-1,n);
    }
}
