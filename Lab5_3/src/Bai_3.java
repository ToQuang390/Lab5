import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Bai_3 {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	Queue<Integer> queue=new ArrayDeque<Integer>();
	System.out.println("Nhập n: ");
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		int imple=sc.nextInt();
		queue.add(imple);
	}
	System.out.println("Nhập số lượng phần tử muốn lấy ra: "); int m=sc.nextInt();
	if(m<=n) 
	{
	for(int i=0;i<m;i++) {
		int z=queue.remove();
		System.out.println(z);
	}
    }
	else {
	 System.out.println("Nhập sai");
    }
	}
}
