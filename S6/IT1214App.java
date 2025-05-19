//M3
class Student{
   int marks;
   String name;
   
   Student(){
	   System.out.println("Creating a Student object");//1st
	   name="Default name"; //2nd
   }
   Student(String n, int m){
	   System.out.println("Creating a Student object with name "+n+" marks "+m);
   }
}

class App{
    public static void main(String[] args){
		System.out.println("Welcome to Demo class app");
		
		Student s1=new Student();
		s1.marks=100;
		System.out.println("Name of the student s1 = "+s1.name);// default name for another one //3rd
		s1.name="Alice";
		System.out.println("Name of the student s1 = "+s1.name);
		
		Student s2=new Student("Bob",90);
		//s2.marks=90;
		//s2.name="Bob";
		System.out.println("Name of the student s2 = "+s2.name);
		
		
	}
}

/* for M1 & M2
class Student{
   int marks;
   String name;
}
   
//M2 //use 'p.print'to avoid'System.out.println'again & again
/*
class Printer{ //purpose of the printer class is replace 'System.out.println'
	void print(String s){
		System.out.println(s); //if we use a string 'hi' for 's'..it prints 'hi' 2times while compile
	}
}

class App{
    public static void main(String[] args){
		Printer p=new Printer();
		p.print("Welcome to Demo class app"); //print or pr
		
		Student s1=new Student();
		s1.marks=100;
		s1.name="Alice";
		p.print("Name of the student s1 = "+s1.name);
	}
}
*/

//M1
/*class App{
    public static void main(String[] args){
		System.out.println("Welcome to Demo class app");
		
		Student s1=new Student();
		s1.marks=100;
		s1.name="Alice";
		System.out.println("Name of the student s1 = "+s1.name);	
	}
}
*/