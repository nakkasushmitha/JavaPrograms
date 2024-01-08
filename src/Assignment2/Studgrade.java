import java.util.Scanner;

public class Studgrade {
	public static void  main(String args[]) {
		int score;
		System.out.println("Enter the score");
		Scanner scan = new Scanner(System.in);
		score = scan.nextInt();
		
		if(score >= 90) {
			System.out.println("Student got A grade");
		}
		else if(score >= 80) {
			System.out.println("Student got B grade");
		}
		else if(score >= 70) {
			System.out.println("Student got C grade");
		}
		else if(score >= 60) {
			System.out.println("Student got D grade");
		}
		else {
			System.out.println("Student got F grade");
		}
		
	}

}
