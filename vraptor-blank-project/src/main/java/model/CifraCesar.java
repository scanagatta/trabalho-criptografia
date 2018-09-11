package model;

import java.util.HashMap;
import java.util.Map;

public class CifraCesar {
	@SuppressWarnings("serial")
	private static Map<Character, Character> codificador = new HashMap<Character, Character>() {
		{
			put('A', 'D');
			put('B', 'E');
			put('C', 'F');
			put('D', 'G');
			put('E', 'H');
			put('F', 'I');
			put('G', 'J');
			put('H', 'K');
			put('I', 'L');
			put('J', 'M');
			put('K', 'N');
			put('L', 'O');
			put('M', 'P');
			put('N', 'Q');
			put('O', 'R');
			put('P', 'S');
			put('Q', 'T');
			put('R', 'U');
			put('S', 'V');
			put('T', 'X');
			put('U', 'W');
			put('V', 'Y');
			put('X', 'Z');
			put('W', 'A');
			put('Y', 'B');
			put('Z', 'C');
			put(' ', ' ');
			put('1', '1');
			put('2', '2');
			put('3', '3');
			put('4', '4');
			put('5', '5');
			put('6', '6');
			put('7', '7');
			put('8', '8');
			put('9', '9');
			put('0', '0');
			put(',', ',');
			put('.', '.');
			put('!', '!');
			put('-', '-');
		}
	};
	
	@SuppressWarnings("serial")
	private static Map<Character, Character> decodificador = new HashMap<Character, Character>() {
		{
			put('D', 'A');
			put('E', 'B');
			put('F', 'C');
			put('G', 'D');
			put('H', 'E');
			put('I', 'F');
			put('J', 'G');
			put('K', 'H');
			put('L', 'I');
			put('M', 'J');
			put('N', 'K');
			put('O', 'L');
			put('P', 'M');
			put('Q', 'N');
			put('R', 'O');
			put('S', 'P');
			put('T', 'Q');
			put('U', 'R');
			put('V', 'S');
			put('X', 'T');
			put('W', 'U');
			put('Y', 'V');
			put('Z', 'X');
			put('A', 'W');
			put('B', 'Y');
			put('C', 'Z');
			put(' ', ' ');
			put('1', '1');
			put('2', '2');
			put('3', '3');
			put('4', '4');
			put('5', '5');
			put('6', '6');
			put('7', '7');
			put('8', '8');
			put('9', '9');
			put('0', '0');
			put(',', ',');
			put('.', '.');
			put('!', '!');
			put('-', '-');
		}
	};

	public String cifrarCesar(String texto) {
		String textoMaiusculo = texto.toUpperCase();
		String cifrado = "";
		for(int i=0; i<textoMaiusculo.length(); i++) {
			cifrado = cifrado + codificador.get(textoMaiusculo.charAt(i));
		}
		return cifrado;
	}
	
	public String descifrarCesar(String texto) {
		String textoMaiusculo = texto.toUpperCase();
		String descifrado = "";
		for(int i=0; i<textoMaiusculo.length(); i++) {
			descifrado = descifrado + decodificador.get(textoMaiusculo.charAt(i));
		}
		return descifrado;
	}
}
