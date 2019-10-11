package Search;

public class LinearSearch {
	
	public static int search(int[] array, int key){
		for (int i = 0; i<array.length; i++){
			if (array[i] == key)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args){
		int[] numbers = {5,8,3,7,63,55};
		
		System.out.println("63 is at index: " + search(numbers, 63));
	}
}
