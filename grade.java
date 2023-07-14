import java.util.*;
public class grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 5 subjects marks");
       
        int m=sc.nextInt();
        int c=sc.nextInt();
        int p=sc.nextInt();
        int h=sc.nextInt();
        int e=sc.nextInt();

        int sum=m+c+p+h+e;
        int percentage=sum/5;

        if(percentage>=90){
            System.out.println("Grade A");
        }else if(percentage>=80){
            System.out.println("Grade B");
        }else if(percentage>=70){
            System.out.println("Grade C");
        }else if(percentage>=50){
            System.out.println("Grade D");
        }else{
            System.out.println("Grade E");
        }

        

        
    }
}
