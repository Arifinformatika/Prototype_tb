package pretb;

import java.util.Scanner;

public class Input_Inventaris {
	Scanner in = new Scanner(System.in);
	Ruang_Kelas ruang = new Ruang_Kelas();
	
	public void Insertdata(){
		System.out.println("Masukkan nama ruangan : ");
		ruang.setNamaruang(in.next());
		System.out.println("\n");
		System.out.println("Masukkan Lokasi Ruangan : ");
		ruang.setLokasiruang(in.next());
		System.out.println("\n");
		System.out.println("Masukka Program Studi anda : ");
		ruang.setStudi(in.next());
		System.out.println("\n");
		System.out.println("Masukkan nama Fakultas anda : ");
		ruang.setFakultas(in.next());
		System.out.println("\n");
		
	}
	public void kondisi(){
		System.out.println("Kondisi Ruang Kelas\n");
		System.out.println("Masukkan panjang ruangan : ");
		ruang.setPanjang(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan lebar ruangan : ");
		ruang.setLebar(in.nextInt());
		System.out.println("\n");
		System.out.println("masukan jumlah kursi : ");
		ruang.setJumlahkursi(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan jumlah pintu : ");
		ruang.setJumlahpintu(in.nextInt());
		System.out.println("\n");

	}
	public void JmlhkondisidanposisiSarana(){
		System.out.println("Masukkan jumlah steker diruangan : ");
		ruang.setJumlahstopkontak(in.nextInt());
		System.out.println("\n");
		System.out.println("Pilih kondisi steker yang ada di ruangan : \n1. baik \n 2. sebagian rusak \n 3. rusak semua \n4. tidak ada");
		ruang.setKondisistopkontak(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan posisi steker : \n1.dipojok ruang&dekat dosen \n2. ditengah ruang ");
		ruang.setPosisistopkontak(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan jumlah kabel LCD : ");
		ruang.setKabelLCD(in.nextInt());
		System.out.println("\n");
		System.out.println("Pilih Kondisi Kabel LCD : \n1. berfungsi \n2. rusak sebagian \n3. rusak semua \n4. tidak ada");
		ruang.setKondisikabelLCD(in.nextInt());
		System.out.println("\n");
		System.out.println("Dimana letak/posisi kabel LCD : \n1. dekat dosen \n2. dekat mahasiswa");
		ruang.setPosisikabelLCD(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan jumlah lampu diruangan : ");
		ruang.setJumlahlampu(in.nextInt());
		System.out.println("\n");
		System.out.println("Pilih Kondisi lampu diruangan : \n 1. berfungsi semua \n 2. rusak sebagian \n3. rusak semua \n4. tidak ada");
		ruang.setKondisilampu(in.nextInt());
		System.out.println("\n");
		System.out.println("Dimana letak/posisi lampu : \n 1.atap \n 2. dinding \n3. lampu meja ");
		ruang.setPosisilampu(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan jumlah kipas angin yang ada diruangan : ");
		ruang.setJumlahkipasangin(in.nextInt());
		System.out.println("\n");
		System.out.println("Pilih kondisi kipas angin : \n.1. baik semua \n2. rusak sebagian \n3. rusak semua \n4. tidak ada");
		ruang.setKondisilampu(in.nextInt());
		System.out.println("\n");
		System.out.println("Dimana letak/posisi dari kipas angin : \n1. atap \n2. dinding \n3. kipas berdiri");
		ruang.setPosisikipasangin(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan jumlah AC dalam ruangan : ");
		ruang.setJumlahAC(in.nextInt());
		System.out.println("\n");
		System.out.println("Pilih Kondisi AC dalam ruangan : \n1. baik \n2. rusak sebagian \n3. rusak semua \n4. tidak ada");
		ruang.setKondisiAC(in.nextInt());
		System.out.println("\n");
		System.out.println("Dimana letak/posisi dari AC diruangan : \n1. dibelakang \n2. samping \n3. depan");
		ruang.setPosisiAC(in.nextInt());
		System.out.println("\n");
		System.out.println("Pilih SSID yang di gunakan : \n1. UMM Hotspot \n2. Lab informatika ");
		ruang.setSSID(in.nextInt());
		System.out.println("\n");
		System.out.println("Apaka anda bisa Login : \n1. Ya \n2. Tidak");
		ruang.setLogin(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan jumlah Bandwidth : ");
		ruang.setBandwidth(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan jumlah CCTV diruangan : ");
		ruang.setJumlahCCTV(in.nextInt());
		System.out.println("\n");
		System.out.println("Pilih kondisi CCTV diruangan : \n1. baik \n2. rusak sebagian \n3.rusak semua \n4. tidak ada");
		ruang.setKondisiCCTV(in.nextInt());
		System.out.println("\n");
		System.out.println("DImana letal/posisi dari CCTV diruangan : \n1. depan \n2. samping \n3. belakangan \n4. tidak ada");
		ruang.setPosisiCCTV(in.nextInt());
		System.out.println("\n");
	}
	public void lingkungan(){
		System.out.println("Kondisi lantai diruangan : \n1. bersih \n2. kotor");
		ruang.setKondisilantai(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi dinding diruangan : \n1. bersih \n2. kotor");
		ruang.setKondisidinding(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi Atap diruangan : \n1. bersih \n2. kotor");
		ruang.setKondisiatap(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi pintu diruangan : \n1. bersih \n2. kotor");
		ruang.setKondisipintu(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi Jendela diruangan : \n1. bersih \n2. kotor");
		ruang.setKondisijendela(in.nextInt());
		System.out.println("\n");
	}
	public void Kebersihan(){
		System.out.println("Konisi sirkulasi udara : \n1. lancar \n2. tidak lancar");
		ruang.setSirkulasiudara(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan nilai pencahayaan : ");
		ruang.setNilaipencahayaan(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan berapa kelembapan diruangan : ");
		ruang.setKelembapan(in.nextInt());
		System.out.println("\n");
		System.out.println("Masukkan berapa suhu dalam ruangan : ");
		ruang.setSuhu(in.nextInt());
		System.out.println("\n");
	}
	public void Kenyamanan(){

		System.out.println("Kondisi Kebisingan : \n1. tidak bising \n2. bising");
		ruang.setKebisingan(in.nextInt());
		System.out.println("\n");
		System.out.println("kondisi bau ruangan : \n1. tidak bau \n2. bauk");
		ruang.setBau(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi Kebocoran ruangan : \n1. tidak bocor \n2. bocor");
		ruang.setKebocoran(in.nextInt());
		System.out.println("\n");
		System.out.println("Konsisi kerusakan ruangan : \n1. tidak rusak \n2. rusak");
		ruang.setKerusakan(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi Keausan Ruangan : \n1.tidak aus \n2. sudah aus");
		ruang.setKeausan(in.nextInt());
		System.out.println("\n");
	}
	public void Keamanan(){
		System.out.println("Kekokohan ruangan : \n1. kokoh \n2. tidak kokoh");
		ruang.setKekokohan(in.nextInt());
		System.out.println("\n");
		System.out.println("Kunci pintu ruangan : \n1. ada \n2. rusak \n3. tidak ada");
		ruang.setKuncipintu(in.nextInt());
		System.out.println("\n");
		System.out.println("Kunci jendela ruangan : \n1. ada \n2. rusak \n3. tidak ada");
		ruang.setKuncijendela(in.nextInt());
		System.out.println("\n");
		System.out.println("Kondisi bahaya ruangan : \n1.aman \n2. tidak aman");
		ruang.setBahaya(in.nextInt());
		System.out.println("\n");
	}

}
