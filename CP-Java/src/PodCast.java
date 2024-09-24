import java.util.ArrayList;
import java.util.Objects;

public class PodCast extends Midia{
    private String nomePodcast;
    private String apresentador;
    private String descricaoEpisodio;

    public PodCast() {
    }

    public PodCast(String nomePodcast, String apresentador, String descricaoEpisodio) {
        this.nomePodcast = nomePodcast;
        this.apresentador = apresentador;
        this.descricaoEpisodio = descricaoEpisodio;
    }

    public PodCast(String titulo, double duração, String metodoReproduzir, ArrayList<Playlist> playlists, String nomePodcast, String apresentador, String descricaoEpisodio) {
        super(titulo, duração, metodoReproduzir, playlists);
        this.nomePodcast = nomePodcast;
        this.apresentador = apresentador;
        this.descricaoEpisodio = descricaoEpisodio;
    }

    public String getNomePodcast() {
        return nomePodcast;
    }

    public void setNomePodcast(String nomePodcast) {
        this.nomePodcast = nomePodcast;
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricaoEpisodio() {
        return descricaoEpisodio;
    }

    public void setDescricaoEpisodio(String descricaoEpisodio) {
        this.descricaoEpisodio = descricaoEpisodio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PodCast podCast = (PodCast) o;
        return Objects.equals(nomePodcast, podCast.nomePodcast) && Objects.equals(apresentador, podCast.apresentador) && Objects.equals(descricaoEpisodio, podCast.descricaoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nomePodcast, apresentador, descricaoEpisodio);
    }
}
