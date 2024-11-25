package bai3;

public class NhanVien {
	protected String name;
	protected String dod;
	protected char gender;
	protected DiaChi diachi;

	public NhanVien() {
	}

	public NhanVien(String name, String dod, char gender, DiaChi diachi) {
		this.name = name;
		this.dod = dod;
		this.gender = gender;
		this.diachi = diachi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDod() {
		return dod;
	}

	public void setDod(String dod) {
		this.dod = dod;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public DiaChi getDiachi() {
		return diachi;
	}

	public void setDiachi(DiaChi diachi) {
		this.diachi = diachi;
	}

	@Override
	public String toString() {
		return "NhanVien [name=" + name + ", dod=" + dod + ", gender=" + gender + ", diachi="
				+ diachi + "]";
	}
	
	

}
