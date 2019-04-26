package view;

import model.Pessoa;

public class Execucao {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa ();
		pessoa.setNome("Leonardo Henschel");

		System.out.println(pessoa.getNome());
	
		pessoa.setEndereco("Avenida Itaquera");
		
		System.out.println(pessoa.getEndereco());
		
		pessoa.setBairro("Itaquera");
		
		System.out.println(pessoa.getBairro());
		
		pessoa.setCep(12134545);
		
		System.out.println(pessoa.getCep());
		
		pessoa.setCidade("São Paulo");
		
		System.out.println(pessoa.getCidade());
		
		pessoa.setEstado("São Paulo");
		
		System.out.println(pessoa.getEstado());
		
		
}

}