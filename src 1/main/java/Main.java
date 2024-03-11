import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInput");
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        System.out.print("Masukkan tanggal lahir (yyyy-mm-dd): ");
        String tanggalLahirString = scanner.next();

        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirString, DateTimeFormatter.ISO_DATE);

        LocalDate sekarang = LocalDate.now();
        int umur = sekarang.getYear() - tanggalLahir.getYear();
        if (tanggalLahir.plusYears(umur).isAfter(sekarang)) {
            umur--;
        }

        System.out.println("\nOutput");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin == 'L' ? "Laki-laki" : "Perempuan"));
        System.out.println("Tanggal Lahir: " + tanggalLahir.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));
        System.out.println("Umur Anda: " + umur + " tahun");

    }
}
