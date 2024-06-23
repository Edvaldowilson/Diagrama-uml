public class iPhone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public iPhone() {
        reprodutorMusical = new ReprodutorMusical();
        aparelhoTelefonico = new AparelhoTelefonico();
        navegadorInternet = new NavegadorInternet();
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public AparelhoTelefonico getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }

    public NavegadorInternet getNavegadorInternet() {
        return navegadorInternet;
    }

    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();

        // Testando ReprodutorMusical
        meuIPhone.getReprodutorMusical().tocar();
        meuIPhone.getReprodutorMusical().pausar();
        meuIPhone.getReprodutorMusical().selecionarMusica("Marilia Mendonça");

        // Testando AparelhoTelefonico
        meuIPhone.getAparelhoTelefonico().ligar("123456789");
        meuIPhone.getAparelhoTelefonico().atender();
        meuIPhone.getAparelhoTelefonico().iniciarCorreioVoz();

        // Testando NavegadorInternet
        meuIPhone.getNavegadorInternet().exibirPagina("http://example.com");
        meuIPhone.getNavegadorInternet().adicionarNovaAba();
        meuIPhone.getNavegadorInternet().atualizarPagina();
    }
}
