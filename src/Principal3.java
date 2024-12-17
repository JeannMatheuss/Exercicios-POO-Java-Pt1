public class Principal3 {
    public static void main(String[] args) {
        Musica musica = new Musica();

        musica.titulo = "Die With a Smile";
        musica.artista = "Bruno Mars and Lady Gaga";
        musica.anoDeLancamento = 2024;

        // Exibe o método da ficha tecnica criada no arquivo Musica.java
        musica.fichaTecnica();

        // Notas para a soma, media e numeros de avaliações
        musica.avalia(10);
        musica.avalia(8);
        musica.avalia(7);

        // Print dos métodos
        System.out.println(musica.somaAvaliacoes);
        System.out.println(musica.numAvaliacoes);
        System.out.println(musica.mediaAvaliacoes());
    }
}
