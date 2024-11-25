package Bai10;
import java.util.*;
public abstract class HocVien {
protected String hoten;
protected String DiaChi;
protected String loaiChuongTrinh;
public  String loaiUuTien;
//nhap thong tin
public void nhapThongTin(String hoten, String DiaChi, String loaiChuongTrinh,String loaiUuTien) {
	Scanner sn= new Scanner(System.in);
	System.out.println("nhập họ và tên:");
	hoten= sn.nextLine();
	System.out.println("nhập địa chỉ: ");
	DiaChi =sn.nextLine();
	System.out.println("nhập loại ưu tiên");
	loaiUuTien=sn.nextLine();
	System.out.println("nhập laoij chương trình đăng kí: ");
	loaiChuongTrinh= sn.nextLine();
}
//khoi tao thong tin
public HocVien(String hoten, String diaChi, String loaiChuongTrinh) {
	this.hoten = hoten;
	this.DiaChi = diaChi;
	this.loaiChuongTrinh = loaiChuongTrinh;
}
public String getHoten() {
	return hoten;
}
public void setHoten(String hoten) {
	this.hoten = hoten;
}
public String getDiaChi() {
	return DiaChi;
}
public void setDiaChi(String diaChi) {
	DiaChi = diaChi;
}
public String getLoaiChuongTrinh() {
	return loaiChuongTrinh;
}
public void setLoaiChuongTrinh(String loaiChuongTrinh) {
	this.loaiChuongTrinh = loaiChuongTrinh;
}
public abstract int  hocPhi();
public void inThongTin() {
	System.out.println("họ tên:"+hoten);
	System.out.println("địa chỉ"+DiaChi);
	System.out.println("loại ưu tien:"+loaiUuTien);
	System.out.println("loại chương trình đăng kí học :"+loaiChuongTrinh);
	System.out.println("học phí: "+hocPhi());
}


}
