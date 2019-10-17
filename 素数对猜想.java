import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ËØÊı¶Ô²ÂÏë {
	public static Boolean ss(int n) {
		if(n < 2) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(n); i ++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		int sum = 0;
		List<Integer> arr = new ArrayList<Integer>();
		for(int i = 2; i <= n; i ++) {
			if(ss(i)) {
				arr.add(i);
			}
		}
		for(int j = 0; j < arr.size(); j ++) {
			if(j + 1 < arr.size() && arr.get( j + 1 ) - arr.get( j ) == 2) {
				sum ++;
			}
		}
		System.out.println(sum);
	}
}
