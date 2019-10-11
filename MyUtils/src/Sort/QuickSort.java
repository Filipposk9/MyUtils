package Sort;

public class QuickSort {
	
	private static int sort(int[] array, int first, int last){
		int i = first, j = last;
	    int pivot = array[(first + last) / 2];

	      while (i <= j) {
	    	  
	          while (array[i] < pivot)
	                i++;
	          while (array[j] > pivot)
	                j--;
	          if (i <= j) {
	        	  swap(array,i,j);
	              i++;
	              j--;
	          }
	      }
	      return i;
	}
	
	public static void QSort(int[] array, int first, int last){
	      int index = sort(array, first, last);
	      if (first < index - 1)
	            QSort(array, first, index - 1);
	      if (index < last)
	            QSort(array, index, last);
	}
	
	private static void swap(int[] array, int from, int to){
		int temp = array[from];
		array[from] = array[to];
		array[to] = temp;
	}
}
