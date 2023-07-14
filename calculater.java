import java.util.Scanner;

public class calculater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int a=sc.nextInt();
        System.out.println("Enter Operator");
        char b=sc.next().charAt(0);
        System.out.println("Enter Second Number");
        int c=sc.nextInt();


        if(b=='+'){
            System.out.println(a+c);
        }else if(b=='-'){
            System.out.println(a-c);
        }else if(b=='*'){
            System.out.println(a*c);
        }else if(b=='/'){
            System.out.println(a/c);
        }else{
            System.out.println("Invalid");
        }

    }
    
}
