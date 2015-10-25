class Sorting {
	int [] array;
	int SIZE;

	public Sorting (int size){
		this.SIZE = size;
		this.array = new int [size]; 
	}



	public void getValue (int index , int value){

		this.array [index] = value;
	}


	public void bubbleSort () {
		int temp;
		for (int a=0; a<(SIZE-1); a++){
			for (int b = 0; b< (SIZE-1); b++){
				if (this.array [b] > this.array[b+1]){
					temp = this.array[b];
					this.array[b] = this.array[b+1];
					this.array[b+1] = temp;
				}
			}
		}
	}


	public void display () {

		for (int a = 0; a <SIZE; a++){
			System.out.println (array[a] + " ");
		}
	}

}