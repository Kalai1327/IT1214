//M1
/*package a;
public class Test{
	public void print(){
		System.out.println("Hi from class Test in package a");
	}
} */

//M2
/*package a;

public class Test{
	void print(){
		System.out.println("Hi from class Test in package a");
	}
	public void display(){
		System.out.println("Display:Hi from class Test in package a");
	}
} */

//M3
package a;

public class Test{
	void print(){
		System.out.println("Hi from class Test in package a");
	}
	public void display(){
		print();//show both in output
		System.out.println("Display:Hi from class Test in package a");
    }
}