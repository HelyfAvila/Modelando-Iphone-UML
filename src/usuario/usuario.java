package usuario;

import java.util.Locale;
import java.util.Scanner;

import iphone.equipamento.Iphone;

public class usuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iphone iphonePedro = new Iphone();
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Botões: 1- Música, 2- Telefone, 3- Google, 4- Atender ligação");
		String opcao = scanner.next();
		
		//consome linha pendente 
		scanner.nextLine();
		
		 switch (opcao) {
         case "1":
             executarMusica(scanner, iphonePedro);
             break;
         case "2":
             ligarTelefone(scanner, iphonePedro);
             break;
         case "3":
             navegarInternet(scanner, iphonePedro);
             break;
         case "4":
             atenderLigacao(scanner, iphonePedro);
             break;
         default:
             System.out.println("Opção inválida.");
     }
     
     scanner.close();
 }
 
 private static void executarMusica(Scanner scanner, Iphone iphone) {
     System.out.println("Nome da música desejada:");
     String musica = scanner.nextLine();
     iphone.selecionarMusica(musica);
     iphone.tocar();
     System.out.println("Deseja pausar? (s/n)");
     String pausar = scanner.nextLine();
     if (pausar.equalsIgnoreCase("s")) {
         iphone.pausar();
     }
 }
 
 private static void ligarTelefone(Scanner scanner, Iphone iphone) {
     System.out.println("Digite o número para o qual deseja ligar:");
     String numero = scanner.nextLine();
     iphone.ligar(numero);
 }
 
 private static void navegarInternet(Scanner scanner, Iphone iphone) {
     System.out.println("URL do site desejado:");
     String site = scanner.nextLine();
     iphone.exibirPagina(site);
     System.out.println("Deseja pesquisar outro site? (s/n)");
     String mudarSite = scanner.nextLine();
     if (mudarSite.equalsIgnoreCase("s")) {
         iphone.adicionarNovaAba();
         System.out.println("URL do novo site:");
         String novoSite = scanner.nextLine();
         iphone.exibirPagina(novoSite);
     }
     System.out.println("Deseja atualizar o site? (s/n)");
     String atualizarPagina = scanner.nextLine();
     if (atualizarPagina.equalsIgnoreCase("s")) {
         iphone.atualizarPagina();
     }
 }
 
 private static void atenderLigacao(Scanner scanner, Iphone iphone) {
     System.out.println("TELEFONE TOCANDO");
     System.out.println("DESEJA ATENDER? (s/n)");
     String atender = scanner.nextLine();
     if (atender.equalsIgnoreCase("s")) {
         iphone.atender();
     } else {
         iphone.iniciarCorreioVoz();
     }
 }

}
