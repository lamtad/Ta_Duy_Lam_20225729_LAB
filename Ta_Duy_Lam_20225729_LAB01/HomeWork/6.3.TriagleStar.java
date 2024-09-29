package choosingOption;

import java.util.*; // package to use Scanner class 
class Star { 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in); 
       
        int rows = sc.nextInt(); 
  
     
        for (int i = 1; i <= rows; i++) { 

            for (int j = rows; j >= i; j--) { 
                System.out.print(" "); 
            } 
  
            for (int j = 1; j <= 2*i-1; j++) { 
                System.out.print("*"); 
            } 
            System.out.println(); 
        } 
        sc.close();
    } 
} 