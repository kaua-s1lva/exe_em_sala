public abstract class PersonagemDecorator implements Componente{
    protected Componente elementoDecorado;

    public PersonagemDecorator(Componente elementoDecorado) {
        this.elementoDecorado = elementoDecorado;
    }
}
