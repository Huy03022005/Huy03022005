package Bai11;

import java.util.Scanner;

public class GVThinhGiang extends GiangVien {
	private Double soTietDay;
	private Double donGia;
	private Double thuNhap;

	public GVThinhGiang() {
		super();
	}

	public GVThinhGiang(String hoTen, String diaChi, String loaiGiangVien, Double soTietDay, Double donGia,
			Double thuNhap) {
		super(hoTen, diaChi, loaiGiangVien);
		this.soTietDay = soTietDay;
		this.donGia = donGia;
		this.thuNhap = thuNhap;
	}

	public double tinhLuong() {
		thuNhap = (float) 0.15 * soTietDay * donGia;
		return soTietDay * donGia - thuNhap;
	}

	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner sn = new Scanner(System.in);
		System.out.println("nhap so tiet day: ");
		soTietDay = sn.nextDouble();
		System.out.println("nhap don gia: ");
		donGia = sn.nextDouble();
	}

}
