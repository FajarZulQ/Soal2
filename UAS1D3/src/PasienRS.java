import java.util.ArrayList;
import java.util.Calendar;

    class Pasien {
        String nama;
        int umur;
        boolean divaksin;

        public Pasien(String nama, int umur, boolean divaksin) {
            this.nama = nama;
            this.umur = umur;
            this.divaksin = divaksin;
        }
    }

    public class PasienRS {
        public static void main(String[] args) {
            ArrayList<Pasien> dataPasien = new ArrayList<>();
            ArrayList<Integer> tahunLahir = new ArrayList<>();

            // Mendata pasien sebanyak 105 orang
            for (int i = 1; i <= 105; i++) {
                String namaPasien = "Pasien " + i;
                int umurPasien = (int) (Math.random() * 50) + 20; // Umur antara 20-69 tahun
                boolean divaksin = Math.random() < 0.5; // 50% chance divaksin

                Pasien pasien = new Pasien(namaPasien, umurPasien, divaksin);
                dataPasien.add(pasien);

                // Menghitung perkiraan tahun lahir
                int tahunLahirPasien = Calendar.getInstance().get(Calendar.YEAR) - umurPasien;
                tahunLahir.add(tahunLahirPasien);
            }

            // Menampilkan data pasien yang belum divaksin
            System.out.println("Pasien yang belum divaksin:");
            for (Pasien pasien : dataPasien) {
                if (!pasien.divaksin) {
                    System.out.println("Nama: " + pasien.nama + ", Umur: " + pasien.umur + " tahun");
                }
            }

            // Menampilkan data perkiraan tahun lahir
            System.out.println("\nPerkiraan tahun lahir dari data umur pasien:");
            for (int i = 0; i < tahunLahir.size(); i++) {
                System.out.println("Pasien " + (i + 1) + ": " + tahunLahir.get(i));
            }
        }
    }

