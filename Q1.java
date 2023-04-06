
public class Q1 {

	public static void main(String[] args) {
		int[] number = {50,60,40,10,38,65,87,56,90,100,66,80,88,40,98};
		for(int n : number) {
			if (n>= 90) {
				System.out.println(n + "  The gread  A");
			} else  if ( n>=80){
				System.out.println(n + "  The gread B");
			}else if (n>= 70 ) {
				System.out.println(n + " The gread C");
			}else if (n>= 60 ) {
				System.out.println(n + "  The gread D");
			}else {
				System.out.println(n + "  The gread F");
			}
		}

	}

}
