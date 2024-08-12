public class FcatorialOfN {
    public int factorialOfN(int n){
        if (n == 1)
            return 1;
        return n*factorialOfN(n-1);
    }

    public void parametrizedFactorial(int fact, int i){
        if (i == 1){
            System.out.println(fact);
            return;
        }
        fact *= i;
        parametrizedFactorial(fact, i-1);
    }
}
