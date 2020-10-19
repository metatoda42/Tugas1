import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner myObj = new  Scanner(System.in);
		int pilih;
		boolean exit = false;
		System.out.println("Tugas Pertama, Pandu Dhaulagiri, 124190044");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		while(exit == false) {
			System.out.println("Menu");
			System.out.println("1. Lihat Data");
			System.out.println("2. Edit Data");
			System.out.println("3. EXIT");
			pilih = myObj.nextInt();myObj.nextLine();
			if(pilih==1) {
				System.out.println(" ");
				System.out.println("Nama: " + Mahasiswa.nama);
				System.out.print("Nim: ");
				for(int i = 0; i<9; i++) {
					System.out.print(Mahasiswa.nim[i]);
				}
				System.out.println();
				System.out.println("Alamat: " + Mahasiswa.alamat);
				System.out.println("Jurusan: " + Mahasiswa.jurusan);
				System.out.println("UTS: " + Mahasiswa.uts);
				System.out.println("UAS: " + Mahasiswa.uas);
				System.out.println("Nilai: " + (Mahasiswa.uas + Mahasiswa.uts)/2);
				
			}
			else if (pilih==2) {
				System.out.println("Masukan Nama: ");
				Mahasiswa.nama = myObj.nextLine();
				System.out.println("Masukan Nim: ");
				Mahasiswa.nim = myObj.next().toCharArray();
				Mahasiswa.jurusan();myObj.nextLine();
				System.out.println("Masukan Alamat: ");
				Mahasiswa.alamat = myObj.nextLine();
				System.out.println("Nilai UTS: ");
				Mahasiswa.uts = myObj.nextInt();
				System.out.println("Nilai UAS: ");
				Mahasiswa.uas = myObj.nextInt();
				System.out.println(" ");
				System.out.println("---------------------");
				System.out.println(" ");
			}
			else if(pilih==3) {
				exit=true;
				myObj.close();
			}
			else {
				System.out.println("error Input");
			}
		}
	}
}
