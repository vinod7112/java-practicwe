package Classess;

public class ObjecttoDemo {

	int sum;
	public static void main(String[] args) {
	Student s1= new Student();
	ObjecttoDemo od=new ObjecttoDemo();
	int total= od.display(s1);
	System.out.println("marks are :"+ total);
	}
	   int display(Student s2){
//datatype  method   parameter
	sum= s2.tel+s2.hin+s2.eng+s2.mat+s2.sci+s2.soc;
	return sum;
	}
	}



