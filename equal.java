import java.util.Scanner;

public class equal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 Numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
    
        if(a==b&&b==c&&c==a){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    
    }
    
}
