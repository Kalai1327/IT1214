//M1
/*
class Rectangle{

}

class Main{
	public static void main (String[] args){
		for (int i=0; i<10;i++){
			System.out.println("Value of i is "+i);
		}
	}
}
*/

//M2
/*
class Rectangle{

}

class Main{
	public static int main (String[] args){
		for (int i=0; i<10;i++){
			System.out.println("Value of i is "+i);
		}
		return 0;
	}
}
*/

//3
/*
class Rectangle{
	void print(int width, int height){
		for(int i=0;i<height;i++){
			for (int j=0; j<width; j++){
				System.out.print("*");// not println , for * in each line
			}
			System.out.println();// break line //("*"):print an extra * //2nd
		}
	}
}

class Main{
	public static void main (String[] args){
		Rectangle r1=new Rectangle();
		r1.print(3,4);
	}
}
*/

//4
class Rectangle{
	int height;
	int width;
	
	Rectangle(int h, int w){
		this.height=h; //3rd (this.)
		this.width=w;
		System.out.println("Just create a rectangle object with size (h*w)"+height+"*"+width);
		print(width,height);// without this ,only the string will displayed //2nd
	}
		
	void print(int width, int height){
		for(int i=0;i<height;i++){
			for (int j=0; j<width; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class Main{
	public static void main (String[] args){
		Rectangle r1=new Rectangle(5,3);
		Rectangle r2=new Rectangle(3,6);
		System.out.println("Height "+r1.height+" ,Width "+r1.width); //3rd
	}
}