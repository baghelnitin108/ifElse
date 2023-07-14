import java.util.*;
public class company {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Type M for married and U for unmarried");
        char status=sc.next().charAt(0);

        System.out.println("Enter Your Age ");
        int age=sc.nextInt();

        System.out.println("Press M for Male and F for Female");
        char gender=sc.next().charAt(0);


        if(status=='m'||status=='M' ) {
            System.out.println("You are Hired");

        }else if(age>30&&status=='u'||status=='U'&&gender=='m'||gender=='M') {
            System.out.println("You are  Hired");
        }else if(age>25||age<30&&status=='u'||status=='U'&&gender=='f'||gender=='F'){
            System.out.println("You are Hired");
        }else{
            System.out.println("You are not Hired");
        }
    }
        
    }
    
