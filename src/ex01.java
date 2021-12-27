import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("구구단 중 출력할 단은? : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("number : " + num);
		
		//조건문
		if(num>=2 && num<=9) {
			for(int i=1;i<10;i++) {
				int result = num * i;
				System.out.println(num + "*" + i + " = " + result);
			}
		}
		else {
			System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
		}
		
		sc.close();

	}

}
