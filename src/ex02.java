
public class ex02 {
	public static void main(String[] args) {
		int[] result = new int[9]; // 구구단 결과 저장용 배열
		
		for(int i=0;i<result.length;i++) {
			result[i] = 2 * (i+1);
		}
		
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
}
