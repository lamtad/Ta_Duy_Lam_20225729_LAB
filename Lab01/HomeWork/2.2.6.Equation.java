import java.util.*;

public class Equation{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	while(true){
	System.out.println("Please enter the number of variables (1 for linear, 2 for system of equations, 3 for quadratic, or any other key to exit):");
		int n = sc.nextInt();
		if(n == 1){
		System.out.println("Please enter a & b:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		if(a == 0){
			System.out.println("Can not divide by 0");
		}else{
			System.out.printf("x = %.2f\n", -b/a);
		}
	}else if(n==2){
		System.out.println("Please enter a11, a12, b1, a21, a22, b2: ");
		double a11 = sc.nextDouble();
		double a12 = sc.nextDouble();
		double b1 = sc.nextDouble();
		double a21 = sc.nextDouble();
		double a22 = sc.nextDouble();
		double b2 = sc.nextDouble();
		
		double D = a11*a22 - a21*a12;
		double D1 = b1*a22 - b2*a12;
		double D2 = a11*b2 - a21*b1; 
		
		if(D == 0){
			if(D != D1){
				System.out.println("No solution");
				
			}else{
				System.out.println("Infinite solutions");
			}
		}else{
			System.out.printf("x1 = %.2f & x2 = %.2f\n", D1/D, D2/D);
		}
	}else if(n==3){
		System.out.println("Please enter a, b ,c:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double d = b*b - 4*a*c;
		if(d < 0){
			System.out.println("No solution");
		}else if(d == 0.0){
			System.out.printf("x = %.2f\n", -b/(2*a));
		}else{
			System.out.printf("x1 = %.2f & x2 = %.2f\n", (-b+Math.sqrt(d))/(2*a), (-b-Math.sqrt(d))/(2*a));
		}
	}else break;
	
	}
	
	}
	
	
}
