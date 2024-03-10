import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    try {
                        System.out.print("Masukka nama mahasiswa: ");
                        String nama = scanner.nextLine();
                        System.out.print("Masukkan NIM mahasiswa: ");
                        String nim = scanner.nextLine();
                        System.out.print("Masukkan jurusan mahasiswa: ");
                        String jurusan = scanner.nextLine();

                        new Mahasiswa(nama, nim, jurusan);
                        System.out.println("Data mahasiswa berhasil ditambahkan.");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    Mahasiswa.TampilUniversitas();
                    Mahasiswa.TampilDataMahasiswa();
                    break;
                case 3:
                    System.out.println("Keluar");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        } while (pilihan != 3);

        scanner.close();
    }
}
