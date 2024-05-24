package TUGAS;

public class doublelinkedlist {
    Node18 head;
    int size = 0;

    public doublelinkedlist(){
        head=null;
        size=0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst (int ID, String judul, Double rating){
        if (isEmpty()) {
            head = new Node18(null, ID, judul, rating, null);
        } else {
            Node18 newNode18 = new Node18(null, ID, judul, rating, head);
            head.prev = newNode18;
            head = newNode18;
        }
        size++;
    }

    public void addLast(int ID, String judul, Double rating){
        if (isEmpty()) {
            addFirst(ID, judul, rating);
        } else {
            Node18 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node18 newNode18 = new Node18(current, ID, judul, rating, null);
            current.next = newNode18;
            size++;
        }
    }

    public void add(int ID, String judul, double rating, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (isEmpty() || index == 0) {
            addFirst(ID, judul, rating);
        } else {
            Node18 current = head;
            int i = 0;
            while (i < index - 1) {
                current = current.next;
                i++;
            }
            Node18 newNode18 = new Node18(current, ID, judul, rating, current.next);
            if (current.next != null) {
                current.next.prev = newNode18;
            }
            current.next = newNode18;
            size++;
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
    public void removeLast() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!"); 
        } else if (head.next == null) {
            head = null;
            size --;
            return;
        }
        Node18 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
    
        if (index == 0) {
            removeFirst();
        } else {
            Node18 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
    
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current.next.prev = null;
                head = current.next;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }   
    }

        public void print() {
            if (!isEmpty()) {
                Node18 tmp = head;
                while (tmp != null) {
                    System.out.println("ID: " + tmp.ID + ", Judul: " + tmp.judul + ", Rating: " + tmp.rating);
                    tmp = tmp.next;
                }
            } else {
                System.out.println("Linked list kosong");
            }
        }
    
    
        public void search(int id) {
            Node18 current = head;
            while (current != null) {
                if (current.ID == id) {
                    System.out.println("Film ditemukan: ID: " + current.ID + ", Judul: " + current.judul + ", Rating: " + current.rating);
                    return;
                }
                current = current.next;
            }
            System.out.println("Film dengan ID " + id + " tidak ditemukan.");
        }
}


