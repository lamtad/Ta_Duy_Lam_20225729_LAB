import javax.swing.JOptionPane;
import java.util.*;
public class Calculator{
	public static void main(String[] args){
		String strNum1, strNum2;
		String strNotification = "You've just entered: ";
		
		strNum1 = JOptionPane.showInputDialog(null,
		"Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
		
		double a = Double.parseDouble(strNum1);
		
		strNum2 = JOptionPane.showInputDialog(null,
		"Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
		
		double b = Double.parseDouble(strNum2);
		
		double sum = a+b;
		double diff = a-b;
		double prod = a*b;
		
		JOptionPane.showMessageDialog(null, sum, "Show sum", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, diff, "Show difference", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, prod, "Show product", JOptionPane.INFORMATION_MESSAGE);
		if(b != 0){
		double quo = a/b;
		JOptionPane.showMessageDialog(null, quo, "Show quotient", JOptionPane.INFORMATION_MESSAGE);
		}else{
		JOptionPane.showMessageDialog(null, "Can not divide by 0", "Show quotient", JOptionPane.INFORMATION_MESSAGE);
		}
		System.exit(0);
	}
}
