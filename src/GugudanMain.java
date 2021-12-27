
public class GugudanMain {

	public static void main(String[] args) {
		//Gugudan ggd = new Gugudan();
		
		for(int i=2;i<10;i++) {
			//ggd.print(ggd.calc(i));
			System.out.println(i + "단");
			Gugudan.print(Gugudan.calc(i));
			System.out.println("");
		}
	}

}
