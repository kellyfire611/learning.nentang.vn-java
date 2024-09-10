package lab1_2;

import java.time.LocalDateTime;

public class HelloWorld {
	// Hàm "main" (as an entry point): hàm khởi chạy đầu tiên của hệ thống
	public static void main(String[] args) {
		// Khởi tạo các biến (variables)
		String ho_ten = "Dương Nguyễn Phú Cường";
		short gioi_tinh = 0; // #0: Nam; #1: Nữ
		int tuoi = 35;

		// https://www.tutorialspoint.com/java/java_date_time.htm
//		Date ngay_sinh = new Date(1999, 12, 10, 0, 0, 0); // tạo ngày kiểu cũ (deprecated)
//		Calendar calendar = Calendar.getInstance();
//		calendar.set(1999, 12, 10, 0, 0, 0);
//		Date ngay_sinh = calendar.getTime();

		// Java 8+
		LocalDateTime ngay_sinh = LocalDateTime.parse("1999-12-10T00:00:00");

		// In ra màn hình
		// https://www.w3schools.com/java/ref_string_format.asp
		System.out.println("- Họ tên: " + ho_ten);
		System.out.println("- Giới tính: " + (gioi_tinh == 0 ? "Nam" : "Nữ"));
		System.out.format("- Ngày sinh: %td/%<tm/%<tY \n", ngay_sinh);
		System.out.format("- Tuổi: %d", tuoi);
	}
}
