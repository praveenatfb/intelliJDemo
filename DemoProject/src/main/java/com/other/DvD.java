package com.other;

class DvDInfo{
	String title;
	String genre;
	String leadActor;
	DvDInfo(String t,String g,String l){
		title=t;
		genre=g;
		leadActor=l;
	}
	public String toString() {
		return title + " "+ genre+ " "+leadActor;
	}
	
	 void getter(){
		System.out.println(title);
		System.out.println(genre);
		System.out.println(leadActor);
	}
}

public class DvD {

	public static void main(String[] args) {
		DvDInfo d=new DvDInfo("Notebook","Romance","pranutan bal");
		d.getter();
		
		System.out.println(d);
		
	}

}
