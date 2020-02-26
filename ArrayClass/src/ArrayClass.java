import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		 int intArr[] = { 10,56, 20, 15, 35 };
		 System.out.println(Arrays.asList(intArr));
		 System.out.println(Arrays.binarySearch(intArr, 15));
		 System.out.println(Arrays.binarySearch(intArr,0,4,35));
		 int intArr1[] = { 10,15,22};
		 System.out.println(Arrays.compare(intArr, intArr1));
		 
		 System.out.println(Arrays.toString(intArr));
		 int arr[] = Arrays.copyOf(intArr, 2);
		 System.out.println(Arrays.toString(arr));
		 
		 int arr1[] = Arrays.copyOfRange(intArr,0,3);
//		 Arrays.fill(arr1, 3);
		 System.out.println(Arrays.toString(arr1));
		 
		 Arrays.sort(arr1);
		 System.out.println(Arrays.toString(arr1));
		 
		 String arStr = Arrays.toString(arr1);
		 String [] splitStr = arStr.replace("[", "").replace("]", "").split(", ");
		 for(int i=0;i<splitStr.length;i++) {
			 System.out.println(splitStr[i]);
		 }

		 
	}

}
