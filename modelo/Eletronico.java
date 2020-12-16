package modelo;

import excecao.ImpostoInvalidoException;

//Classe Filha
public class Eletronico extends Jogo {
	private float impostoInternacional;
	private String marca;

	//Construtor da mãe
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
	
	
	//Método da mãe
	//No método abstrato, crie uma regra de negócio que utilize atributos da filha e da mãe.
	@Override
	public float calcularValorVenda() { 
		
		float produtoImportado = 0;
		if(this.isPrimeiraMao()) {
			produtoImportado = 35;
		}
		
		
		return this.getValor() + (this.getValor() * this.getImpostoInternacional()) + produtoImportado;
	}
	

	//Getters
	//Exceção

	public float getImpostoInternacional() {
		return impostoInternacional;
	}
	
	public void setImpostoInternacional(float impostoInternacional) throws ImpostoInvalidoException {
		
		if(impostoInternacional > 0.21) {
			throw new ImpostoInvalidoException("Muito caro, será necessário negociar o preço com o fornecedor!");
		}
		
		this.impostoInternacional = impostoInternacional;
	}


	
	public String getMarca() {
		return marca;
	}
	


	public void setMarca(String string) {		
	}


}
