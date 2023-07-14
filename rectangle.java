import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        System.out.println("Enter length of rectangle");
        int l=sc.nextInt();
        System.out.println("Enter breadth of rectangle");
        int b=sc.nextInt();

        int a=l*b;
        int p=2*(l+b);

         if(a>p){
            System.out.println("Area is greater");
         }else{
            System.out.println("Perimeter is greater");
         }


    }
    
}
