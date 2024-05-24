package TUGAS;

public class Node18 {
    int ID;
    String judul;
    Double rating;
    Node18 prev,next;

    public Node18(Node18 prev, int ID, String judul, Double rating, Node18 next){
        this.prev=prev;
        this.ID = ID;
        this.judul = judul;
        this.rating = rating;
        this.next = next;

    }
}
