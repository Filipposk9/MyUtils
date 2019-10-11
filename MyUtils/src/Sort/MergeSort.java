package Sort;

public class MergeSort {
	
	public static void sort(int[] array, int first, int last){
		if (first==last) return;
		int mid = (first+last)/2;
		sort(array, first, mid);
		sort(array, mid+1, last);
		merge(array, first, last, mid);
	}
	
	private static void merge(int[] array, int first, int last, int mid){
		int n = last-first+1;
		int[] b = new int[n];
		
		int i1 = first, i2=mid+1;
		int j = 0;
		
		while (i1<=mid && i2<=last){
			if (array[i1] < array[i2]){
				b[j] = array[i1];
				i1++;
			}
			else{
				b[j] = array[i2];
				i2++;
			}
			j++;
		}
		while (i1<=mid){
			b[j] = array[i1];
			i1++;
			j++;
		}
		while (i2<=last){
			b[j] = array[i2];
			i2++;
			j++;
		}
		for (j=0; j<n; j++)
			array[first+j] = b[j];
	}

}
