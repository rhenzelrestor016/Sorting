class TestApp {

	public static void main(String[] args) {
		Sorting s = new Sorting (3);


		s.getValue (0,4);
		s.getValue (1,3);
		s.getValue (2,1);

		System.out.println ("Values Of Array");
		s.display();

		s.bubbleSort();
		System.out.println ("Sorted Array Values");
		s.display();
	}
}