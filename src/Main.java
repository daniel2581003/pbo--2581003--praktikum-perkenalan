import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda: ");
        String Nama = scanner.nextLine();

        System.out.print("Masukkan NIM Anda: ");
        int Nim = scanner.nextInt();

        System.out.print("Masukkan Umur Anda: ");
        int Umur = scanner.nextInt();

        System.out.print("Masukkan Tinggi Anda: ");
        double Tinggi = scanner.nextDouble();

        System.out.print("Masukkan Asal Kota Anda: ");
        String Asal = scanner.nextLine();

    }

}
