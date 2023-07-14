import java.util.*;
public class uperLowercase{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter character");

        char ch=sc.next().charAt(0);
        
        if(ch>='a'){
            if(ch<='z'){
                System.out.println("lower case");
            }
        }else if(ch>='A'){
             if(ch<='Z'){
                System.out.println("upper case");
            }
        }

        
    }
    
}
