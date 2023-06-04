
public class SinhVien {
  private int maSV;
  private String hoTen;
  private String lop;
  
  
  
public SinhVien(int maSV, String hoTen, String lop) {
	this.maSV = maSV;
	this.hoTen = hoTen;
	this.lop = lop;
}



public int getMaSV() {
	return maSV;
}



public void setMaSV(int maSV) {
	this.maSV = maSV;
}



public String getHoTen() {
	return hoTen;
}



public void setHoTen(String hoTen) {
	this.hoTen = hoTen;
}



public String getLop() {
	return lop;
}



public void setLop(String lop) {
	this.lop = lop;
}



public String toString() {
	StringBuffer buffer = new StringBuffer();
	buffer.append("SinhVien [maSV=").append(maSV).append(", hoTen=").append(hoTen).append(", lop=").append(lop)
			.append("]");
	return buffer.toString();
}
}

