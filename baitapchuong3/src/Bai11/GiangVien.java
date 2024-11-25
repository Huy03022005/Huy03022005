package Bai11;
import java.util.*;
import java.util.Scanner;

public abstract class GiangVien {
	//khai bao cac thuoc tinh
	protected String hoTen;
	protected String diaChi;
	protected String loaiGiangVien;
	public void nhapThongTin() {
		Scanner sn= new Scanner(System.in);
		System.out.println("nhap ho ten:");
		hoTen=sn.nextLine();
		System.out.println("nhap dia chi");
		diaChi= sn.nextLine();
		System.out.println("nhap loai giang vien");
		loaiGiangVien=sn.nextLine();
	}
	//khoi tao khong doi so
	public GiangVien() {
	}
//khoi tao co doi so
	public GiangVien(String hoTen, String diaChi, String loaiGiangVien) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiGiangVien = loaiGiangVien;
	}
	public abstract double tinhLuong();
	public void inThongTin() {
		System.out.println("ho ten: "+ hoTen);
		System.out.println("dia chi: "+diaChi);
		System.out.println("loai giang vien"+ loaiGiangVien);
		System.out.println("luong: "+ tinhLuong());
	}
	

}
