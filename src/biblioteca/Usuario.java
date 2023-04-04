package biblioteca;

public class Usuario {
	
	public String nome;
	public int[] livrosRetirados;
	
	public Usuario(String nome) {
		
		this.nome = nome;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
