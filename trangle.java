import java.util.Scanner;

public class trangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 3 row of trangle");

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if (a==b && b==c ){
            System.out.println("equi");
        }else if(a==b||b==c||a==c){
            System.out.println("iso");
        }else{
                System.out.println("scalene");
            }
        }
        
    }
    

