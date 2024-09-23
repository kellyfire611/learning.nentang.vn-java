package lab7_3;

import java.time.LocalDate;
//Step 1: import thư viện Scanner
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		// Nhập liệu - Thu thập dữ liệu từ người dùng (Input)
		// Step 2: khởi tạo đối tượng từ class Scanner
		// : - yêu cầu theo dõi, thu thập dữ liệu từ luồng nhập liệu "System.in"
		Scanner sc = new Scanner(System.in);

		// Khởi tạo đối tượng
		Employee nv1 = new Employee();
//		nv1.input();
		nv1.setId(1);
		nv1.setFirstName("Cuong");
		nv1.setLastName("Duong Nguyen Phu");
		nv1.setGender((byte) 1);
		nv1.setBirthDay(LocalDate.parse("1989-06-11"));
		nv1.setSalary(5000000d);
		nv1.printInfo();

		nv1.upToSalary(15); // Tăng lương 15%
		nv1.printInfo();
	}
}
