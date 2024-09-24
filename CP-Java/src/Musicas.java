import java.util.ArrayList;
import java.util.Objects;

public class Musicas extends Midia{
    private String artista;
    private String album;
    private String genero;

    public Musicas() {
    }

    public Musicas(String artista, String album, String genero) {
        this.artista = artista;
        this.album = album;
        this.genero = genero;
    }

    public Musicas(String titulo, double duração, String metodoReproduzir, ArrayList<Playlist> playlists, String artista, String album, String genero) {
        super(titulo, duração, metodoReproduzir, playlists);
        this.artista = artista;
        this.album = album;
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Musicas musicas = (Musicas) o;
        return Objects.equals(artista, musicas.artista) && Objects.equals(album, musicas.album) && Objects.equals(genero, musicas.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), artista, album, genero);
    }
}
