import java.util.Scanner;

public class AverageGrade {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("your maths marks = ");
	        int maths = sc.nextInt();
	        System.out.print("your physics marks = ");
	        int physics = sc.nextInt();
	        System.out.print("your chemistry98 marks = ");
	        int chemistry = sc.nextInt();

	        int avg = (maths + physics + chemistry) / 3;
	        System.out.println("your avg is = " + avg);
	        
	        if (avg >= 90) {
	            System.out.println("Grade A");
	        } else if (avg >= 80 && avg < 90) {
	            System.out.println("Grade B");
	        } else if (avg >= 60 && avg < 80) {
	            System.out.println("Grade C");
	        } else if (avg >= 33 && avg < 60) {
	            System.out.println("Grade D");
	        } else {
	            System.out.println("Fail");
	        }
	    }
	}

