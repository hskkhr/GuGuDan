
public class Gugudan {
	public static int[] calc(int first,int second) {
		int[] arr = new int[second];
		for(int i=0;i<arr.length;i++) {
			arr[i] = first * (i+1);
		}
		
		return arr;
	}

	
	public static void print(int[] result) {
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
}
