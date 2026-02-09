package Week2.Day1;

public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//calculate and print fibonacci Series
		int n=8; //number of terms to generate
		int firstterm=0; int secondterm=1;
		System.out.println("Fibonacci Series upto " + n + " terms:");
		for (int i=0; i<n; i++) {
		System.out.println(firstterm + ""); //prints the current term
int nextterm = firstterm + secondterm; //next term calculation
firstterm=secondterm;
secondterm=nextterm;
		}
	}
}
