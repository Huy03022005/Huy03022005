package Bai10;

public class HocVienDH extends HocVien {
	public int soBuoi;
	public int donGiaDH;
	public int n;
	public HocVienDH(String hoten, String diaChi, String loaiChuongTrinh, int soBuoi, int donGiaDH, int n) {
		super(hoten, diaChi, loaiChuongTrinh);
		this.soBuoi = soBuoi;
		this.donGiaDH = donGiaDH;
		this.n = n;
	}
	public int getSoBuoi() {
		return soBuoi;
	}
	public void setSoBuoi(int soBuoi) {
		this.soBuoi = soBuoi;
	}
	public int getDonGiaDH() {
		return donGiaDH;
	}
	public void setDonGiaDH(int donGiaDH) {
		this.donGiaDH = donGiaDH;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public int HocPhi() {
		if(n==1) {
			return soBuoi*donGiaDH-1000000;
		}else if(n==2) {
			return soBuoi*donGiaDH-500000;
		}
	}

}
