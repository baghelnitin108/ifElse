import java.util.*;
public class grade1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Hardness");
        int a=sc.nextInt();
        System.out.println("Enter Carbon content");
        double b=sc.nextDouble();
        System.out.println("Enter Tensile strength");
        int c=sc.nextInt();

        if(a>50 && b<=0.7 && c>5600){
            System.out.println("Grade 10");
        }else if(a>50&&b<0.7){
            System.out.println("Grade 9");
        }else if(b<0.7&&c>5600){
            System.out.println("Grade 8");
        }else if(a>50&&c>5600){
            System.out.println("Grade 7");
        }else if (a>50||b<0.7||c>5600){
            System.out.println("Grade 6");
        }else{
            System.out.println("Grade 5");
        }
    }
    
}
