package lab7_7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<BankAccount> lstTaiKhoan = new ArrayList<BankAccount>();
		String thaoTac = "";
		String keyword = "";
		BankAccount objFound = null;

		// Nhập dữ liệu test
		BankAccount acc1 = new BankAccount();
		acc1.setFirstName("Cuong");
		acc1.setLastName("Duong Nguyen Phu");
		acc1.setGender((byte) 1);
		acc1.setBirthDay(LocalDate.parse("1989-06-11"));
		acc1.setAccountNumber("011123456");
		acc1.setExpiredDate(LocalDate.parse("2024-12-31"));
		acc1.setBalance(1000000);
		lstTaiKhoan.add(acc1);

		BankAccount acc2 = new BankAccount();
		acc2.setFirstName("B");
		acc2.setLastName("Nguyen Thi");
		acc2.setGender((byte) 2);
		acc2.setBirthDay(LocalDate.parse("2001-08-27"));
		acc2.setAccountNumber("022233445566");
		acc2.setExpiredDate(LocalDate.parse("2024-12-31"));
		acc2.setBalance(600000);
		lstTaiKhoan.add(acc2);

		do {
			System.out.print("============== MENU CHUONG TRINH ================\n");
			System.out.print("+ 1. Them moi tai khoan.                        +\n");
			System.out.print("+ 2. Xem danh sach tai khoan.                   +\n");
			System.out.print("+ 3. Tim kiem tai khoan theo id, so tai khoan.  +\n");
			System.out.print("+ 4. Xoa tai khoan.                             +\n");
			System.out.print("+ 5. Cap nhat tai khoan.                        +\n");
			System.out.print("+ 6. Su dung tai khoan.                         +\n");
			System.out.print("+ 0. Thoat chuong trinh.                        +\n");
			System.out.print("=================================================\n");
			System.out.print("Moi ban chon: ");
			int luaChon = sc.nextInt();

			switch (luaChon) {
			case 1:
				System.out.print("== 1. Them moi tai khoan ==\n");
				BankAccount taikhoanMoi = new BankAccount();
				taikhoanMoi.input();

				lstTaiKhoan.add(taikhoanMoi);
				System.out.print("Da them tai khoan vao danh sach thanh cong!\n");

				if (sc.hasNextLine()) { // Ignore enter
					sc.nextLine();
				}
				System.out.print("Ban co muon thao tac them khong (Y/N)? ");
				thaoTac = sc.nextLine();
				break;
			case 2:
				System.out.print("== 2. Xem danh sach tai khoan ==\n");
				System.out.printf("- Tong so: %d \n", lstTaiKhoan.size());
				// vòng lặp foreach
				for (BankAccount acc : lstTaiKhoan) {
					acc.printInfo();
				}

				if (sc.hasNextLine()) { // Ignore enter
					sc.nextLine();
				}
				System.out.print("Ban co muon thao tac them khong (Y/N)? ");
				thaoTac = sc.nextLine();
				break;
			case 3:
				if (sc.hasNextLine()) { // Ignore enter
					sc.nextLine();
				}
				System.out.print("== 3. Tim kiem tai khoan theo id, so tai khoan ==\n");
				System.out.print("Moi ban nhap tu khoa tim kiem: ");
				keyword = sc.nextLine();
				objFound = null;
				// FOREACH
				for (BankAccount acc : lstTaiKhoan) {
					if (keyword.equalsIgnoreCase(Integer.toString(acc.getId()))) {
						objFound = acc;
					} else if (keyword.equalsIgnoreCase(acc.getAccountNumber())) {
						objFound = acc;
					}
				}

				if (objFound == null) {
					System.out.print("Xin loi, tim khong thay!\n");
				} else {
					System.out.print("Da tim thay thong tin...\n");
					objFound.printInfo();
				}

				if (sc.hasNextLine()) { // Ignore enter
					sc.nextLine();
				}
				System.out.print("Ban co muon thao tac them khong (Y/N)? ");
				thaoTac = sc.nextLine();
				break;
			case 4:
				if (sc.hasNextLine()) { // Ignore enter
					sc.nextLine();
				}
				System.out.print("== 4. Xoa tai khoan ==\n");
				System.out.print("Moi ban nhap tu khoa tim kiem tai khoan muon xoa: ");
				keyword = sc.nextLine();
				objFound = null;
				// FOREACH
				for (BankAccount acc : lstTaiKhoan) {
					if (keyword.equalsIgnoreCase(Integer.toString(acc.getId()))) {
						objFound = acc;
					} else if (keyword.equalsIgnoreCase(acc.getAccountNumber())) {
						objFound = acc;
					}
				}

				if (objFound == null) {
					System.out.print("Xin loi, tim khong thay tai khoan de xoa!\n");
				} else {
					System.out.print("Da tim thay thong tin tai khoan can xoa...\n");
					lstTaiKhoan.remove(objFound);
					System.out.print("Da xoa thanh cong !!!\n");
				}

				if (sc.hasNextLine()) { // Ignore enter
					sc.nextLine();
				}
				System.out.print("Ban co muon thao tac them khong (Y/N)? ");
				thaoTac = sc.nextLine();
				break;
			case 5:
				if (sc.hasNextLine()) { // Ignore enter
					sc.nextLine();
				}
				System.out.print("== 5. Cap nhat tai khoan ==\n");
				System.out.print("Moi ban nhap tu khoa tim kiem tai khoan muon cap nhat: ");
				keyword = sc.nextLine();
				objFound = null;
				// FOREACH
				for (BankAccount acc : lstTaiKhoan) {
					if (keyword.equalsIgnoreCase(Integer.toString(acc.getId()))) {
						objFound = acc;
					} else if (keyword.equalsIgnoreCase(acc.getAccountNumber())) {
						objFound = acc;
					}
				}

				if (objFound == null) {
					System.out.print("Xin loi, tim khong thay tai khoan de cap nhat!\n");
				} else {
					System.out.print("Da tim thay thong tin tai khoan can cap nhat...\n");
					objFound.update();
					System.out.print("Da cap nhat thanh cong !!!\n");
				}

				if (sc.hasNextLine()) { // Ignore enter
					sc.nextLine();
				}
				System.out.print("Ban co muon thao tac them khong (Y/N)? ");
				thaoTac = sc.nextLine();
				break;
			case 6:
				if (sc.hasNextLine()) { // Ignore enter
					sc.nextLine();
				}
				System.out.print("== 6. Su dung tai khoan ==\n");
				System.out.print("Moi ban nhap tu khoa tim kiem tai khoan muon su dung: ");
				keyword = sc.nextLine();
				objFound = null;
				// FOREACH
				for (BankAccount acc : lstTaiKhoan) {
					if (keyword.equalsIgnoreCase(Integer.toString(acc.getId()))) {
						objFound = acc;
					} else if (keyword.equalsIgnoreCase(acc.getAccountNumber())) {
						objFound = acc;
					}
				}

				if (objFound == null) {
					System.out.print("Xin loi, tim khong thay tai khoan de su dung!\n");
				} else {
					System.out.print("Da tim thay thong tin tai khoan can su dung...\n");
					String thaoTacCon = "";
					do {
						System.out.print("============== MENU ATM ================\n");
						System.out.print("1. Kiem tra tai khoan\n");
						System.out.print("2. Nap tien vao tai khoan\n");
						System.out.print("3. Rut tien khoi tai khoan\n");
						System.out.print("4. Chuyen tien den tai khoan\n");
						System.out.print("0. Quay ve menu chinh\n");
						System.out.print("Moi ban chon: ");
						int luaChonMenuCon = sc.nextInt();
						switch (luaChonMenuCon) {
						case 1:
							objFound.balanceChecking();
							break;
						case 2:
							System.out.print("Moi ban nhap so tien muon gui: ");
							double amtDeposit = sc.nextDouble();
							objFound.deposit(amtDeposit);
							break;
						case 3:
							System.out.print("Moi ban nhap so tien muon rut: ");
							double amtWithdraw = sc.nextDouble();
							objFound.withdraw(amtWithdraw);
							break;
						case 4:
							// In ra danh sách tài khoản muốn chuyển đến
							System.out.print("== Danh sach tai khoan dich ==\n");
							for (BankAccount acc : lstTaiKhoan) {
								// Bỏ qua tài khoản đang sử dụng
								if (acc.getId() == objFound.getId()) {
									continue;
								}

								// In ra thông tin
								System.out.printf("[id: %s], acc: %s\n", acc.getId(), acc.getAccountNumber());
							}
							if (sc.hasNextLine()) { // Ignore enter
								sc.nextLine();
							}
							System.out.print("Moi ban chon tai khoan muon chuyen: ");
							int idTaiKhoanDich = sc.nextInt();
							BankAccount objTaiKhoanDich = null;
							for (BankAccount acc : lstTaiKhoan) {
								if (idTaiKhoanDich == acc.getId()) {
									objTaiKhoanDich = acc;
								}
							}

							if (objTaiKhoanDich == null) {
								System.out.print("Tai khoan dich khong tim thay!!!\n");
							} else {
								System.out.print("Moi ban nhap so tien muon chuyen: ");
								double amtTransfer = sc.nextDouble();
								objFound.transferTo(objTaiKhoanDich, amtTransfer);
							}

							break;
						case 0:
							System.out.print("Cam on da su dung dich vu...");
							break;
						}

						if (sc.hasNextLine()) { // Ignore enter
							sc.nextLine();
						}
						System.out.print("Ban co muon thao tac menu con them khong (Y/N)? ");
						thaoTacCon = sc.nextLine();

					} while (!thaoTacCon.equalsIgnoreCase("N"));

					System.out.print("Da su dung XONG !!!\n");
				}

				if (sc.hasNextLine()) { // Ignore enter
					sc.nextLine();
				}
				System.out.print("Ban co muon thao tac them khong (Y/N)? ");
				thaoTac = sc.nextLine();

				break;
			case 0:
				break;
			default:
				System.out.print("Vui long chon tu 0-6.");
				break;
			}
		} while (thaoTac.equalsIgnoreCase("N") == false);
	}

}
