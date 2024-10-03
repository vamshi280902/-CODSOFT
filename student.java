package studentgradecalculator;
import java.util.Scanner;
public class student {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Student Grade Calculator");
		System.out.println("Enter the number of subjects");
		int ns = sc.nextInt(); 
		int total = 0;
		for(int i=1;i<=ns;i++) {
			System.out.println("Enter the marks obtained in subject"+ (i)+":");
			int marks = sc.nextInt();
			total += marks; 
		}
		double avg = (double)total/ns;
		char Grade;
		if(avg>=90) {
			Grade = 'O';
		}
		else if(avg>=80) {
			Grade = 'A';
		}
		else if(avg >= 70) {
			Grade = 'B';
		}
		else if(avg >= 60) {
			Grade = 'C';
		}
		else if(avg >= 50) {
			Grade = 'D';
		}
		else if(avg >= 40) {
			Grade = 'C';
		}
		else {
			Grade = 'F';
		}
		System.out.println("Total marks obtained is: " + total);
		System.out.println("Total percentage ganied is: " + avg);
		System.out.println("Grade: " + Grade );
	}
	
}
