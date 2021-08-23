import java.util.Scanner;
public class BinToHex {
    public static void main(String[] args) {
        Scanner read= new Scanner (System.in);
         System.out.println("Enter a binary num :");
         String bin = read.nextLine()  ;
         System.out.print("In Hexadecimal is : ");
         toHex (bin) ; 
    }
        static void toHex (String a) {
        if (a.length()%4 == 0) { 
            String threedigits="" ;
            int count= 0 , j1=0 ;
         for (int i= 0 ; i<a.length() / 4 ; i++) {
             for (int j=j1 ; j<a.length() ; j++ ) {
                 threedigits += a.charAt(j) ;
                 count++ ; 
                 if (count % 4 == 0){
                     j1=j+1 ;
                     j=a.length() ;
                 } 
             }
             System.out.print(toDecimal(threedigits)) ;
             threedigits ="" ;
         }
            System.out.println();
            
        } else {
            if (a.length()%4 ==1){
                toHex("000"+a) ;
            }else if (a.length()%3 ==2) {
                toHex("00"+a);
            }else toHex("0"+a);
        }
    }
        
    static char toDecimal (String b) {
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
        char hexS = Integer.toString(s).charAt(0) ;
        if (s==10) {
            return 'A' ;
        } else if (s==11) {
            return 'B' ;
        }else if(s==12) {
            return 'C' ;
        }else if(s==13) {
            return 'D' ;
        }else if(s==14) {
            return 'E' ;
        }else if(s==15) {
            return 'F' ;
        }else return hexS ;
    }   
}
