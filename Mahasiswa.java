
public class Mahasiswa {
	public static String nama;
	public static String alamat;
	public static String jurusan;
	public static char[] nim = new char [9];
	public static int uts;
	public static int uas;
	public static void jurusan() {
		if(Mahasiswa.nim[2] == '4') {
			Mahasiswa.jurusan = "Informatika";
		}
		else if(Mahasiswa.nim[2] == '3') {
			Mahasiswa.jurusan = "Industri Kayaknya";
		}
		else if(Mahasiswa.nim[2] == '2') {
			Mahasiswa.jurusan = "Matematika Kayaknya";
		}
		else if(Mahasiswa.nim[2] == '1') {
			Mahasiswa.jurusan = "Perminyakan Kayaknya";
		}
		else if(Mahasiswa.nim[2] == '5') {
			Mahasiswa.jurusan = "Agama Kayaknya";
		}
		else if(Mahasiswa.nim[2] == '6') {
			Mahasiswa.jurusan = "Ilkom Kayaknya";
		}
		else if(Mahasiswa.nim[2] == '7') {
			Mahasiswa.jurusan = "Gak Tau";
		}
		else if(Mahasiswa.nim[2] == '8') {
			Mahasiswa.jurusan = "Kedokteran Kayaknya";
		}
		else if(Mahasiswa.nim[2] == '9') {
			Mahasiswa.jurusan = "Perikanan Kayaknya";
		}
		else {
			Mahasiswa.jurusan = "Au ah, gelap";
		}
	}

}

