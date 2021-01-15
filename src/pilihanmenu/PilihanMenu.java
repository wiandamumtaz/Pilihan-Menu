package pilihanmenu;
import java.util.Scanner;
public class PilihanMenu {

    public static void main(String[] args) {
        // Input
        Scanner Masukkan = new Scanner (System.in);
        int Pilihan;
        //Memilih Menu yang diinginkaan User
        do {
            System.out.println("\n Menu Luas Bangun");
            System.out.println("1.Menghitung Luas Persegi ");
            System.out.println("2.Menghitung Luas Persegi Panjang ");
            System.out.println("3. Keluar ");
            System.out.print("Masukkan Pilihan Anda :");
            Pilihan = Masukkan.nextInt();
        // case 1 untuk Menghitung Luas Persegi
        // case 2 untuk menghitung Luas Persegi Panjang 
        // Pilihan 3 atau Kecuali case 3 untuk Mengakhiri Menu Pilihan 
        switch(Pilihan){
            case 1 : LuasPersegi();break;
            case 2 : LuasPersegiPanjang();break;
        }
        }while(Pilihan!=3);
        }
    //Jika Yang Dipilih angka 1 Maka Program dibawah ini dijalankan :
        private static void LuasPersegi(){
            Scanner Masukkan = new Scanner(System.in);
            float Sisi,Luas;
            System.out.print("Masukkan Nilai Sisi :");
            Sisi = Masukkan.nextFloat();
            Luas = Sisi*Sisi;
            System.out.println("Luas Persegi Adalah : "+Luas);
        }    
    //Jika Yang Dipilih angka 1 Maka Program dibawah ini dijalankan :
        private static void LuasPersegiPanjang(){
            Scanner Masukkan = new Scanner(System.in);
            float Panjang,Lebar,Luas;
            System.out.print("Masukkan Nilai Panjang :");
            Panjang = Masukkan.nextFloat();
            System.out.print("Masukkan Nilai Lebar :");
            Lebar = Masukkan.nextFloat();
            Luas = Panjang * Lebar;
            System.out.println("Luas Persegi Panjang adalah : "+Luas);
        }
    }