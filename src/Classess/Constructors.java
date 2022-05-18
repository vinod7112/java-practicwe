package Classess;

public class Constructors {
	int rollno;
	String name;
	String branch;
	public static void main(String[] args) {
		Constructors c1 = new Constructors(102,"ECE",  "vinod");
		
	}
	Constructors(int x, String y){
		rollno= x;
		name= y;
		System.out.println("1st constructor");
		System.out.println("Name:  "+name+"   "  +"Rollno:  "+rollno);
    }
	Constructors(String b){
		branch = b;
		System.out.println("2nd constructor");
		System.out.println("Branch : "  +branch);
	}
	Constructors(int x, String y, String b){
		rollno = x;
		name= y;
		branch= b;
		System.out.println("3rd constructor");
		System.out.println("Name:"+name+"  "+"Rollno:"+rollno+"  "+" Branch: "+ branch);
		
	}

}
