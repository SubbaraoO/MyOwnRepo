
public class CnditionalStatementsIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CnditionalStatementsIF d = new CnditionalStatementsIF();
		//numberVerify(44);
		/*
		 * leapYear(3); d.leapYear(2001);
		 */
		
		//IfElseTernaryExample(29);
		
		//grades(87);
		//marksTernay(-9);
		//pension(59);
		months(1);
	}

	
	public void ageForMarriage() {
		
		int age =9;
		if(age < 21) {
			System.out.println("He is NOT eligible for Marrage");
		}else {System.out.println("He is eligible for Marrage");}
	}
	
	public static void numberVerify(int a) {
		
		if(a%2 ==0) {
			
			System.out.println("Number is EVEN Number: " + a);
		}else {
			
			System.out.println("Number is ODD Number: " + a);
		}
	}
	
	public static void leapYear(int year) {
		
		if((year%4 == 0) && (year%400 ==0)|| (year%100 != 0)) {
			
			System.out.println("Year is Leap Year: "+ year);
		}else {System.out.println("Year is NOT a leap year: "+ year);}
		
	}
	
	
	public static void IfElseTernaryExample(int a) {
		
		String out;
		
		out = (a%2==0)?"Even Number: "+ a: "Odd Number: " + a;
		System.out.println(out);

	}
		public static void grades(int marks) {
			
			
			
			if(marks<=50) {
			
			System.out.println("fail: "+ marks);
			}
			
			else if(marks>=50 && marks<60) {
				
				System.out.println("D grade: "+ marks);
				
			}
			else if(marks>60 && marks<70) {
					
					System.out.println("C grade: "+ marks);
			}
					
			else if(marks>=70 && marks<80) {
						
						System.out.println("B grade: "+ marks);
			}
						
			else if(marks>=80 && marks<90) {
							
							System.out.println("A grade: "+ marks);
						}else {System.out.println("Not a valid number: "+ marks);}
					}

public static void marksTernay(int marks) {
	String s;
	
	s= (marks<=50)?"FAILED":(marks>=50 && marks<60)?"D GRADE"
	:(marks>60 && marks<70)?"C GRADE":(marks>=70 && marks<80)?"B GRADE":(marks>=80 && marks<90)?"A GRADE":"INVALID";
	
	System.out.println(s);
}

public static void pension(int age) {
	
	if(age>=60) {
	
	System.out.println("Eligible for pension: "+age);
	
} else {
	
	System.out.println("Not eligible for pension: "+age);}

	

}

public static void months(int month) {
	
	  String s;
	  
	  s= (month==1)?"January":(month==2)?"February":(month==3)?"March":(month==4)?
	  "April":(month==5)?"May":(month==6)?"June":(month==7)?"July"
	  :(month==8)?"August":(month==9)?"September":(month==10)?"October":(month==11)
	  ?"November":(month==12)?"December":"";
	  
	  System.out.println(s);
	 
	
}

}

