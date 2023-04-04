package biblioteca;

public class Livro {
	
	public int numero;
	public String titulo;
	public String autor;
	public int ano;
	public boolean disponivel = true;
	public Usuario emprestadoPara;

	public Livro( int numero, String titulo, String autor, int ano, boolean disponivel) {
	
		this.numero = numero;
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.disponivel = disponivel;
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public void imprimirDados() {
		//system.out.println - Número: 00002
		//- Título: Admiravel Mundo Novo
		//- Autor: Adous Huxley
		//- Ano: 1940
		//- Status: Disponível
		//- Emprestado para:
		
	}
	
	
//	@Override
	//public String toString() {
		//return "Menu 
	//}
	
}
