package model;
/**
*
* @author Iury C Lansarin
*/
public class CifraTransposicao {
	
	public String cifraTransposicao(String texto1, String chave) {
		
		Double qtdTexto = (double) texto1.length();
		Double qtdChave = (double) chave.length();
		Double qtdLinha = qtdTexto / qtdChave;
		int qtdLinhaInt = 0;
		int valorInteiroTexto = texto1.length() / chave.length();
		if(qtdLinha > valorInteiroTexto){
			qtdLinhaInt = valorInteiroTexto + 1;
		}
		
		String[][] tabela = new String[qtdLinhaInt][chave.length()];
		String texto2 = "";
		int qtdCasas = qtdLinhaInt * chave.length();
		int a = 0;
		String letra;
		for (int i = 0; i < qtdLinhaInt; i++) {
			for (int j = 0; j < chave.length(); j++) {
				
				if(a < qtdCasas){
					if(a < texto1.length()){
					
					letra = String.valueOf(texto1.charAt(a));
					tabela[i][j] = letra;
					} else {
						tabela[i][j] = " ";
					}
				}
				a++;
			}
		}
		
		int b = 0;
		
		
		
		for (int i = 0; i < chave.length(); i++) {
			for (int j = 0; j < qtdLinhaInt; j++) {
				if(tabela[j][i] != null){	
					if(b < qtdCasas){
						texto2 = texto2 + tabela[j][i];
					}
					b++;
				} else {
					texto2 = " ";
					b++;
				}
			}
		}
	
		return texto2;
		
	}
	
	public String descifrarTransposicao(String texto2, String chave){
		
		int valorInteiroTexto = texto2.length() / chave.length();

		
		String[][] tabela = new String[chave.length()][valorInteiroTexto];
		String texto1 = "";
		
		int a = 0;
		String letra;
		for (int i = 0; i < chave.length(); i++) {
			for (int j = 0; j < valorInteiroTexto; j++) {
					if(a < texto2.length()){
						letra = String.valueOf(texto2.charAt(a));
						tabela[i][j] = letra;
					}
					a++;
				
			}
		}
	
		
		int b = 0;
		for (int i = 0; i < valorInteiroTexto; i++) {
			for (int j = 0; j < chave.length(); j++) {
					texto1 = texto1 + tabela[j][i];
					b++;
			}
		}
		
		
		
		
		return texto1;
		
	
	
	
	}
	
	

}
