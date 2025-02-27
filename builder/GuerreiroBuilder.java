package builder;

public class GuerreiroBuilder extends PersonagemBuilder {

    public GuerreiroBuilder(String nome) {
        super(nome);
    }
    
    @Override
    public void addClasse() {
        personagem.setClasse("guerreiro");
    }

    @Override
    public void addRaca() {
        personagem.setRaca("não sei");
    }

    @Override
    public void addItens() {
        personagem.definirItem("martelo", 300.0);
    }
}
