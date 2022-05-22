public class coisitas {
	
	public static void main(String[] args) {
		
	//variaveis
		byte um = 100; //de -128 a 127
		short dois = 1000; //de -32768 a 32767
		int tres = 10000; //de -2147483648 a 2147483647
		long quatro = 100000; //de -9223372036854775808 a 9223372036854775807
		float cinco = 33.456f; //7 numeros depois do ponto
		double seis = 899.123456; //15 numeros depois da virgula
		
	//convertento variaveis
		double aaa = 788.99;
		int bbb = (int) aaa;
		System.out.println(aaa);
	
	//string
		String oioi = "VACAVACA";
		System.out.println(oioi.length()); //conta caracteres
		
		String cc = "Comi Queijo";
		System.out.println(cc.toLowerCase()); //"comi queijo"
		System.out.println(cc.toUpperCase()); //"COMI QUEIJO"
		
		String dd = "oh oh you dont know you're beautiful";
		System.out.println(dd.indexOf("dont")); //localiza um caracter
		
		String primNome = "Louis";
		String segNome = "Tomlinson";
		String nomeComplet = primNome+" "+segNome;
		System.out.println(nomeComplet);
		System.out.println(primNome.concat(segNome));
		
		//math
		System.out.println(Math.min(dois, seis)); //menos numero
		int riz = 16;
		System.out.println(Math.sqrt(riz)); //raiz quadrada
		int random = (int)(Math.random()*800); //numero aleatorio
	}
}
