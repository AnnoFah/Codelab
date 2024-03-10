import java.util.ArrayList;
import java.util.List;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private static List<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public Mahasiswa(String nama, String nim, String jurusan) {
        if (nim.length() == 15) {
            this.nama = nama;
            this.nim = nim;
            this.jurusan = jurusan;
            daftarMahasiswa.add(this);
        } else {
            throw new IllegalArgumentException("NIM harus berjumlah 15 angka.");
        }
    }

    public static void TampilUniversitas() {
        System.out.println("Universitas Muhammadiyah Malang");
    }

    public static void TampilDataMahasiswa() {
        for (Mahasiswa mhs : daftarMahasiswa) {
            System.out.println("Nama: " + mhs.nama + ", NIM: " + mhs.nim + ", Jurusan: " + mhs.jurusan);
        }
    }
}
