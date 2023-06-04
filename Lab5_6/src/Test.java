import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
	Map<Integer,SinhVien> mapsv= new HashMap<Integer,SinhVien>();
	Scanner sc=new Scanner(System.in);
	System.out.println("Nhập số lượng sinh viên: ");
	int n=sc.nextInt();
	int i=1;
	while(i<=n) {
		System.out.println("Nhập thông tin sinh viên thứ"+i);
		System.out.println("Ma SV: "); int msv=sc.nextInt(); 
		System.out.println("Họ tên: "); String hoten=sc.nextLine();
		sc.nextLine();
		System.out.println("Lớp: "); String lop=sc.nextLine();
		SinhVien sv=new SinhVien(msv,hoten,lop);
		mapsv.put(i, sv);
		i++;
	}
	System.out.println("Nhap ten lop : "); String tenlop=sc.nextLine();
  for(Map.Entry<Integer, SinhVien> m:mapsv.entrySet()) {
	   {
		   if( m.getValue().getLop()==tenlop) {
		  System.out.println(m.getValue());
		   }else {
			   System.out.println("Khong thay");
		   }
	  }  
  }
  System.out.println("Nhap ma sinh vien :"); int ms=sc.nextInt();

  for(Map.Entry<Integer, SinhVien> m:mapsv.entrySet()) {
	   {
		   if( m.getValue().getMaSV()==ms) {
		  System.out.println(m.getValue().getHoTen()+m.getValue().getLop());
		   }else {
			   System.out.println("Khong thay");
		   }
	  }  
}
  
}
}
