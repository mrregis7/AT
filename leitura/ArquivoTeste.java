package leitura;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import excecao.ImpostoInvalidoException;
import excecao.QuantidadeInvalidaException;
import excecao.TipoInvalidoException;
import modelo.Tabuleiro;
import modelo.Eletronico;
import modelo.Card;


public class ArquivoTeste {

	public static void main(String[] args) throws Exception {
		
		String dir = "C:/dev/workspace20E4/App/src/";
		String arq = "pedidos.txt";

		try {
			FileReader leitura = new FileReader(dir+arq);			
			BufferedReader in = new BufferedReader(leitura);
			
			FileWriter escrita = new FileWriter(dir+"out_"+arq);			
			BufferedWriter out = new BufferedWriter(escrita);

			String linha = in.readLine();
			

			
			while(linha != null) {
				
				String[] campos = linha.split(";");
				
				switch (campos[0].toUpperCase()) {
				case "E":
					//Regra geral pra todas as filhas
					Eletronico eletronico = new Eletronico(campos[1], Float.valueOf(campos[2]), Boolean.valueOf(campos[3]));
					//
					eletronico.setImpostoInternacional(Float.valueOf(campos[4]));
					eletronico.setMarca(campos[5]);
					

					out.write(eletronico.obterValorPorProduto());
					break;

				case "T":
					//Regra geral pra todas as filhas
					Tabuleiro tabuleiro = new Tabuleiro(campos[1], Float.valueOf(campos[2]), Boolean.valueOf(campos[3]));
					//
					tabuleiro.setAdulto(Boolean.valueOf(campos[4]));
					tabuleiro.setTipo(campos[5]);
				
					out.write(tabuleiro.obterValorPorProduto());
					break;
				
				
				case "C":
					//Regra geral pra todas as filhas
					Card card = new Card(campos[1], Float.valueOf(campos[2]), Boolean.valueOf(campos[3]));
					//
					card.setOnline(Boolean.valueOf(campos[4]));
					card.setQuantidade(campos[5]);
					
					out.write(card.obterValorPorProduto());
					
					break;
				}


				linha = in.readLine();
			}
			
			
			in.close();
			leitura.close();
			
			out.close();
			escrita.close();
			
			System.out.println("Migração dos produtos realizada com sucesso.");
			
		} catch (IOException | ImpostoInvalidoException | QuantidadeInvalidaException | TipoInvalidoException e) {
			System.out.println(e.getMessage());
		}
	}
}