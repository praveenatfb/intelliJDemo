package com.core;

class Constructor1{
	
	Constructor1()
	{
		System.out.println("class one constructor");
	}
}
class Constructor2 extends Constructor1{
	int num;
	String name;
	/*Constructor2(){
		//this(5);
	}*/
	Constructor2(int num,String name){
		super();
		this.num=num;
		this.name=name;
		System.out.println("class two constructor");
	}
	
}
class Constructor3 extends Constructor2{
		String designation;
		Constructor3(int num,String name,String designation){
			super(num, name);
			this.designation=designation;
			System.out.println("class three constructor");
	}
		void display() {
			System.out.println(num+"\t"+name+"\t"+designation);
		}
	
}
public class ConstructorChaining {

	public static void main(String[] args) {
		Constructor3 c=new Constructor3(1,"man","human");
		c.display();
		
	}

}
