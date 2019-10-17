import java.util.Scanner;

public class Ëµ·´»° {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		String str = S.nextLine();
		String[] arr = str.split(" ");
		for(int i = arr.length - 1; i >= 0; i --) {
			System.out.print(arr[i]);
			if(i != 0) {
				System.out.print(" ");
			}
		}

	}

}
