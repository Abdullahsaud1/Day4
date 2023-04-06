import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner A=new Scanner(System.in);
		System.out.println("Enter numbers : ");
		int[] numbers = {1,2,3,4,5,6,7,66,55,44,88,99,22,43,11,76,54,99,0};
		int check =A.nextInt();
		for(int n : numbers ) {
			if(n  ==check) {
				System.out.println(n + " The number is here ");
				
				
				break;
			
			}
		}
		

	}

}
