package TUGAS;

public class doublelinkedlistqueue {
    NodeVaksin18 head, tail;
    int size = 0;

    public void addLast(int number, String name) {
        NodeVaksin18 newNode = new NodeVaksin18(tail, number, name, null);
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null) {
            head = newNode;
        }
        size++;
    }

    public String removeFirst() {
        if (head == null) {
            return null;
        }
        String name = head.name;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        size--;
        return name;
    }

    public void printQueue() {
        NodeVaksin18 current = head;
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("Daftar Pengantri Vaksin");
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("|No.  |Nama                |");
        while (current != null) {
            System.out.printf("|%-5d|%-20s|\n", current.number, current.name);
            current = current.next;
        }
        System.out.println("Sisa Antrian: " + size);
    }

    public int getSize() {
        return size;
    }
}
