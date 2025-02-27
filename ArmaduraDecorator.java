public class ArmaduraDecorator extends PersonagemDecorator {
    public ArmaduraDecorator(Componente elementoDecorado, String nome, double valor) {
        super(elementoDecorado);
        definirItem(nome, valor);
    }

    @Override
    public void definirItem(String nome, double valor) {
        elementoDecorado.definirItem(nome, valor);
    }

    @Override
    public String toString() {
        return elementoDecorado.toString();
    }
}
