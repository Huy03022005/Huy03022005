package Bai5;

import java.util.Scanner;

public class testSinhVien {

	public static void main(String[] args) {
		String ten;
		String DiaChi;
		String hieuTruong;
		Scanner sn=new Scanner(System.in);
		System.out.println("ten truong:");
		ten= sn.nextLine();
		System.out.println(" dia chi truong:");
		DiaChi= sn.nextLine();
		System.out.println("hieu Truong");
		hieuTruong= sn.nextLine();
		Truong truong= new Truong(ten,DiaChi,hieuTruong);
		SinhVien SV= new SinhVien("huy",12,'M',"cntt","01",truong);
		System.out.println(SV);
		
	}

}
