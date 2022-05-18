package Classess;

public class string {

	public  void aaa() {
		StringBuffer sb = new StringBuffer("hii vinod");
		System.out.println(sb);
		
		System.out.println(sb.substring(1)+"  "+"deleting position");
		
		System.out.println(sb.substring(1,4)+"  "+"printing char position in b/w 1&4");
		
		System.out.println(sb.append("singaram")+"-->"+"to add ");
		
		System.out.println(sb.delete(1, 3)+"-->"+"delete char");
		
		System.out.println(sb.deleteCharAt(4)+"-->"+"delete char");
		
		System.out.println(sb.insert(6, "singaram")+"-->"+"add to msg");
		
		System.out.println(sb.replace(2, 8, "singaram")+"-->"+"remove b/w 2-8 char and singaram in that place");
		
		System.out.println(sb);
		System.out.println(sb.reverse()+"-->"+"printing reverse");
	}
	public  void bbb() {
		String s1=new String("singaram");
		String s2= "Vinod";
		String s3="Vinod";
		System.out.println(s1.length()+"-->"+"count length");
		
		System.out.println(s2.length()+"-->"+"count length");
		
		System.out.println(s1.charAt(0)+"-->"+"print specified char");
		
		System.out.println(s2.chars()+"-->"+"print chars");
		
		System.out.println(s1.concat(s2)+"-->"+"print same line");
		
		System.out.println(s2.concat(s1)+"-->"+"print same line");
		
		System.out.println(s1.equals(s2)+"-->"+"verify equal words");
		
		System.out.println(s2.equalsIgnoreCase(s3)+"-->"+"verify equal words");
		
	}
	public void stringbuilderdemo(){
		StringBuilder str1= new StringBuilder("welcome selenium");
		String str2= "welcome seleniumdemo";
		System.out.println(str1+"   "+str2);
		System.out.println(str1.reverse()+"-->"+"print reverse");
		
	}
	
	public static void main(String[] args) {
		string str = new string();
		str.aaa();
		str.bbb();
		str.stringbuilderdemo();
	}

}
