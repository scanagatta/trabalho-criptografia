package model;

public class CifraCesar {

	public String cifrarCesar(Criptografia criptografia) {
		String textoMaiusculo = criptografia.getTexto1().toUpperCase();
		String textoCifrado = "";
		int chave = Integer.valueOf(criptografia.getChave());
		int aux;
		for (int i = 0; i < textoMaiusculo.length(); i++) {
			char algarismo = textoMaiusculo.charAt(i);
			aux = textoMaiusculo.charAt(i) + chave;
			if(Character.isLetter(algarismo)) {
				if(aux>90) {
					int caracterVolta = (textoMaiusculo.charAt(i)+chave)-26;
					textoCifrado = textoCifrado + (char)(caracterVolta);
				} else {
					textoCifrado = textoCifrado + (char)(textoMaiusculo.charAt(i) + chave);
				}
			} else {
				textoCifrado += textoMaiusculo.charAt(i); 
			}
		}
		return textoCifrado;
	}
	
	public String descifrarCesar(Criptografia criptografia) {
		String textoMaiusculo = criptografia.getTexto2().toUpperCase();
		String textoCifrado = "";
		int chave = Integer.valueOf(criptografia.getChave());
		int aux;
		for (int i = 0; i < textoMaiusculo.length(); i++) {
			char algarismo = textoMaiusculo.charAt(i);
			aux = textoMaiusculo.charAt(i) - chave;
			if(Character.isLetter(algarismo)) {
				if(aux<65) {
					int caracterVolta = (textoMaiusculo.charAt(i)-chave)+26;
					textoCifrado = textoCifrado + (char)(caracterVolta);
				} else {
					textoCifrado = textoCifrado + (char)(textoMaiusculo.charAt(i) - chave);
				}
			} else {
				textoCifrado += textoMaiusculo.charAt(i); 
			}
		}
		return textoCifrado;
	}
}
