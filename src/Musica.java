public class Musica {
    public String titulo;
    public String artista;
    public int anoDeLancamento;
    public double avaliacao;
    public double somaAvaliacoes;
    public int numAvaliacoes;

    void fichaTecnica(){
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    void avalia(double avaliacao){
        somaAvaliacoes += avaliacao;
        numAvaliacoes++;
    }

    double mediaAvaliacoes(){
        return somaAvaliacoes / numAvaliacoes;
    }
    
}
