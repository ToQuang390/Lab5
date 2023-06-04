import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class lab5 {
	public static void main(String[] args) {
		HashSet<Float> set = new HashSet<Float>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng:");
		int n=sc.nextInt();
		float a[] = new float[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextFloat();
			set.add(a[i]);
		}
		System.out.println("Nhap so thuc tim kiem: ");
		float num = sc.nextFloat();
     for(float x:set) {
    	 if(x==num) {
    		 System.out.println("Tìm thấy: "+x);
    	 }
     }
     
	}
}
