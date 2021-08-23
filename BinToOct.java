import java.util.Scanner ;
public class BinToOct {
    public static void main(String[] args) {
        Scanner read= new Scanner (System.in);
         System.out.println("Enter a binary num :");
         String bin = read.nextLine()  ;
         System.out.print("In octal is : ");
         toOct (bin) ; 
    }
    
    static void toOct (String a) {
        if (a.length()%3 == 0) { 
            String threedigits="" ;
            int count= 0 , j1=0 ;
         for (int i= 0 ; i<a.length() / 3 ; i++) {
             for (int j=j1 ; j<a.length() ; j++ ) {
                 threedigits += a.charAt(j) ;
                 count++ ; 
                 if (count % 3 == 0){
                     j1=j+1 ;
                     j=a.length() ;
                 } 
             }
             System.out.print(toDecimal(threedigits)) ;
             threedigits ="" ;
         }   System.out.println();
            
        } else {
            if (a.length()%3 ==1){
                toOct("00"+a) ;
            }else toOct("0"+a);
        }
    }
    static int toDecimal (String b) {
        int count =0 ,s=0, l=b.length()-1;
        for (int i=0 ;  i <b.length()  ; i++){
            if (b.charAt(i)=='0' || b.charAt(i)=='1')count++ ; 
        }
        if (count != b.length()) 
            System.out.println("This number is not a binary number !!");
        else {
        for (int i=0 ;  i <b.length()  ; i++){
            if (b.charAt(i)== '1'){
                s+=Math.pow(2, l);
                l-- ;
            }else l-- ; 
        }
    }
        return s ;
    }   
}
