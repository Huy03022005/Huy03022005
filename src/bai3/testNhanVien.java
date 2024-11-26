package bai3;

public class testNhanVien {
	public static void main(String[] args) {
		DiaChi DC= new DiaChi("quan bac","van truong","th","tb");
		
		NhanVien NV=new NhanVien("huy","03",'m',DC);
		System.out.println(NV);
		
	}

}
