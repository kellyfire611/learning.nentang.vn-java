package lab1_4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//Step 1: import thư viện java.util.Scanner
import java.util.Scanner;

public class HelloWorld {
	// Hàm "main" (as an entry point): hàm khởi chạy đầu tiên của hệ thống
	public static void main(String[] args) {
		// Khởi tạo các biến (variables)
		String ho_ten;
		short gioi_tinh; // #0: Nam; #1: Nữ
		int tuoi;
		LocalDate ngay_sinh;
		String textInput;

		// Nhập liệu - Thu thập dữ liệu từ người dùng (Input)
		// Step 2: khởi tạo đối tượng từ class Scanner
		// : - yêu cầu theo dõi, thu thập dữ liệu từ luồng nhập liệu "System.in"
		Scanner scanner = new Scanner(System.in);

		// Thu thập dữ liệu Họ tên
		System.out.print("Mời nhập họ tên: ");
		ho_ten = scanner.nextLine();

		// Thu thập dữ liệu Giới tính
		System.out.print("Mời nhập giới tính (#0: Nam; #1: Nữ): ");
		textInput = scanner.next();
		gioi_tinh = Short.valueOf(textInput);

		// Thu thập dữ liệu Ngày sinh
		System.out.println("Mời nhập ngày sinh (dd/mm/yyyy): ");
		textInput = scanner.next();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		ngay_sinh = LocalDate.parse(textInput, formatter);

		// Thu thập dữ liệu Tuổi
		System.out.print("Mời nhập tuổi: ");
		textInput = scanner.next();
		tuoi = Integer.valueOf(textInput);

		// In ra màn hình (Output)
		System.out.println("- Họ tên: " + ho_ten);
		System.out.println("- Giới tính: " + (gioi_tinh == 0 ? "Nam" : "Nữ"));
		System.out.format("- Ngày sinh: %td/%<tm/%<tY \n", ngay_sinh);
		System.out.format("- Tuổi: %d", tuoi);
	}
}
