import java.util.Scanner;
public class SelectionSortMain{


	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		final int SIZE = 8;
		int [] array = new int [SIZE];
		int numbers;

		SelectionSort ss = new SelectionSort();
		for (int a = 0; a<SIZE; a++) {
		System.out.print ("Enter an integer" + "["+a+"] : ");
		numbers = sc.nextInt();

			ss.selectionSort (numbers);
		}
	
	}
}