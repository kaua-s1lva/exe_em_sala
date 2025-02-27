package builder;

import model.Personagem;

public abstract class PersonagemBuilder {
    protected Personagem personagem;

    public PersonagemBuilder(String nome) {
        this.personagem = new Personagem(nome);
    }

    public abstract void addClasse();
    public abstract void addRaca();
    public abstract void addItens();

    public final void addNivel() {
        //singleton para calcular o nível
    }

    public final Personagem getPersonagem() {
        return personagem;
    }
}
