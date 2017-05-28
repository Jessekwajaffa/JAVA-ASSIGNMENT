package cmp202;

/* @author JESSE .E. KWAJAFFA */
import java.util.Scanner;
    public class project1 {
        public static void main(String[] args) {
            for(;;){
            Scanner num = new Scanner(System.in);
             System.out.println("ENTER ANY VALUE :");/*prompts user to enter a number*/
                int value = num.nextInt();
             if(value%2==0){
        System.out.println(value+ " Is an even number");/*displays a number if it's even*/
        }
        else {
        System.out.println(value+ " is an odd number");/*displays a number if it's odd*/
        }
    }
    }
    
}
