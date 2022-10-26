
package FiboDemo;

import java.util.Scanner;

/**
 *
 * @author nayeem
 */
public class FiboDemo {
    public static void main(String[]args)
    {
    
    //take input from user
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Any Number:");
        
        
        //variable  n holds the input from user
        int n=sc.nextInt();
        
        
        
        int firstNum,secondNum,fibo;
        
        
        firstNum=0;
        
        secondNum=1;
        
        
        System.out.print(firstNum+" "+secondNum);
        
        
        for (int i=3;i<=n;i++)
        {
        
            fibo=firstNum+secondNum;
            
            System.out.print(" "+fibo);
            
            firstNum=secondNum;
            secondNum=fibo;
            
           
            
            
        
        }
        System.out.println();
        
        
        
        
        
    
    
    
    
    
    
        
    
    
    }
}
