package TUGAS;
import java.util.Scanner;
public class main {
    public static void main(String[] args) throws Exception {
        doublelinkedlist list = new doublelinkedlist();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("====================================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("====================================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Pada Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Pada Index Tertentu");
            System.out.println("7. Cetak Data");
            System.out.println("8. Cari Film");
            System.out.println("9. Keluar");
            System.out.println("====================================");
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan ID: ");
                    int id1 = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Masukkan Judul: ");
                    String judul1 = scanner.nextLine();
                    System.out.print("Masukkan Rating: ");
                    double rating1 = scanner.nextDouble();
                    list.addFirst(id1, judul1, rating1);
                    break;
                case 2:
                    System.out.print("Masukkan ID: ");
                    int id2 = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Masukkan Judul: ");
                    String judul2 = scanner.nextLine();
                    System.out.print("Masukkan Rating: ");
                    double rating2 = scanner.nextDouble();
                    list.addLast(id2, judul2, rating2);
                    break;
                case 3:
                    System.out.print("Masukkan ID: ");
                    int id3 = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Masukkan Judul: ");
                    String judul3 = scanner.nextLine();
                    System.out.print("Masukkan Rating: ");
                    double rating3 = scanner.nextDouble();
                    System.out.print("Masukkan Index: ");
                    int index = scanner.nextInt();
                    list.add(id3, judul3, rating3, index);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    System.out.print("Masukkan Index: ");
                    int removeIndex = scanner.nextInt();
                    list.remove(removeIndex);
                    break;
                case 7:
                    System.out.println("Cetak Data:");
                    list.print();
                    break;
                case 8:
                    System.out.print("Masukkan ID Film yang Dicari: ");
                    int searchId = scanner.nextInt();
                    list.search(searchId);
                    break;
                case 9:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 9);
        
        scanner.close();
    }
}

    
