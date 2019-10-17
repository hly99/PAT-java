import java.util.Scanner;

public class 换个格式输出整数 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		int b = n / 100;
		int s = n / 10 % 10;
		int g = n % 10;
		String str = "";
		while(b>0) {
			str = str + 'B';
			b --;
		}
		while(s>0) {
			str = str + 'S';
			s --;
		}
		for(int i = 1; i <= g; i ++) {
			str = str + i + "";
		}
		System.out.println(str);
	}
}
