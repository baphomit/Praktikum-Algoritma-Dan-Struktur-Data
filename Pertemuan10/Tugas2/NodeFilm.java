package Tugas2;
public class NodeFilm {
    String judul, id;
    double rating;
    NodeFilm prev, next;

    NodeFilm(NodeFilm prev, String id, String judul, double rating, NodeFilm next) {
        this.prev = prev;
        this.next = next;
        this.id = id;
        this.judul = judul;
        this.rating = rating;
    }
}