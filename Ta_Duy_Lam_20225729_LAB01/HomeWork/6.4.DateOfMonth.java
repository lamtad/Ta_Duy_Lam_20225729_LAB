package choosingOption;

import java.util.*; // package to use Scanner class 
class Date { 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in); 
        
        while(true) {
        	System.out.println("Enter month & year:");
        	String m = sc.next();
        	int month = 0;
        	if(m.length() < 3) {
        		month = Integer.parseInt(m);
        	}else {
        		m = m.substring(0,3).toLowerCase();
        		if(m.equals("jan")) month = 1;
        		if(m.equals("feb")) month = 2;
        		if(m.equals("mar")) month = 3;
        		if(m.equals("apr")) month = 4;
        		if(m.equals("may")) month = 5;
        		if(m.equals("jun")) month = 6;
        		if(m.equals("jul")) month = 7;
        		if(m.equals("aug")) month = 8;
        		if(m.equals("sep")) month = 9;
        		if(m.equals("oct")) month = 10;
        		if(m.equals("nov")) month = 11;
        		if(m.equals("dec")) month = 12;     		
        	}
        	int year = sc.nextInt();
            if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
            	System.out.println("31");
            }else if(month==2) {
            	if(year % 400 == 0 || year%4 == 0 && year %100 !=0 ) System.out.println("29");
            	else System.out.println("28");
       
            }else if(month==4||month==6||month==9||month==11) {
            	System.out.println("30");
            }else break;
        }
        sc.close();
        
    } 
} 