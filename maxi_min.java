import java.util.*;
public class maxi_min {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int a=sc.nextInt();
        System.out.println("Enter Second Number");
        int b=sc.nextInt();
        System.out.println("Enter Third Number");
        int c=sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println(a);
            }else{
                System.out.println(c);
            }
        
    }else if(b>c){
        System.out.println(b);
    }else{
        System.out.println(c);
    }
}
}
