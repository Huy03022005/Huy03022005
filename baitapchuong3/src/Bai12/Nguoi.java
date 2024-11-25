package Bai12;

import java.util.Scanner;

public abstract class Nguoi {
	protected String hoTen;
	protected String ngaySinh;
	protected String diaChi;
	protected String loaiSinhVien;
	public Nguoi() {
	}
	public Nguoi(String hoTen, String ngaySinh, String diaChi, String loaiSinhVien) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.loaiSinhVien = loaiSinhVien;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getLoaiSinhVien() {
		return loaiSinhVien;
	}
	public void setLoaiSinhVien(String loaiSinhVien) {
		this.loaiSinhVien = loaiSinhVien;
	}
	public void nhap() {
		Scanner sn= new Scanner(System.in);
		System.out.println("nhap ha va ten: ");
		hoTen =sn.nextLine();
		System.out.println("nhap ngay sinh: ");
		ngaySinh= sn.nextLine();
		System.out.println("nhap dia chi: ");
		diaChi= sn.nextLine();
		System.out.println("nhap loai sinh vien: ");
		loaiSinhVien=sn.nextLine();
	}
	public abstract double tinhDiem();
	public void inThongTin() {
		System.out.println(" ho va ten: "+hoTen);
		System.out.println("ngay sinh: "+ngaySinh);
		System.out.println(" dia chi: "+ diaChi);
		System.out.println("loai sinh vien: "+ loaiSinhVien);
		System.out.println("diem trung binh:  "+tinhDiem());
	}
	
	
	
  
}
