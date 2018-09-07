
public class Dosen{


	public Dosen(String nama, String umur, String gender, String bidang) {
		super(nama, umur, gender,bidang);
	}
	
	public static void tambahNilai (String namaMhs, String namaDosen, int nilai) {
		if (Fasilkom.arrNamaElemen.contains(namaDosen) && Fasilkom.arrNamaElemen.contains(namaMhs)) {
			int temp = 0;
			int ind = 0;
			for (int i = 0; i<Fasilkom.arrElemen.size(); i++) {
				if (Fasilkom.arrElemen.get(i).getNama().equalsIgnoreCase(namaDosen)) {
					ind = Fasilkom.arrElemen.indexOf(Fasilkom.arrElemen.get(i));
				}
			}
			for (int j = 0; j<Fasilkom.arrElemen.size(); j++) {
					if (Fasilkom.arrElemen.get(j).getNama().equalsIgnoreCase(namaMhs)) {
						temp = Fasilkom.arrElemen.indexOf(Fasilkom.arrElemen.get(j));
					}
					
				}
				
			Dosen dosen = (Dosen) Fasilkom.arrElemen.get(ind);
			Mahasiswa mahasiswa = (Mahasiswa) Fasilkom.arrElemen.get(temp);
			if(nilai >= 0 && nilai <= 100) {
				mahasiswa.setNilai(nilai);
				System.out.println(namaDosen+" memberikan nilai "+dosen.getBidang()+" kepada "+namaMhs+" sebesar "+nilai);
			}
			else {
				System.out.println("Nilai harus diantara 0 sampai 100");
			}
		}
		else if(!(Fasilkom.arrNamaElemen.contains(namaDosen)) && Fasilkom.arrNamaElemen.contains(namaMhs)) {
			System.out.println("Tidak ada dosen bernama "+namaDosen);
		}
		else if (Fasilkom.arrNamaElemen.contains(namaDosen) && !(Fasilkom.arrNamaElemen.contains(namaMhs))) {
			System.out.println("Tidak ada mahasiswa bernama "+namaMhs);
		}
		
		
	}
	

}
