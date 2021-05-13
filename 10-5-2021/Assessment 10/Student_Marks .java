import java.util.Scanner;

public class Student_Marks {
	static int total = 0;
	static int avg = 0;
	static int[] marks = new int[5];
	static void dispMarks(int marks[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter "+ marks.length + "sub marks into an array : ");
		
		for(int i = 0; i < marks.length ; i ++) {
			marks[i] = sc.nextInt();
		}
	}
	static boolean isPass(int marks[] ){
		for(int i = 0; i < marks.length ; i ++) {
		if(marks[i] < 35) {
			return false;
		}
		}
		return true;
	  }
	static int calTotal(int marks[]) {
		
		for(int i = 0; i < marks.length ; i ++) {
			total = total + marks[i];
			
			System.out.println("total marks : " + total);
		}
		
		return total;
		
	}
	static String findGrade(int marks[]) {
		
		avg = total / marks.length ;
		if(avg > 80) {
			return "A";
		}
		else if(avg > 60) {
			return "B";
		}
		else if(avg > 35) {
			return "c";
		}
		
		return null;
		
	}
	      

	public static void main(String[] args) {
		
		dispMarks(marks);
		System.out.println(isPass(marks));
		System.out.println(calTotal(marks));
		System.out.println(findGrade(marks));
		

	}

}
