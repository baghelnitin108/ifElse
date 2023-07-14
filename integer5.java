import java.util.Scanner;

public class integer5 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in );
    System.out.println("Enter Number");
    int a=sc.nextInt();

    if(a%5==0){
        System.out.println("this is a multipal of 5");
    }else{
        System.out.println("this is not multipal of 5");
    }
}    
}
