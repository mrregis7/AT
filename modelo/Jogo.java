package modelo;


//Classe m�e

//N�o vou instancia-la ent�o abstract; cada m�todo abstract vai obrigar que a filha implemente o m�todo e n�o a m�e.

public abstract class Jogo {
	private String descricao;
	private float valor;
	private boolean primeiraMao;
	
	public Jogo(String descricao, float valor, boolean producaoPropria) {
		this.descricao = descricao;
		this.valor = valor;
		this.primeiraMao = primeiraMao;
	}

	
	//Crie um m�todo abstrato que retorne alguma informa��o (retorno diferente de void)
	public abstract float calcularValorVenda();
	
	
	//M�todo que trar� a sa�da em arquivo dos inputs realizados em ArquivoTeste
	public String obterValorPorProduto() {
			//StringBuilder
			StringBuilder sb = new StringBuilder();
			sb.append(this.getDescricao());
			sb.append(";");
			sb.append(this.calcularValorVenda());
			sb.append("\r");
			return sb.toString();
			
	}
	
	
	//Vamos implementar o toString colocando todos os campos separados por ";". Use o StringBuilder para realizar esta implementa��o.
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
