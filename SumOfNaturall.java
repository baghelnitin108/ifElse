import java.util.Scanner;

public class SumOfNaturall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();

        int ans=n*(n+1)/2;
        System.out.println("Sum of natural number is");
        System.out.println(ans);
        
    }
    
}
