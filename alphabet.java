import java.util.*;
public class alphabet{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter character");

        char ch=sc.next().charAt(0);
        
        if(ch>='a'){
            if(ch<='z'){
                System.out.println("This is a Alphabet");
            }
        }else if(ch>='A'){
             if(ch<='Z'){
                System.out.println("This is a Alphabet");
            }
        }else{
            System.out.println("This is not a Alphabet");
        }

        
    }
    
}
