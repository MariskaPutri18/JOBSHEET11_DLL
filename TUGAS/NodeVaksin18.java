package TUGAS;

public class NodeVaksin18 {
    String name;
    int number;
    NodeVaksin18 prev, next;

    public NodeVaksin18 (NodeVaksin18 prev, int number, String name, NodeVaksin18 next) {
        this.prev = prev;
        this.number = number;
        this.name = name;
        this.next = next;
    }
}

