public class coisitas {
	
	public static void main(String[] args) {
		
		//do
		int a = 0;
		while (a <= 5) {
			System.out.println(a);
			a++;
		}
		
		//do-while
		int b = 0;
		do {
			System.out.println(b);
			b++;
		} while (b <= 5);
		
		//for 
		for (int c = 0; c <= 5; c++) {
			System.out.println(c);
			
		//o 1 é executado antes do bloco
		//o 2 é a condição pro bloco ser executado
		//o 3 é executado todas as vezes após o bloco
		}

		//for-each (para arrays)
		String[] fruits = {"watermelon", "kiwi", "strawberry", "cherry", "grape"};
		for (String f : fruits) {
			System.out.println(f);
		}
	}
}
