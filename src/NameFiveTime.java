public class NameFiveTime {
    public void NameFiveTime(int i, int n){
        if(i > n){
            return;
        }
        System.out.println("Pranali");
        NameFiveTime(i+1,n);
    }
}