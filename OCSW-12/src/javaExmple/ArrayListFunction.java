package javaExmple;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListFunction {

	public static void main(String[] args) {
    ArrayList<String> l1 =new <String>ArrayList();
    
    //ArrayList func()
		
		System.out.println(l1.isEmpty());
		
		l1.add("rahul");
		l1.add("singh ");
		l1.add("yadav");
		
		l1.remove(1);
	//	l1.clear();
		
		int a=l1.indexOf("yadav");
		
		System.out.println(a);
		
		Iterator it=l1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
