import java.util.Scanner;
import java.util.Stack;

public class Bai_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println("Mời bạn nhập n:");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int st = sc.nextInt();
			stack.push(st);
		}
		System.out.println("Mời bạn nhập số lượng phần tử muốn lấy: ");
		int num = sc.nextInt();
		while (num <= n) {
			Object P = stack.pop();
			System.out.println(P);
			num++;
		}
	}
}
