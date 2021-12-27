
public class Gugudan {
	public static int[] calc(int number) {
		int[] arr = new int[9];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = number * (i+1);
		}
		
		return arr;
	}
	
	public static void print(int[] result) {
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
}
