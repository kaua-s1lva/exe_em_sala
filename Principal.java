public class Principal {
    public static void main(String[] args) {
        Componente mago = new Personagem("filosofico");

        mago = new ArmaduraDecorator(mago, "bronze", 250.0);
        mago = new MagiaDecorator(mago, "mana", 200.0, 10);
        System.out.println(mago);
    }
}
