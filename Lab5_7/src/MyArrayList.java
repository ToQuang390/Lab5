import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MyArrayList {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	List<Object> arrlist=new ArrayList<Object>();
	System.out.println("Nhập số nguyên:");
	int n=sc.nextInt();
	arrlist.add(n);
	System.out.println("Nhập số thực:");
	Float t=sc.nextFloat();
	arrlist.add(t);
	System.out.println("Giá trị boolean: ");
	arrlist.add(true);
	System.out.println("Nhập chuỗi:");
	String c=sc.nextLine();
	arrlist.add(c);
	sc.nextLine();
	Iterator<Object> iter=arrlist.iterator();
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}
	
}
}
