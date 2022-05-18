package Classess;

public class ArrayDemo {

	public static void shahs() {
		int aaa[]=new int[5];
		aaa[0]=20;
		aaa[1]=30;
		aaa[2]=40;
		aaa[3]=50;
		aaa[4]=60;
		for(int x:aaa){
			
			System.out.print(x+"  ");
		}

	}
	public static void sjkdh()
	{
		int bbb[]={12,21,21,12};
		for (int y : bbb) {
			System.out.println(y+"  ");
			System.out.println();
		}
		
	}
	public static void multi(){
		int ccc[][]=new int[4][4];
		ccc[0][0]=12;
		ccc[0][1]=23;
		ccc[1][0]=25;
		ccc[1][1]=345;
		for (int[] is : ccc) {
			for (int g : is) {
				System.out.print(g+"   ");
			}
			System.out.println();
		}
	}
	public static void multidi(){
		int ddd[][]= {{2,2,2},{3,3,3},{5,5,5},{32,23,23}};
		for (int[] is : ddd) {
			for (int f : is) {
				System.out.print(f+"   ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		ArrayDemo.shahs();
		ArrayDemo.sjkdh();
		ArrayDemo.multi();
		ArrayDemo.multidi();
	}
	

}
