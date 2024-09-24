
public class Main {
    public static void main(String[] args) {

        var musica1 = new Musicas();
        musica1.setTitulo("Through the fire and flames");
        musica1.setDuração(7);
        musica1.setMetodoReproduzir("Audio");
        musica1.setGenero("Instrumental");
        musica1.setArtista("DragonForce");

        var podcast1 = new PodCast();
        podcast1.setTitulo("Podcast do seu zé");
        podcast1.setNomePodcast("Conversando com seu zé");
        podcast1.setApresentador("Seu Zé");
        podcast1.setDuração(65);
        podcast1.setDescricaoEpisodio("Hoje iremos descobrir um pouco sobre a carreira incrivel de seu zé");

        var favoritos = new Midia();
        favoritos.setTitulo("Favoritos");
        favoritos.setDuração(72);
        favoritos.getPlaylists().add(new Playlist("Through the fire and flames", "DragonForce"));
        favoritos.getPlaylists().add(new Playlist("Podcast do seu zé", "Seu Zé"));

        System.out.println(musica1);
        System.out.println(podcast1);
        System.out.println(favoritos);

    }
}