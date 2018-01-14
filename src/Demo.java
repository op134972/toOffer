import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();
		System.out.println(fun(year,m,d));
	}

	private static int fun(int y, int m, int d) {
		int dd = 0;
		int days = 0;
		for (int i = 1; i < m; i++) {
			switch (i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
			case 2:
				if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
					days = 29;
				else
					days = 28;
				break;
			}
			dd += days;
		}
		return dd + d;
	}
}
