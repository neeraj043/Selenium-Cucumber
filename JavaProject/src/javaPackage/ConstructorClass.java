package javaPackage;

public class ConstructorClass {
	
	private String EmpName;
	private int Age;
	String FatherName;
	int FatherAge;
	String GrandFatherName;
	int GrandFatherAge;
	String str1;
	String str2;
	
	public ConstructorClass() {
		
		EmpName="Neeraj Kumar";
		Age=39;
	}
	
	public void DisplayDetails() {
		System.out.println("Employee Name: " +EmpName);
		System.out.println("Employee Age: " +Age);
		System.out.println("Employee FatherName: " +FatherName);
		System.out.println("Employee Age of Father: " +FatherAge);
		System.out.println("Employee GrandFather Name: " +GrandFatherName);
		System.out.println("Employee Age of Gand Father: " +GrandFatherAge);
	}
	
	public void strCompare() {
		
		boolean flag=str1.equals(str2);
		if (flag==true) {
			System.out.println("Both Strings are the same");
			
		}else{
			System.out.println("Both Strings are not the same");
			
		}
	}
	
	public void instr() {
		boolean flag1=str1.contains(str2);
		char a=str1.charAt(7);
		String str3=str1.substring(0, 6);
		if (flag1==true) {
			System.out.println("Str1 does contain str2");
		
		}else {
			System.out.println("Str1 doesn't contain str2");
		}
		System.out.println("char at value :" +a +str3);
	}
	
	public void strSplit() {
		String str4="Automation Framework";
		String [] aArray=str4.split(" ");
		System.out.println(aArray[0]);
		System.out.println(aArray[1]);
	}

}
