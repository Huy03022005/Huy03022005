package Bai11;
import java.util.*;
public class testGiangVien {
	public static void main(String[] args) {
		int n;
		Scanner sn= new Scanner(System.in);
		System.out.println("nhap 1 neu lag giang vien co huu;");
		System.out.println("nhap 2 neu neu la giang vien thinh giang;");
		System.out.println("moi nhap");
		n= sn.nextInt();
		
		if(n==1) {
			GVCoHuu GVCH= new GVCoHuu();
			GVCH.nhapThongTin();
			GVCH.inThongTin();
		}else if(n==2) {
			GVThinhGiang GVTG= new GVThinhGiang();
			GVTG.nhapThongTin();
			GVTG.inThongTin();
		}
			
		
	}

}
