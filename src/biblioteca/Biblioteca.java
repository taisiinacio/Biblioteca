package biblioteca;

import java.util.List;
import java.util.Scanner;

public class Biblioteca {
	public List<Livro> listaLivros;
	public List<Usuario> listausuarios;	
		
	
	public Biblioteca() {
		//Lista de livros, lista de usuarios, Menu,
	}
	
	public void cadastrarLivro() {
		System.out.println("cadastrarLivro");
	}
	public void retirarLivro() {
		System.out.println("retirarLivro");
		//imprime livro selecionado
		}
	public void menu() {
		Scanner teclado = new Scanner(System.in);
		int opcao = 0;
		
		
		 for(opcao = 0; opcao != 5;) {
			 
			 System.out.println("Menu:\n 1- Cadastrar Livro: \n 2- Retirar Livro: \n 3- Devolver Livros: \n 4- Doar Livros: 5-Sair: ");
			 System.out.println("Escolha sua opção: "); 
			 
			 opcao = teclado.nextInt();
			 
			 switch (opcao) {
			  case 1:
			   cadastrarLivro();
			    break;
			  case 2:
			    retirarLivro();
			    break;
			  case 3:
				devolverLivro();
				 break;
			  case 4:
				doarLivro();
				 break; 	 
			  case 5:
			  System.out.println("Sair");
			  teclado.close();
			  System.exit(0);
			  default:
			  System.out.println("Opcao invalida!");
			 }

		 }
	}
		
	public void devolverLivro() {
		System.out.println("devolverLivro");
		
	}
	public void doarLivro() {
		System.out.println("doarLivro");
		
	}

}
