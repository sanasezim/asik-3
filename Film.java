import java.util.Objects;

public class Film {
    private String title;
    private int duration;

    public Film(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return title + " - " + duration + " min";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Film)) return false;
        Film film = (Film) o;
        return duration == film.duration &&
                Objects.equals(title, film.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, duration);
    }
}