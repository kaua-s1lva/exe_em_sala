public class MagiaDecorator extends PersonagemDecorator {
    private int segundos;

    public MagiaDecorator(Componente elementoDecorado, String nome, double valor, int segundos) {
        super(elementoDecorado);
        this.segundos = segundos;
        definirItem(nome, valor);
    }

    @Override
    public void definirItem(String nome, double valor) {
        if (segundos > 30) {
            throw new RuntimeException("Não é possível aplicar um tempo maior do que 30 segundos de duração");
        }
        elementoDecorado.definirItem(nome, valor);
    }

    @Override
    public String toString() {
        return elementoDecorado.toString();
    }
}
