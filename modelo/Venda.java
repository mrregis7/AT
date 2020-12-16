package modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//Classe Principal

public class Venda {
	private LocalDateTime data;
	private boolean web;
	private Usuario usuario;


//Nesta classe vamos precisar de tr�s atributos: um precisa ser do tipo LocalDateTime, outro precisa ser o relacionamento com a classe de associa��o e um outro qualquer.

	public Venda() {
		this.data = LocalDateTime.now();
		this.web =  Boolean.TRUE;
	}

//Num construtor padr�o, vamos iniciar o campo do tipo LocalDateTime com a data/hora de hoje e vamos definir um valor inicial para o outro atributo
//Vai para arquivo por isso string
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
				
		return String.format("%s","%s","%s",
				this.getData().format(formatter),
				this.isWeb(),
				this.usuario.toString()
				);
	}
	
	

//Apenas o campo de data n�o ter� o m�todo "set"; o campo de relacionamento com a classe de associa��o e outro campo ter�o getters/setters.

		public LocalDateTime getData() {
			return data;
		}
	
	
		public boolean isWeb() {
			return web;
		}
	
	
		public Usuario getSolicitante() {
			return usuario;
		}
	
}

	
	