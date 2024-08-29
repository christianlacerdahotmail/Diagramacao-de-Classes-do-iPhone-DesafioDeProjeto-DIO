public abstract class TelefoneAbstrata implements TelefoneInterface{

    @Override
    public void ligar(int numero) {
        System.out.println("Ligando para " + numero);
    }
    @Override
    public void atender() {
        System.out.println("Atendendo a ligação");
    }
    @Override
    public void inciarCorreioVoz() {
        System.out.println("Correio de voz");
    }
}
