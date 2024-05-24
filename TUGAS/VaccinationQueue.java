package TUGAS;
import java.util.Scanner;

public class VaccinationQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        doublelinkedlistqueue queue = new doublelinkedlistqueue();
        int choice;
        do {
            System.out.println("++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("++++++++++++++++++++++++++++");
            choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-------------------------------");
                    System.out.print("Nomor Antrian: ");
                    int number = scanner.nextInt();
                    scanner.nextLine();  // consume newline
                    System.out.print("Nama Penerima: ");
                    String name = scanner.nextLine();
                    queue.addLast(number, name);
                    break;
                case 2:
                    String removedName = queue.removeFirst();
                    if (removedName != null) {
                        System.out.println(removedName + " telah selesai divaksinasi.");
                    } else {
                        System.out.println("Tidak ada antrian yang tersedia.");
                    }
                    System.out.println("Daftar Pengantri Vaksin");
                    queue.printQueue();
                    break;
                case 3:
                    queue.printQueue();
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (choice != 4);
    }
}
