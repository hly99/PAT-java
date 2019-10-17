import java.util.Scanner;

public class 写出这个数 {
	public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String s = S.next();
        int len = s.length();
        int sum = 0;
        for(int i = 0; i < len; i ++) {
        	int n = s.charAt(i) - '0';
        	sum = sum + n;
        }
        String str = sum +"";
        for(int j = 0; j < str.length(); j ++) {
        	if( str.charAt(j) == '0') {
        		System.out.print("ling");
        	}
        	if( str.charAt(j) == '1') {
        		System.out.print("yi");
        	}
        	if( str.charAt(j) == '2') {
        		System.out.print("er");
        	}
        	if( str.charAt(j) == '3') {
        		System.out.print("san");
        	}
        	if( str.charAt(j) == '4') {
        		System.out.print("si");
        	}
        	if( str.charAt(j) == '5') {
        		System.out.print("wu");
        	}
        	if( str.charAt(j) == '6') {
        		System.out.print("liu");
        	}
        	if( str.charAt(j) == '7') {
        		System.out.print("qi");
        	}
        	if( str.charAt(j) == '8') {
        		System.out.print("ba");
        	}
        	if( str.charAt(j) == '9') {
        		System.out.print("jiu");
        	}
        	if(j != str.length()-1) {
        		System.out.print(" ");
        	}
        }
    }
}
