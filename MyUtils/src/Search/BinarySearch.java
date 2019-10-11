package Search;

public class BinarySearch {
	
	public static int search(int[] array, int key){
		int position = -1;
		return search(array, key, 0, array.length-1, position);
	}
	
	public static int search(int[] array, int key, int left, int right, int position){
		int mid;
		while ((left<= right) && (position == -1)){
			mid = left/2 + right/2;
			if (key>array[mid])
				left = mid+1;
			else if (key<array[mid])
				right = mid-1;
			else
				position = mid;
		}
		return position;
	}
	
	public static int recursionSearch(int[] array, int key, int left, int right, int position){
		int mid = (left+right)/2;
		
		if (left>right)
			return position;
		if (array[mid]<key)
			return recursionSearch(array, key, mid+1, right, position);
		else if (array[mid]>key)
			return recursionSearch(array, key, left, mid-1, position);
		else
			position = mid;
		return position;
	}
}
