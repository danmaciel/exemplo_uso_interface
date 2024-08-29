package br.com.mac.teste_interface.model;

import br.com.mac.teste_interface.interfaces.AparelhoTelefonico;
import br.com.mac.teste_interface.interfaces.NavegadorInternet;
import br.com.mac.teste_interface.interfaces.ReprodutorMusical;

public class Celular implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Pagina");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando Aba");
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo Pagina: " + url);
	}

	@Override
	public void atender() {
		System.out.println("Atendendo Ligacao ");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Liganndo para o numero: " + numero);
	}

	@Override
	public void tocar() {
		System.out.println("Tocando a musica");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando a musica");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecinou a musica: " + musica);
	}

}
