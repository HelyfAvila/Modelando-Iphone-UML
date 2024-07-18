package iphone.equipamento;

import iphone.funcoes.ligacao.AparelhoTelefonico;
import iphone.funcoes.navegacao.NavegadorInternet;
import iphone.funcoes.reproducao.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical  {

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("TOCANDO MÚSICA NO IPHONE");
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("PAUSANDO MÚSICA NO IPHONE");
	}

	@Override
	public void selecionarMusica(String musica) {
		// TODO Auto-generated method stub
		System.out.println("MÚSICA SELECIONADA EM IPHONE: " + musica);
	}

	@Override
	public void exibirPagina(String novoSite) {
		// TODO Auto-generated method stub
		System.out.println("EXIBINDO PÁGINA NO IPHONE");
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("ADICIONANDO PÁGINA NO IPHONE");
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("ATUALIZANDO PÁGINA NO IPHONE");
	}

	@Override
	public void ligar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("LIGANDO DO IPHONE PARA O NÚMERO: " + numero);
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("AROU");
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		System.out.println("O número chamado não pode atender no momento, por favor, deixe seu recado após o bip.");
	}

	
}
