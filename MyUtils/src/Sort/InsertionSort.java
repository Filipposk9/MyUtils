package Sort;

public class InsertionSort {
	
	public static void sort(int[] array){
		for (int i = 1; i<array.length; i++){
			int key = array[i];
			int position = i;
			
			while (position>0 && array[position-1]>key){
				array[position] = array[position-1];
				position--;
			}
			array[position] = key;
			
		}
	}
}
