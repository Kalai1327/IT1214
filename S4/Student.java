class Student{
	String name="kalai";
	int marks=99;
	
	Student(){
		name="NoName";	//default constructor
	}
	
	Student(String n){
		name="n";	
	}
	
	Student(String n, int m){
		name=n;
        marks=m;		
	}
}

class TestClass{
	int a;
	public static void main(String[] args){
		System.out.println("Hi from TestClass Class");
	}
}

class StudentDemo{
	public static void main(String[] args){
		System.out.println("Hi from StudentDemo Class");
		System.out.println("Creating an object fromStudent Class");
		Student s1=new Student("Nice Name", 97); //constructor
		System.out.println("Created an object fromStudent Class");
		System.out.println("Name value of the object is "+s1.name);
		System.out.println("Mark value of the object is "+s1.marks );
		
		s1.name="k";//setting the variable value
		s1.marks=98;
		System.out.println("Name value of the object is "+s1.name);//getting the
		System.out.println("Mark value of the object is "+s1.marks );
		
	}
}