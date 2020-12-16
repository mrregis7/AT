package modelo;

import excecao.QuantidadeInvalidaException;

//Classe Filha
public class Card extends Jogo {
	
	private int quantidade;
	private boolean online;
	
	public Card(String descricao, float valor, boolean primeiraMao) {
		super(descricao, valor, primeiraMao);
	}

	@Override
	public float calcularValorVenda() {
		return (this.isPrimeiraMao() ? this.getValor() : this.getValor()/2) + (this.getValor() * this.getQuantidade());
		
	}
	

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(this.getQuantidade());
		sb.append(";");
		sb.append(this.isOnline());
		sb.append(";");
		
		return sb.toString();
		
	}
	
	//Getters
	public int getQuantidade() {
		return quantidade;
	}


	public boolean isOnline() {
		return online;
	}

	public void setOnline(Boolean valueOf) {
		this.online = online;
	}

	public void setQuantidade(String string) throws QuantidadeInvalidaException{
		
		if(quantidade <=0 && quantidade >= 10) {
			throw new QuantidadeInvalidaException("Por��o inv�lida");
		}
	}


	
}