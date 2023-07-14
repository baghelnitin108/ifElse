import java.util.*;

public class multipal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number");
        int n=sc.nextInt();

        if(n%5==0){
        System.out.println("This is a multipal of 5");
    }else if(n%7==0){
        System.out.println("This is a multipal of 7");
    }else{
        System.out.println("This is not a multipal of 5 and 7");
    }
    
}}
