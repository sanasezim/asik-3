public class Cinema {
    private Film[] films;
    private int size;

    public Cinema(int maxSize) {
        films = new Film[maxSize];
        size = 0;
    }

    public void addFilm(Film film) {
        films[size] = film;
        size++;
    }

    public void showAllFilms() {
        for (int i = 0; i < size; i++) {
            System.out.println(films[i]);
        }
    }

    public void showLongFilms(int minDuration) {
        for (int i = 0; i < size; i++) {
            if (films[i].getDuration() > minDuration) {
                System.out.println(films[i]);
            }
        }
    }

    public void findFilm(String title) {
        for (int i = 0; i < size; i++) {
            if (films[i].getTitle().equals(title)) {
                System.out.println("Found: " + films[i]);
                return;
            }
        }
        System.out.println("Film not found");
    }
}
