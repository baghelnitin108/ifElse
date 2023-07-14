public class mim_age{
    public static void main(String[] args) {
        int a=6;
        int b=5;
        int c=10;
        
        if(a<b){
            if(a<c){
                System.out.println(a);
            }else{
                System.out.println(c);
            }
        }else if(b<c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
    
}
