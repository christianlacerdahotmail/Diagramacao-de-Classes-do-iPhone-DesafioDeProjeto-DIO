package src.aparelho;

public class Main {

    public static void main(String[] args) {
        Aparelho aparelho = new Aparelho();

        System.out.println("********");
        aparelho.selecionarMusica("Seja o Centro");
        aparelho.tocar();
        aparelho.pausar();

        System.out.println("********");
        aparelho.atender();
        aparelho.iniciarCorreioVoz();
        aparelho.ligar(400201351);

        System.out.println("********");
        aparelho.exibirPagina();
        aparelho.atualizarPagina();
        aparelho.adicionarNovaAba();

        System.out.println("********");
    }
}
