package lab3_4;

//Step 1: import thư viện Scanner
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		// Nhập liệu - Thu thập dữ liệu từ người dùng (Input)
		// Step 2: khởi tạo đối tượng từ class Scanner
		// : - yêu cầu theo dõi, thu thập dữ liệu từ luồng nhập liệu "System.in"
		Scanner sc = new Scanner(System.in);

		final int MAX_ROWS = 4;
		final int MAX_COLS = 4;
		int[][] arrLED = new int[MAX_ROWS][MAX_COLS];

		// Input
		// Duyệt theo dòng i
		for (int i = 0; i < MAX_ROWS; i++) {
			// Duyệt theo cột j
			for (int j = 0; j < MAX_COLS; j++) {
				System.out.printf("[%d, %d] = ", i, j);
				arrLED[i][j] = sc.nextInt();
			}
		}

		// In ra màn hình
		// Duyệt theo dòng i
		for (int i = 0; i < MAX_ROWS; i++) {
			// Duyệt theo cột j
			for (int j = 0; j < MAX_COLS; j++) {
				// System.out.printf("[%d, %d] = %d, ", i, j, arrLED[i][j]);
				System.out.printf("%4d", arrLED[i][j]);
			}
			System.out.print("\n");
		}

		// Tìm số MAX - Vét cạn
		int max = arrLED[0][0];
		int max_vitri_i = 0;
		int max_vitri_j = 0;
		for (int i = 0; i < MAX_ROWS; i++) {
			for (int j = 0; j < MAX_COLS; j++) {
				// Tim MAX
				if (arrLED[i][j] > max) {
					max = arrLED[i][j];
					max_vitri_i = i;
					max_vitri_j = j;
				}

			}
		}

		// In ra màn hình
		System.out.printf("Giá trị lớn nhất [%d][%d] = %d", max_vitri_i, max_vitri_j, max);
	}
}
