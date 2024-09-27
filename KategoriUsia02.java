import java.util.Scanner;
public class KategoriUsia02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usia = -1; 

        
        while (true) {
            System.out.print("Masukkan usia Anda: ");
            if (sc.hasNextInt()) { 
                usia = sc.nextInt();
                if (usia >= 0) { 
                    break; 
                } else {
                    System.out.println("Input tidak valid. Usia harus angka positif.");
                }
            } else {
                System.out.println("Input tidak valid. Mohon masukkan angka.");
                sc.next();
            }
        }

        
        String kategori;
        if (usia <= 12) {
            kategori = "Anak";
        } else if (usia <= 19) {
            kategori = "Remaja";
        } else if (usia <= 64) {
            kategori = "Dewasa";
        } else {
            kategori = "Lansia";
        }

        
        System.out.println("Kategori usia Anda: " + kategori);
        sc.close(); 
    }

}
