package Bai11;

import java.util.Scanner;

public class GVCoHuu extends GiangVien {
	private double lCB;
	private double heSoLuong;
	private double phuCap;
	private int n;
	public GVCoHuu() {
		super();
	}
	public GVCoHuu(String hoTen, String diaChi, String loaiGiangVien, double lCB, double heSoLuong, double phuCap,int n) {
		super(hoTen,diaChi, loaiGiangVien);
		this.lCB = lCB;
		this.heSoLuong = heSoLuong;
		this.phuCap = phuCap;
		this.n=n;
	}
	public double tinhLuong() {
		if(n<5) {
			phuCap=0;
		}else if(n>=5) {
			phuCap=(float)(n/100) *lCB;
		}
		return lCB*heSoLuong+phuCap;
	}
	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner sn= new Scanner(System.in);
		System.out.println("nhap luong co ban: ");
		lCB=sn.nextDouble();
		System.out.println("nhap he so luong: ");
		heSoLuong= sn.nextDouble();
	}
	

}
