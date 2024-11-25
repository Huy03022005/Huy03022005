package Bai10;

public class HocVienLT extends HocVienDH {
	public int DonGiaLT;
	

	public HocVienLT(String hoten, String diaChi, String loaiChuongTrinh, int soBuoi, int donGiaDH, int n,
			int donGiaLT) {
		super(hoten, diaChi, loaiChuongTrinh, soBuoi, donGiaDH, n);
		this.DonGiaLT = DonGiaLT;
	}

	public int getDonGiaLT() {
		return DonGiaLT;
	}

	public void setDonGiaLT(int donGiaLT) {
		this.DonGiaLT = DonGiaLT;
	}

	public int HocPhi() {
		if (n==1) {
		return soBuoi*DonGiaLT-100000;
		}else if(n==2)  {
			return soBuoi*DonGiaLT-50000;
		}
		
	}

}
