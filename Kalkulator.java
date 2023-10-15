import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args){
        int bil1, bil2, hasil;
        Scanner input = new Scanner(System.in);
        System.out.println("Pertambahan");
        System.out.println("===========");
        System.out.print("Bilangan 1 : "); bil1 = input.nextInt();
        System.out.print("Bilangan 2 : "); bil2 = input.nextInt();
        hasil = bil1 + bil2;
        System.out.println("Hasil: " + hasil);
        System.out.println("Pengurangan");
        System.out.println("===========");
        System.out.print("Bilangan 1 : "); bil1 = input.nextInt();
        System.out.print("Bilangan 2 : "); bil2 = input.nextInt();
        hasil = bil1 - bil2;
        System.out.println("Hasil: " + hasil);
        System.out.println("Perkalian");
        System.out.println("===========");
        System.out.print("Bilangan 1 : "); bil1 = input.nextInt();
        System.out.print("Bilangan 2 : "); bil2 = input.nextInt();
        hasil = bil1 * bil2;
        System.out.println("Hasil: " + hasil);
        System.out.println("Pembagian");
        System.out.println("===========");
        System.out.print("Bilangan 1 : "); bil1 = input.nextInt();
        System.out.print("Bilangan 2 : "); bil2 = input.nextInt();
        hasil = bil1 / bil2;
        System.out.println("Hasil: " + hasil);
    }
}
