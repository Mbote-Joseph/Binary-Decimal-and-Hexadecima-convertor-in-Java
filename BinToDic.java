import java.util.Scanner ;
public class BinToDic{
    static int power(int a ,int p) {
        int s =1 ;
        for (int i=0 ; i < p ; i++){
            s*=a ;
        }
        return s;   
}
    public static void main(String[] args) {
        System.out.print("Enter your binary number : ");
        Scanner read= new Scanner (System.in) ;
        String b=read.nextLine() ; int s=0,l=b.length()-1,count=0  ;
        for (int i=0 ;  i <b.length()  ; i++){
            if (b.charAt(i)=='0' || b.charAt(i)=='1')count++ ; 
        }
        if (count != b.length()) 
            System.out.println("This number is not a binary number !!");
        else {
        for (int i=0 ;  i <b.length()  ; i++){
            if (b.charAt(i)== '1'){
                s+=power(2, l);
                l-- ;
            }else l-- ; 
        }
        System.out.println("The decimal number is : "+s);
        }
    }  
}