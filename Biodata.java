import java.util.Scanner;

public class Biodata{
	public static void main(String[] args){
		String nama, alamat;
		int usia; 
		double beratBadan;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Nama: ");	nama=keyboard.nextLine();
		System.out.print("Alamat: ");	alamat=keyboard.nextLine();
		System.out.print("Usia: "); usia=keyboard.nextInt();
		System.out.print("Berat Badan: "); beratBadan=keyboard.nextDouble();
		System.out.println("--------------");
		System.out.println("Nama: " + nama);
		System.out.println("Alamat: " + alamat);
		System.out.println("Usia: " + usia);
		System.out.println("Berat Bedan: " + beratBadan);
	}
}