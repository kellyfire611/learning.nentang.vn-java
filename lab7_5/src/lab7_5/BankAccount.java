package lab7_5;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BankAccount {
	private static int AUTO_NUMBER = 1;

	private int id;
	private String firstName;
	private String lastName;
	private byte gender; // #1: Nam; #2: Nữ; #3: Không công bố
	private LocalDate birthDay;
	private String accountNumber;
	private LocalDate expiredDate;
	private double balance;

	public BankAccount() {
		this.id = BankAccount.AUTO_NUMBER;
		BankAccount.AUTO_NUMBER++;
	}

	public String getFullName() {
		return this.lastName + " " + this.firstName;
	}

	public String getTitle() {
		String title = "";
		// Tính tuổi: hiện tại (now) - ngày sinh (birthDay)
		LocalDate now = LocalDate.now();
		int age = Period.between(this.birthDay, now).getYears();

		switch (this.gender) {
		case 1: // Nam
			if (age <= 35) {
				title = "Mr";
			} else {
				title = "Sir";
			}
			break;
		case 2: // Nữ
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

	public void balanceChecking() {
		System.out.printf("So du tai khoan [%s]: %,.0f đ\n", this.accountNumber, this.balance);
	}

	public void deposit(double pMoney) {
		System.out.printf("[%s] DEPOSIT \n", this.accountNumber);
		this.balance += pMoney;
		System.out.printf("Giao dich: + %,.0f đ\n", pMoney);
		this.balanceChecking();
	}

	public void withdraw(double pMoney) {
		System.out.printf("[%s] WITHDRAW \n", this.accountNumber);
		// Rule 1: không thể rút quá số tiền trong tài khoản
		if (pMoney > this.balance) {
			System.out.println("So du tai khoan khong du de rut...");
			return;
		}

		// Okey
		this.balance -= pMoney;
		System.out.printf("Giao dich: - %,.0f đ\n", pMoney);
		this.balanceChecking();
	}

	public void transferTo(BankAccount pAccount, double pMoney) {
		System.out.printf("[%s] TRANSFER \n", this.accountNumber);
		// Rule 1: không thể rút quá số tiền trong tài khoản
		if (pMoney > this.balance) {
			System.out.println("So du tai khoan khong du de chuyen...");
			return;
		}

		// Tài khoản hiện tại
		this.balance -= pMoney;
		System.out.printf("Giao dich: - %,.0f đ\n", pMoney);
		this.balanceChecking();

		// Tài khoản nhận được tiền (đích)
		pAccount.deposit(pMoney);
	}

	public void printInfo() {
		System.out.printf("======== Account Info ========\n");
		System.out.printf("- Id: %d \n", this.id);
		System.out.printf("- Fullname: %s %s \n", this.getTitle(), this.getFullName());
		switch (this.gender) {
		case 1: // Nam
			System.out.printf("- Gender: %s \n", "Nam");
			break;
		case 2: // Nữ
			System.out.printf("- Gender: %s \n", "Nu");
			break;
		case 3:
			System.out.printf("- Gender: %s \n", "Unknown");
			break;
		default:
			System.out.printf("- Gender: %s \n", "N/A");
			break;
		}
		System.out.printf("- Birthday: %td/%<tm/%<tY \n", this.birthDay);
		System.out.printf("- Account number: %s \n", this.accountNumber);
		System.out.printf("- Expired date: %td/%<tm/%<tY \n", this.expiredDate);
		System.out.printf("- Balance: %,.0f \n", this.balance);
		System.out.printf("==============================\n");
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("========= INPUT =========\n");
		System.out.print("- First Name: ");
		this.firstName = sc.nextLine();

		System.out.print("- Last Name: ");
		this.firstName = sc.nextLine();

		System.out.print("- Gender (1: Nam; 2: Nu; 3: Khong): ");
		this.gender = sc.nextByte();
		if (sc.hasNextLine()) {
			sc.nextLine();
		}

		String text = "";
		System.out.print("- Birthday (dd/MM/yyyy): ");
		text = sc.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.birthDay = LocalDate.parse(text, formatter);

		System.out.print("- Account number: ");
		this.accountNumber = sc.nextLine();

//		System.out.print("- Expired date (dd/MM/yyyy): ");
//		text = sc.nextLine();
//		this.expiredDate = LocalDate.parse(text, formatter);
		this.expiredDate = LocalDate.now().plusYears(2);

		System.out.print("- Amount : ");
		this.balance = sc.nextDouble();

		System.out.printf("=========================\n");
	}

	// GET/SET properties
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public LocalDate getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(LocalDate expiredDate) {
		this.expiredDate = expiredDate;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	public byte getGender() {
		return gender;
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

}
