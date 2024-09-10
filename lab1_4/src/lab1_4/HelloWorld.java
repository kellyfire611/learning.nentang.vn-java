package lab1_4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
		Scanner scanner = new Scanner(System.in);
		System.out.print("Mời nhập họ tên: ");
		ho_ten = scanner.nextLine();

		System.out.print("Mời nhập giới tính: ");
		textInput = scanner.next();
		gioi_tinh = Short.valueOf(textInput);

		System.out.println("Mời nhập ngày sinh (dd/mm/yyyy): ");
		textInput = scanner.next();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		ngay_sinh = LocalDate.parse(textInput, formatter);

		System.out.print("Mời nhập tuổi: ");
		textInput = scanner.next();
		tuoi = Integer.valueOf(textInput);

		// In ra màn hình (Output)
		System.out.println("- Họ tên: " + ho_ten);
		System.out.println("- Giới tính: " + (gioi_tinh == 0 ? "Nam" : "Nữ"));
		System.out.format("- Ngày sinh: %td/%<tm/%<tY \n", ngay_sinh);
		System.out.format("- Tuổi: %07d", tuoi);
	}
}
