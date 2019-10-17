import java.util.Scanner;

public class 我要通过 {
	public static Boolean pd(String str) {
		int p = 0 , t = 0;
		int wp = -1 , wt = -1;
		for(int i = 0; i < str.length(); i ++) {
			if(str.charAt(i) == 'P') {
				p ++;
				wp = i;
			}else if (str.charAt(i) == 'T') {
				t ++;
				wt = i;
			}else if (str.charAt(i) != 'A') {
				return false;
			}
		}
		if(p != 1 || t != 1 || wt - wp <= 1) {
			return false;
		}
		if(wp * (wt - wp - 1) == str.length() - wt - 1) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		for(int i = 0; i < n; i ++) {
			String str = S.next();
			if(pd(str)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}

	}

}
