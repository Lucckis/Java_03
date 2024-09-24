import java.util.ArrayList;
import java.util.Objects;

public class Midia {
    private String titulo;
    private double duração;
    private String metodoReproduzir;
    private ArrayList<Playlist> playlists = new ArrayList<>();

    public Midia() {
    }

    public Midia(String titulo, double duração, String metodoReproduzir, ArrayList<Playlist> playlists) {
        this.titulo = titulo;
        this.duração = duração;
        this.metodoReproduzir = metodoReproduzir;
        this.playlists = playlists;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuração() {
        return duração;
    }

    public void setDuração(double duração) {
        this.duração = duração;
    }

    public String getMetodoReproduzir() {
        return metodoReproduzir;
    }

    public void setMetodoReproduzir(String metodoReproduzir) {
        this.metodoReproduzir = metodoReproduzir;
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Midia midia = (Midia) o;
        return Double.compare(duração, midia.duração) == 0 && Objects.equals(titulo, midia.titulo) && Objects.equals(metodoReproduzir, midia.metodoReproduzir) && Objects.equals(playlists, midia.playlists);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, duração, metodoReproduzir, playlists);
    }

    @Override
    public String toString() {
        return "Midia{" +
                "titulo='" + titulo + '\'' +
                ", duração=" + duração +
                ", metodoReproduzir='" + metodoReproduzir + '\'' +
                ", playlists=" + playlists +
                '}';
    }
}
