public class Principal4 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.modelo = "Ford Mustang";
        carro.cor = "Preto";
        carro.ano = 2020;

        carro.fichaTecnica();
        int idadeDoCarro = carro.calculaIdadeDoCarro();
        System.out.println("Idade do carro: " + idadeDoCarro);
    }
}
