package lab7_3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
//Step 1: import thư viện Scanner
import java.util.Scanner;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private byte gender; // #1: Nam; #2: Nữ; #3: Không công bố
	private LocalDate birthDay;
	private double salary;

	public void Employee() {
	}

	public void input() {
		// Nhập liệu - Thu thập dữ liệu từ người dùng (Input)
		// Step 2: khởi tạo đối tượng từ class Scanner
		// : - yêu cầu theo dõi, thu thập dữ liệu từ luồng nhập liệu "System.in"
		Scanner sc = new Scanner(System.in);

		System.out.println("====== THONG TIN NHAN VIEN ======");
		System.out.print("Moi nhap id: ");
		this.id = sc.nextInt();
		if (sc.hasNextLine()) {
			sc.nextLine();
		}

		System.out.print("Moi nhap ten: ");
		this.firstName = sc.nextLine();

		System.out.print("Moi nhap ho + ten lot: ");
		this.lastName = sc.nextLine();

		System.out.print("Moi nhap gioi tinh (#1: Nam; #2: Nu; #3: Khong cong bo): ");
		this.gender = sc.nextByte();
		if (sc.hasNextLine()) {
			sc.nextLine();
		}

		String textInput;
		System.out.println("Moi nhap ngay sinh (dd/mm/yyyy): ");
		textInput = sc.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.birthDay = LocalDate.parse(textInput, formatter);

		System.out.print("Moi nhap muc luong/thang: ");
		this.salary = sc.nextDouble();
	}

	public void printInfo() {
		System.out.println("====== THONG TIN NHAN VIEN ======");
		System.out.printf("- Id: %d \n", id);
		System.out.printf("- Ho ten: %s %s \n", this.getTitle(), this.getFullName());
		System.out.printf("- Gioi tinh: %s \n", this.getGender());
		System.out.printf("- Ngay sinh: %td/%<tm/%<tY \n", this.birthDay);
		System.out.printf("- Muc luong/thang: %,.0f đ \n", this.salary);
		System.out.printf("- Muc luong/nam: %,.0f đ \n", this.getAnnualSalary());
	}

	public String getFullName() {
		return this.lastName + " " + this.firstName;
	}

	public String getTitle() {
		String title = "";
		LocalDate now = LocalDate.now();
		int age = Period.between(this.birthDay, now).getYears();
		switch (this.gender) {
		case 1:
			if (age <= 18) {
				title = "Mr";
			} else {
				title = "Sir";
			}
			break;
		case 2:
			if (age <= 18) {
				title = "Miss";
			} else {
				title = "Ms";
			}
			break;
		case 3:
			title = "Dear";
			break;
		default:
			break;
		}

		return title;
	}

	public double getAnnualSalary() {
		double annualSalary = this.salary * 12;
		return annualSalary;
	}

	public void upToSalary(float pPercent) {
		this.salary = this.salary + (this.salary * pPercent / 100);

		System.out.printf("Chuc mung! Ban da duoc tang luong len %.1f%% \n", pPercent);
		System.out.printf("Muc luong moi: %,.0f đ \n", this.salary);
	}

	/* GET/SET properties */
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	public String getGender() {
		String gioiTinh = "";
		switch (this.gender) {
		case 1:
			gioiTinh = "Nam";
			break;
		case 2:
			gioiTinh = "Nu";
			break;
		case 3:
			gioiTinh = "Khong cong bo";
			break;
		default:
			break;
		}
		return gioiTinh;
	}

	public void setGender(byte gender) {
		this.gender = gender;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
