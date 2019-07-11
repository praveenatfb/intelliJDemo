package com.core;

class DefaultAccess{
	int num;
	String name;
	/*DefaultAccess(){
		
	}*/
	DefaultAccess(int no,String nam){
		num=no;
		name=nam;
		
	}
	void display() {
		System.out.println(num+" "+name);
	}

}
class DefaultChild extends DefaultAccess{
	String result;
	DefaultChild(int num,String name,String result1){
		super(num,name);
		result=result1;
	}
		void show(){
		super.display();
		System.out.println(result);
					
		}

}
public class AccessModifiersDemo {

	public static void main(String[] args) {
		DefaultAccess da=new DefaultAccess(1,"saam");
		da.display();
		DefaultChild dc=new DefaultChild(2,"riya","pass");
		dc.show();
	}

}
