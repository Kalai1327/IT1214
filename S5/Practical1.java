class Paper{
	int length;
	int width;   // or int length,width;
	String text;
	
}

class Document{
	String name;
	Paper p;
	
	public static void main(String[] args){
		Document d=new Document();
		System.out.println("Created a Document object d");// to print any string value or character
		d.name="My First Document";
		System.out.println("Name of the Document d is "+d.name);
		d.p=new Paper();
		
		d.p.length=10;
		d.p.width=10;
		d.p.text="This is the text in the paper of Document My First Document";
		System.out.println("Size (1*w) of the paper of the document d is "+d.p.length+"*"+d.p.length);
		System.out.println("text value of paper p of document d "+d.p.text);
		
		Document d2=new Document();
		System.out.println("Created a Document object d2");
		d2.name="My Second Document";
		System.out.println("Name of the Document d2 is "+d2.name);
		
	}

}