package Sort;

public class BubbleSort {
	
	public static void sort(int[] array){
		boolean flag = true;
		for (int i = 1; i<array.length; i++){
			for (int j = 0; j<array.length-i; j++){
				if (array[j]>array[j+1]){
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
					flag = false;
				}
				if (flag) return;
			}
		}
	}
}
