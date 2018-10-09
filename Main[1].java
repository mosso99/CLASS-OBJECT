import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	System.out.println("-----object kelas kotak------");
//object dari class kotak
	Kotak1 main = new Kotak1();
// SETTER PADA KOTAK
	main.setPanjang(5.5);
	main.setLebar(10.03);
//getter pada kotak
	System.out.println("panjang : "+main.getPanjang());
	System.out.println("lebara : "+main.getLebar());
	System.out.println("luas : "+main.getPanjang()*main.getLebar());
	System.out.println("keliling : "+ 2*main.getPanjang()+main.getLebar());
	
	System.out.println("------object kelas mahasiswa-------");
//membuat object dari kelas mahasiswa
	Mahasiswa mhs = new Mahasiswa();
//method setter
	mhs.nama = "Ainun berlian";
	mhs.nim = "D0217031";
	mhs.alamat = "mosso";
	mhs.golonganDarah = "O";
	mhs.status = "pelajar";
	mhs.tinggiBadan = 155;
	mhs.beratBadan = 48;
//method getter
	System.out.println("nama : "+mhs.getNama());
	System.out.println("nim : "+mhs.getNim());
	System.out.println("alamat: "+mhs.getAlamat());
	System.out.println("Golongan darah: "+mhs.getGolonganDarah());
	System.out.println("status: "+mhs.getStatus());
	System.out.println("Tinggi badan: "+mhs.getTinggiBadan());
	System.out.println("Berat badan: "+mhs.getBeratBadan());

	System.out.println("---------object kelas node--------");
//membuat
	NODE nod = new NODE();
//method setter
	nod.label = "mybaby";
	nod.Value = 2;
//method getter
	System.out.println("Nama label: "+nod.getLabel());
	System.out.println("jumlah label: "+ nod.getValue());
	
	System.out.println("------object kelas stack-------");
//membuatobject
	Stackjava stc = new Stackjava();
	stc.Value[0]= "Ainun berlian";
	stc.Value[1]= "Ainun";
	stc.Value[2]= "Eka";
	stc.Value[3]= "Zoek";
	stc.setValueAt(2, "Zoek");
//menampilkan stack
	for(int i=0;i<stc.Value.length;i++) {System.out.println(stc.Value[i]);};
	
	}
	}


