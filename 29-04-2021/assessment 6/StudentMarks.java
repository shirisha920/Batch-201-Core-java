import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0,avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 subjects marks : ");
		int English = sc.nextInt();
		int Hindhi = sc.nextInt();
		int Maths = sc.nextInt();
		int Science = sc.nextInt();
		int Social = sc.nextInt();
		
		total = English + Hindhi + Maths + Science + Social ;
		avg = total/5;
		
		System.out.println("total marks of student : " + total);
		System.out.println("avg of total MARKS : " + avg);
		System.out.println("the Student grade is : ");
		
		if(avg > 80) {
			System.out.println("A");
		}
		else if(avg > 60 && avg < 80) {
			System.out.println("B");
		}
		else if(avg > 40 && avg <60) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}
		
	}

}
