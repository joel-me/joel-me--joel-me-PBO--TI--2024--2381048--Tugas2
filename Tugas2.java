import java.util.Scanner;

public class Tugas2 {
    public static double luasPersegi(double sisi){
        return sisi*sisi;
    }
    public static double kelilingPersegi(double sisi){
        return 4*sisi;
    }
    public static double luasPersegiPanjang(double panjang, double lebar){
        return panjang*lebar;
    }
    public static double kelilingPersegiPanjang(double panjang, double lebar){
        return 2*(panjang*lebar);
    }
    public static double luasLingkaran(double jariJari){
        return 3.14*jariJari*jariJari ;
    }
    public static double kelilingLingkaran(double jariJari){
        return 2*3.14*jariJari ;
    }


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Pilihlah bagun datar yang ingin anda ketahui luas maupun kelilingnya(persegi, persegi panjang, lingkaran): ");
        String bangunDatar= scanner.nextLine().toLowerCase();


            switch (bangunDatar){
                case"persegi":
                    System.out.print("Masukkan panjang sisi persegi: ");
                    double sisi = scanner.nextDouble();
                    System.out.println("Luas persegi: " + luasPersegi(sisi));
                    System.out.println("Keliling persegi: " + kelilingPersegi(sisi));
                    break;

                case "persegi panjang":
                    System.out.print("Masukkan panjang persegi panjang: ");
                    double panjang = scanner.nextDouble();
                    System.out.print("Masukkan lebar persegi panjang: ");
                    double lebar = scanner.nextDouble();
                    System.out.println("Luas persegi panjang: " + luasPersegiPanjang(panjang, lebar));
                    System.out.println("Keliling persegi panjang: " + kelilingPersegiPanjang(panjang, lebar));
                    break;

                case "lingkaran":
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    double jariJari = scanner.nextDouble();
                    System.out.println("Luas lingkaran: " + luasLingkaran(jariJari));
                    System.out.println("Keliling lingkaran: " + kelilingLingkaran(jariJari));
                    break;

                default:
                    System.out.println("Bangun datar yang dipilih tidak valid.");
                break;
            }
            scanner.close();
    }
}
