package modelo;

import excecao.TipoInvalidoException;


//Classe Filha
public class Tabuleiro extends Jogo{
	
	private boolean adulto;
	private String tipo;

	public Tabuleiro(String descricao, float valor, boolean primeiraMao) {
		super(descricao, valor, primeiraMao);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.isAdulto());
		sb.append(";");
		sb.append(this.getTipo());
		
		return sb.toString();
	}
	
	
	
	@Override
	public float calcularValorVenda() {
		return (this.isPrimeiraMao() ? this.getValor() : this.getValor()/2) - (this.isAdulto() ? 10 : 5);
		//Promocao jogos de adulto

	}

	public boolean isAdulto() {
		return adulto;
	}

	public void setAdulto(boolean adulto) {
		this.adulto = adulto;
	}

	public String getTipo() {
		return tipo;
	}
	

	//exceção 2
	public void setTipo(String tipo) throws TipoInvalidoException {
		
		if(tipo == null) {
			throw new TipoInvalidoException("Tipo inválido.");
		}
		this.tipo = tipo;
	}



	
	
}
