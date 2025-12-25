public class Main {
    public static void main(String[] args) {

        Cinema cinema = new Cinema(5);

        cinema.addFilm(new Film("Avatar", 180));
        cinema.addFilm(new Film("Titanic", 195));
        cinema.addFilm(new Film("Up", 96));

        Viewer viewer = new Viewer("Ali", 20);
        viewer.printInfo();

        System.out.println("\nAll films:");
        cinema.showAllFilms();

        System.out.println("\nFilms longer than 150 minutes:");
        cinema.showLongFilms(150);

        System.out.println("\nSearch film:");
        cinema.findFilm("Avatar");
    }
}