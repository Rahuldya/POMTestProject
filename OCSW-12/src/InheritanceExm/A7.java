package InheritanceExm;

public class A7 implements Printable,Showable
{
	public void show(){System.out.println("Welcome");}  
	
	public static void main(String[] args) {

		A7 obj = new A7();  
		Printable p=new A7();
		Showable s=new A7();
		  // add
		//sss
		//ss
		
		//sss
		obj.show(); 
		p.show(); 
		s.show(); 

	}

}
