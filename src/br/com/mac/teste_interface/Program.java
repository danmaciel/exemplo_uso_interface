package br.com.mac.teste_interface;

import br.com.mac.teste_interface.model.Celular;

public class Program {
	public static void main(String[] args) {
		
		Celular iphone = new Celular();
		
		iphone.atender();
		iphone.exibirPagina("www.google.com");
		
		
		iphone.selecionarMusica("Sweet Child O' Mine 2");
	}
}
