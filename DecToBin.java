import java.util.Scanner;
public class DecToBin{
    public static void main(String[] args) throws InterruptedException {
      Scanner read = new Scanner(System.in) ;
      System.out.print("Enter your decimal number : ");
      int a = read.nextInt();  int rest, result ;
      if (a==0)System.out.println("In decimal is : 0")  ; else if
              (a==1) System.out.println("In decimal is : 1");else {
      int bits = (int) (Math.floor(Math.log(a)/Math.log(2))+1);
      int [] b = new int [bits]  ;  int h = bits ;
      do {
          rest = a%2 ; result = a/2 ;
          b[h-1]=rest; 
          h-- ;
          a = result ;
      }while(result >= 2 );
      b[0]=result;
      System.out.print("In binary is : ");
      for (int i = 0 ; i< bits ; i++ ) {
          System.out.print(b[i]);
      }
      System.out.println();
      }
    }  
}