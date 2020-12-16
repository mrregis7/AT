package modelo;

//Atributos
public class Usuario {
	private String nome;
	private String cpf;
	private String email;


	


//Construtores
	public Usuario (String nome, String cpf, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}
	
//toString
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getNome());
		sb.append(";");
		sb.append(this.getCpf());
		sb.append(";");
		sb.append(this.getEmail());
		
		return sb.toString();
		
	}

//Get
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	
	public String getEmail() {
		return email;
	}
	


	
}