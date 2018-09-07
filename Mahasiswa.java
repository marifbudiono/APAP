
public class Mahasiswa{
	private int angkatan;
	private int nilai;
	private boolean sudahMasuk;
	
	public Mahasiswa(String nama, String umur, String gender, int angkatan) {
		super(nama, umur, gender);
		this.angkatan = angkatan;
		this.nilai = 0;
		this.sudahMasuk = false;
	}
	
	public int getAngkatan() {	return angkatan;}
	public void setAngkatan(int angkatan) {	this.angkatan = angkatan;}
	public int getNilai() {	return nilai;}
	public void setNilai(int nilai) {	this.nilai = nilai;}
	public boolean isSudahMasuk() {	return sudahMasuk;}
	public void setSudahMasuk(boolean sudahMasuk) {this.sudahMasuk = sudahMasuk;}
	
	public static void lihatNilai (String namaMhs) {
		if (Fasilkom.arrNamaElemen.contains(namaMhs)) {
			int index = 0;
			for (int i = 0; i<Fasilkom.arrElemen.size(); i++) {
				if (Fasilkom.arrElemen.get(i).getNama().equalsIgnoreCase(namaMhs)) {
					index = Fasilkom.arrElemen.indexOf(Fasilkom.arrElemen.get(i));
				}
			}
			
			Mahasiswa mhs = (Mahasiswa) Fasilkom.arrElemen.get(index);
			if(mhs.getNilai() == 0 || mhs.isSudahMasuk() == false) {
				System.out.println("Nilai "+namaMhs+" belum ada");
			}
			else {
				System.out.println("Nilai "+namaMhs+" adalah "+mhs.getNilai());
			}
		}
		else {
			System.out.println("Tidak ada mahasiswa bernama "+namaMhs);
		}
	}
}
