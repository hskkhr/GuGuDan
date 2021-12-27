
public class ex03 {	
	//main
	public static void main(String[] args) {
		for(int i=2;i<10;i++) {
			System.out.println(i + "단");
			print(cal(i));
			System.out.println("");
		}
	}
	
	// 구구단 계산 메소드
	public static int[] cal(int num) {
		int[] arr = new int[9];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = num*(i+1);
		}
		
		return arr;
	}
	
	// 출력 메소드
	public static void print(int[] result) {
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]); 
		}
	}
}
