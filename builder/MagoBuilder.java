package builder;

public class MagoBuilder extends PersonagemBuilder {

    public MagoBuilder(String nome) {
        super(nome);
    }
    
    @Override
    public void addClasse() {
        personagem.setClasse("mago");
    }

    @Override
    public void addRaca() {
        personagem.setRaca("não sei");
    }

    @Override
    public void addItens() {
        personagem.definirItem("Cajado", 200.0);
    }
}
