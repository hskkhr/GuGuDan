import java.util.Scanner;

public class GugudanMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input_value = sc.nextLine();
		int len = input_value.length();
		
		//최종 요구사항1
		if(len==1) {
			int first = Integer.parseInt(input_value);
			
			for(int i=2;i<first+1;i++) {
				Gugudan.print(Gugudan.calc(i,first));
			}
			
		}
		//최종 요구사항2
		else {
			String[] splited_value = input_value.split(",");
			int first = Integer.parseInt(splited_value[0]);
			int second = Integer.parseInt(splited_value[1]);
			
			for(int i=2;i<first+1;i++) {
				Gugudan.print(Gugudan.calc(i,second));
			}

		}
		
		
		sc.close();
		
	}

}
