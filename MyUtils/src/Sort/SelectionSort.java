package Sort;

public class SelectionSort {
	
	public static void sort(int[] array){
		int min, temp;
		for (int i = 0; i<array.length-1; i++){
			min = i;
			for (int j = (i+1); j<array.length; j++){
				if (array[j]<array[min])
					min = array[j];
			}
			temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
	}

}
