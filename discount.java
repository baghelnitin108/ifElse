import java.util.*;

public class discount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Price");
        int p=sc.nextInt();
        System.out.println("Enter Quantity");
        int q=sc.nextInt();
        
        if(q<=100){
            int cp=p*q;
            System.out.println(cp);
        }else{
            int cp=p*q;
            cp=(cp*90)/100;
            System.out.println("Price after 10% Discount");
            System.out.println(cp);
        }
    }
    
}
