import java.util.Scanner;
public class SelectionSort {

	public static void selectionSort (int arr []) {

		int i,j,minIndex =-1,temp;
		int n= arr.length;


		for (i = 0; i<n -1; i++ ){

			minIndex = i;
			
			for (j=i +1; j <n; j++){
				if (arr[j] < arr [minIndex])
				{
					minIndex =j;
				}
			}
				if (minIndex != i){
					temp = arr [minIndex];
					arr[minIndex] = arr[i];
					arr[i]= temp;
				}
				
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		int number;
		System.out.print ("Enter number of integer elements : ");
		number = sc.nextInt ();

		int [] array = new int [number];
		for (int a = 0; a<number; a++) {
		System.out.print ("Enter an integer" + "["+(a+1)+"] : ");
		array [a] = sc.nextInt();

			selectionSort (array);
		}


		for (int x=0; x< number; x++){

			System.out.print (array[x] + " ");
		}
	
	}
}