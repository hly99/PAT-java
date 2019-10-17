import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ³É¼¨ÅÅÃû {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Map<Integer, String> map = new HashMap<Integer,String>();
		int n = s.nextInt();
		int max = -1 , min = 101;
		for(int i = 0; i < n; i ++) {
			String a = s.next() , b = s.next();
			int c = s.nextInt();
			map.put(c, a + " " + b);
			if(c > max) {
				max = c;
			}
			if(c < min) {
				min = c;
			}
		}
		System.out.println(map.get(max));
		System.out.println(map.get(min));
	}

}
