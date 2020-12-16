package modelo;


//Classe mãe

//Não vou instancia-la então abstract; cada método abstract vai obrigar que a filha implemente o método e não a mãe.

public abstract class Jogo {
	private String descricao;
	private float valor;
	private boolean primeiraMao;
	
	public Jogo(String descricao, float valor, boolean producaoPropria) {
		this.descricao = descricao;
		this.valor = valor;
		this.primeiraMao = primeiraMao;
	}

	
	//Crie um método abstrato que retorne alguma informação (retorno diferente de void)
	public abstract float calcularValorVenda();
	
	
	//Método que trará a saída em arquivo dos inputs realizados em ArquivoTeste
	public String obterValorPorProduto() {
			//StringBuilder
			StringBuilder sb = new StringBuilder();
			sb.append(this.getDescricao());
			sb.append(";");
			sb.append(this.calcularValorVenda());
			sb.append("\r");
			return sb.toString();
			
	}
	
	
	//Vamos implementar o toString colocando todos os campos separados por ";". Use o StringBuilder para realizar esta implementação.
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append(this.getDescricao());
			sb.append(";");
			sb.append(this.getValor());
			sb.append(";");
			sb.append(this.isPrimeiraMao());
			
			return sb.toString();
			
		}

		
	public String getDescricao() {
		return descricao;
	}


	public float getValor() {
		return valor;
	}


	public boolean isPrimeiraMao() {
		return primeiraMao;
	}

	
	
	
	
}
