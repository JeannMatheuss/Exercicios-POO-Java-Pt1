public class Carro {
    String modelo;
    int ano;
    String cor;


    void fichaTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    int calculaIdadeDoCarro(){
        return 2024 - ano;
    }
}
