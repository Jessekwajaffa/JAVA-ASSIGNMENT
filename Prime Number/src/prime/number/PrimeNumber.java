package prime.number;
import java.util.Scanner;
/* @author JESSE .E. KWAJAFFA */

public class PrimeNumber {
     public static void main(String[] args) {
        float primeNum;
            boolean ThisIsPrime=true;
            Scanner hello=new Scanner (System.in);
                System.out.print("PLEASE TYPE IN A NUMBER :");
                   int NumValue=hello.nextInt();
                 for (int p=2; p<=NumValue/2;p++)
            {
                 primeNum=NumValue%p;
                    if(primeNum==0){
                    ThisIsPrime=false;
                 break;
            }
        }
if(ThisIsPrime)
System.out.println(NumValue +" Is a Prime Number");
else
System.out.println(NumValue +" Is not a Prime Number");
}
}











        }
        
        
                
                
        
        
    }
    
}
