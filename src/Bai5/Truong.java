package Bai5;

import java.util.Scanner;
public class Truong {
	//khai bao cac thuoc tinh cua lop Truong
	private String ten;
	private String DiaChi;
	private String hieuTruong;
	//khoi tao cac doi tuong trong lop Nguoi
	public Truong(String ten, String diaChi, String hieuTruong) {
		super();
		this.ten = ten;
		DiaChi = diaChi;
		this.hieuTruong = hieuTruong;
	}

	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	public String getHieuTruong() {
		return hieuTruong;
	}
	public void setHieuTruong(String hieuTruong) {
		this.hieuTruong = hieuTruong;
	}
	@Override
	public String toString() {
		return "Truong [ten=" + ten + ", DiaChi=" + DiaChi + ", hieuTruong=" + hieuTruong + "]";
	}
	

}
