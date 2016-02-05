package view;

import javax.swing.JOptionPane;

public class ManipString {

	public static void main(String[] args) {
		String entrada = JOptionPane.showInputDialog(null, "Digite uma data (dd/MM/YYYY)");
		char[] vetEntrada = entrada.toCharArray();
		int contaBarras = 0;
		System.out.println("O valor digitado foi:");
		for (char c : vetEntrada){
			System.out.print(c);
			if (c == '/'){
				contaBarras++;
			}
		}
		if (entrada.contains("/")){
			System.out.println("\r\nA data quebrada:");
			if (contaBarras == 2 && entrada.length() == 10){
				String[] splitEntrada = entrada.split("/");
				for (String s : splitEntrada){
					System.out.println(s);
				}
			}
		}
	}
	
}
