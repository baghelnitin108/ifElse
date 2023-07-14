import java.util.Scanner;

public class trangle1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Side ");
        int a=sc.nextInt();
        System.out.println("Enter Second Side ");
        int b=sc.nextInt();
        System.out.println("Enter Third Side ");
        int c=sc.nextInt();

        if(a==b&&b==c){
            System.out.println("This is valid trangle");
        }else{
            System.out.println("This is invalid trangle");
        }
    }
    
}
