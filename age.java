import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        
        System.out.println("Enter Ram age");
        int a=sc.nextInt();
        System.out.println("Enter Shyam age");
        int b=sc.nextInt();
        System.out.println("Enter Ajay age");
        int c=sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("Ram is younger");
               System.out.println(a); 
            }else{
                System.out.println("Ajay is younger");
                System.out.println(c);
            }
        }else if(b>c){
            System.out.println("Shyam is younger");
            System.out.println(b);
        }else{
            System.out.println("Ajay is younger");
            System.out.println(c);
        }
    }
    
}
