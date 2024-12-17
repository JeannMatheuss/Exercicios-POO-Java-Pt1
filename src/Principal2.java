public class Principal2 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int resultado1 = calculadora.multiplicaPorDois(2);
        int resultado2 = calculadora.multiplicaPorDois(8);

        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
    }
}
