import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        System.out.println("Enter Basic Salary");
        int s=sc.nextInt();

    
        if(s<=10000){
            int hra=(s*20)/100;
            int da=(s*80)/100;
            int gs=hra+da+s;
            System.out.println("Total salary is");
            System.out.println(gs);
        }else if(s<=20000){
            int hra=(s*25)/100;
            int da=(s*90)/100;
            int gs=hra+da+s;
            System.out.println("Total salary is ");
            System.out.println(gs);
        }else if(s>20000){
            int hra=(s*20)/100;
            int da=(s*80)/100;
            int gs=hra+da+s;
            System.out.println("Total salary is");
            System.out.println(gs);
        }
    }
    
}
