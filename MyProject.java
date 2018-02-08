package myJava;

public class MyProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myList = new int[10];
		int[] result = new int[10];
		int temp;
		int randIndex;
		
		
		for(int i = 0; i < myList.length; i++) {
			myList[i] = i;
		}
		
		for(int i = 0; i <myList.length; i++) {
			randIndex = (int)(Math.random() * myList.length);
			temp = myList[0];
			myList[0] = myList[randIndex];
			myList[randIndex] = temp;
		}
		
		for(int i : myList) {
			System.out.printf("%d, " , i );
		}
		System.out.println();
		
		result = insertionSort(myList);
		for(int i : result) {
			System.out.printf("%d, " , i );
		}
	}
	
	public static int[] insertionSort(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			for(int j = i; j < array.length; j++) {
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			
		}
		return array;
		
	}
	
}








