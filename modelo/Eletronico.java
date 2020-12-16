package modelo;

import excecao.ImpostoInvalidoException;

//Classe Filha
public class Eletronico extends Jogo {
	private float impostoInternacional;
	private String marca;

	//Construtor da m�e
	public Eletronico(String descricao, float valor, boolean primeiraMao) {
		super(descricao, valor, primeiraMao);
	}
	
	//StringBuilder
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.getImpostoInternacional());
		sb.append(";");
		sb.append(this.getMarca());
		return sb.toString();
		
	}
	
	
	//M�todo da m�e
	//No m�todo abstrato, crie uma regra de neg�cio que utilize atributos da filha e da m�e.
	@Override
	public float calcularValorVenda() { 
		
		float produtoImportado = 0;
		if(this.isPrimeiraMao()) {
			produtoImportado = 0.2f;
		}
		
		
		return this.getValor() * produtoImportado  + this.getImpostoInternacional();
	}
	

	//Getters
	//Exce��o
	public float getImpostoInternacional() {
		return impostoInternacional;
	}
	
	public void setImpostoInternacional(float ImpostoInternacional) throws ImpostoInvalidoException {
		
		if(impostoInternacional >= 0.2) {
			throw new ImpostoInvalidoException("Muito caro, ser� necess�rio negociar o pre�o com o fornecedor!");
		}
		
		this.impostoInternacional = impostoInternacional;
	}

	public String getMarca() {
		return marca;
	}
	


	public void setMarca(String string) {		
	}




}
