package builder;

import model.Personagem;

public class Diretor {
    public static Personagem build(PersonagemBuilder builder) {
        builder.addClasse();
        builder.addItens();
        builder.addNivel();
        builder.addRaca();

        return builder.getPersonagem();
    } 
}
