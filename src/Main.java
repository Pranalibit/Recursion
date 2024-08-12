import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        NameFiveTime nameFiveTime = new NameFiveTime();
//        nameFiveTime.NameFiveTime(1,5);
//        OneToN oneToN = new OneToN();
//        oneToN.OneToN(1,10);
//        NToOne nToOne = new NToOne();
//        nToOne.NToOne(4,4);
//        BackTrackNToOne backTrackNToOne = new BackTrackNToOne();
//        backTrackNToOne.backTrackNToOne(1,3);
//        BackTrackOneToN backTrackOneToN =  new BackTrackOneToN();
//        backTrackOneToN.backTrackOneToN(4,4);
//        SummationOfN summationOfN = new SummationOfN();
//        summationOfN.summationOfN(0,5);
//        System.out.println(summationOfN.functionalSummation(5));
//        FcatorialOfN fcatorialOfN = new FcatorialOfN();
//        System.out.println(fcatorialOfN.factorialOfN(5));
//        fcatorialOfN.parametrizedFactorial(1,5);

        int[] numbers = {15, 30, 11, 14, 19, 4};
        int[] res = new int[6];
        ReverseAnArray reverseAnArray = new ReverseAnArray();
        System.out.println(Arrays.toString(reverseAnArray.reverseAnArray(0, 5, res, numbers)));
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fibonacci(15));
        PrintAllSubsequences printAllSubsequences = new PrintAllSubsequences();
        int[] nums = {3,1,2};
//        printAllSubsequences.printSubsequences(0,nums,new ArrayList<>());
        SubsequencesWithSumK subsequencesWithSumK = new SubsequencesWithSumK();
        subsequencesWithSumK.subsetsWithSumK(nums,3);
    }
}