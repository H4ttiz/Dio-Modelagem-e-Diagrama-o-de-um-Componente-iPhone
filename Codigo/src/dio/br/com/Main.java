package dio.br.com;

import dio.br.com.dispositivo.iPhone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        iPhone meuIphone = new iPhone("iPhone X", 85);
        int opcao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Tocar música");
            System.out.println("2 - Pausar música");
            System.out.println("3 - Selecionar música");
            System.out.println("4 - Fazer ligação");
            System.out.println("5 - Atender chamada");
            System.out.println("6 - Iniciar correio de voz");
            System.out.println("7 - Navegar na internet");
            System.out.println("8 - Abrir nova aba");
            System.out.println("9 - Atualizar página");
            System.out.println("10 - Verificar bateria");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    meuIphone.tocar();
                    break;
                case 2:
                    meuIphone.pausar();
                    break;
                case 3:
                    System.out.print("Digite o nome da música: ");
                    String musica = scanner.nextLine();
                    meuIphone.selecionarMusica(musica);
                    break;
                case 4:
                    System.out.print("Digite o número para ligar: ");
                    String numero = scanner.nextLine();
                    meuIphone.ligar(numero);
                    break;
                case 5:
                    meuIphone.atender();
                    break;
                case 6:
                    meuIphone.iniciarCorreioVoz();
                    break;
                case 7:
                    System.out.print("Digite a URL: ");
                    String url = scanner.nextLine();
                    meuIphone.exibirPagina(url);
                    break;
                case 8:
                    meuIphone.adicionarNovaAba();
                    break;
                case 9:
                    meuIphone.atualizarPagina();
                    break;
                case 10:
                    meuIphone.verificarBateria();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
        scanner.close();
    }
}
