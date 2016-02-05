package view;

public class StrXSb {

	public static void main(String[] args) {
		long tempoInicialStr = System.currentTimeMillis();
		estouraString();
		long tempoFinalStr = System.currentTimeMillis();
		long duracaoStr = tempoFinalStr - tempoInicialStr;
		long tempoInicialSb = System.currentTimeMillis();
		estouraStringBuffer();
		long tempoFinalSb = System.currentTimeMillis();
		long duracaoSb = tempoFinalSb - tempoInicialSb;
		System.out.println("Concatenar String: "+duracaoStr+" mS");
		System.out.println("Concatenar StringBuffer: "+duracaoSb+" mS");
	}
	
	private static void estouraString(){
		String a = "";
		for (int i = 0 ; i < 32768 ; i++){
			a = a + "x";
		}
	}
	
	private static void estouraStringBuffer(){
		StringBuffer sb = new StringBuffer();
		for (int i = 0 ; i < 32768 ; i++){
			sb.append("x");
		}
	}
	
}
