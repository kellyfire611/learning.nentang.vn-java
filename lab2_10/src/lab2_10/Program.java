package lab2_10;

//Step 1: import thư viện Scanner
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Nhập liệu - Thu thập dữ liệu từ người dùng (Input)
		// Step 2: khởi tạo đối tượng từ class Scanner
		// : - yêu cầu theo dõi, thu thập dữ liệu từ luồng nhập liệu "System.in"
		Scanner sc = new Scanner(System.in);

		// Input
		System.out.print("Moi nhap so dien tieu thu: ");
		int soKwh = sc.nextInt();

		// Tính toán
		int maxBac1 = 50;
		int maxBac2 = 100;
		int maxBac3 = 200;
		int maxBac4 = 300;
		int maxBac5 = 400;
		int maxBac6 = 99999;

		float giaTienBac1 = 1678;
		float giaTienBac2 = 1734;
		float giaTienBac3 = 2014;
		float giaTienBac4 = 2536;
		float giaTienBac5 = 2834;
		float giaTienBac6 = 2927;

		float tongTienDien = 0;
		float thanhTienBac1, thanhTienBac2, thanhTienBac3, thanhTienBac4, thanhTienBac5, thanhTienBac6;
		int soKwhConLai;

		// Tính toán số bậc tiêu thụ
		int soBacTieuThu = 0;
		if (soKwh >= 0 && soKwh <= maxBac1) {
			soBacTieuThu = 1;
		} else if (soKwh > maxBac1 && soKwh <= maxBac2) {
			soBacTieuThu = 2;
		} else if (soKwh > maxBac2 && soKwh <= maxBac3) {
			soBacTieuThu = 3;
		} else if (soKwh > maxBac3 && soKwh <= maxBac4) {
			soBacTieuThu = 4;
		} else if (soKwh > maxBac4 && soKwh <= maxBac5) {
			soBacTieuThu = 5;
		} else if (soKwh > maxBac5 && soKwh <= maxBac6) {
			soBacTieuThu = 6;
		} else {
			soBacTieuThu = 0;
		}

		// Tính toán giá tiền
		if (soBacTieuThu == 1) {
			thanhTienBac1 = soKwh * giaTienBac1;
			System.out.printf("Bac 1: %d kwh x %,.0f đ = %,.0f đ \n", soKwh, giaTienBac1, thanhTienBac1);
			tongTienDien += thanhTienBac1;
		} else if (soBacTieuThu == 2) {
			// In tiền bậc 1
			thanhTienBac1 = maxBac1 * giaTienBac1;
			System.out.printf("Bac 1: %d kwh x %,.0f đ = %,.0f đ \n", maxBac1, giaTienBac1, thanhTienBac1);
			tongTienDien += thanhTienBac1;
			soKwhConLai = soKwh - maxBac1;

			// In tiền bậc 2
			thanhTienBac2 = soKwhConLai * giaTienBac2;
			System.out.printf("Bac 2: %d kwh x %,.0f đ = %,.0f đ \n", soKwhConLai, giaTienBac2, thanhTienBac2);
			tongTienDien += thanhTienBac2;
		} else if (soBacTieuThu == 3) {
			// In tiền bậc 1
			thanhTienBac1 = maxBac1 * giaTienBac1;
			System.out.printf("Bac 1: %d kwh x %,.0f đ = %,.0f đ \n", maxBac1, giaTienBac1, thanhTienBac1);
			tongTienDien += thanhTienBac1;
			soKwhConLai = soKwh - maxBac1;

			// In tiền bậc 2
			thanhTienBac2 = (maxBac2 - maxBac1) * giaTienBac2;
			System.out.printf("Bac 2: %d kwh x %,.0f đ = %,.0f đ \n", (maxBac2 - maxBac1), giaTienBac2, thanhTienBac2);
			tongTienDien += thanhTienBac2;
			soKwhConLai -= (maxBac2 - maxBac1);

			// In tiền bậc 3
			thanhTienBac3 = soKwhConLai * giaTienBac3;
			System.out.printf("Bac 3: %d kwh x %,.0f đ = %,.0f đ \n", soKwhConLai, giaTienBac3, thanhTienBac3);
			tongTienDien += thanhTienBac3;
		} else if (soBacTieuThu == 4) {
			// In tiền bậc 1
			thanhTienBac1 = maxBac1 * giaTienBac1;
			System.out.printf("Bac 1: %d kwh x %,.0f đ = %,.0f đ \n", maxBac1, giaTienBac1, thanhTienBac1);
			tongTienDien += thanhTienBac1;
			soKwhConLai = soKwh - maxBac1;

			// In tiền bậc 2
			thanhTienBac2 = (maxBac2 - maxBac1) * giaTienBac2;
			System.out.printf("Bac 2: %d kwh x %,.0f đ = %,.0f đ \n", (maxBac2 - maxBac1), giaTienBac2, thanhTienBac2);
			tongTienDien += thanhTienBac2;
			soKwhConLai -= (maxBac2 - maxBac1);

			// In tiền bậc 3
			thanhTienBac3 = (maxBac3 - maxBac2) * giaTienBac3;
			System.out.printf("Bac 3: %d kwh x %,.0f đ = %,.0f đ \n", (maxBac3 - maxBac2), giaTienBac3, thanhTienBac3);
			tongTienDien += thanhTienBac3;
			soKwhConLai -= (maxBac3 - maxBac2);

			// In tiền bậc 4
			thanhTienBac4 = soKwhConLai * giaTienBac4;
			System.out.printf("Bac 4: %d kwh x %,.0f đ = %,.0f đ \n", soKwhConLai, giaTienBac4, thanhTienBac4);
			tongTienDien += thanhTienBac4;
		} else if (soBacTieuThu == 5) {
			// In tiền bậc 1
			thanhTienBac1 = maxBac1 * giaTienBac1;
			System.out.printf("Bac 1: %d kwh x %,.0f đ = %,.0f đ \n", maxBac1, giaTienBac1, thanhTienBac1);
			tongTienDien += thanhTienBac1;
			soKwhConLai = soKwh - maxBac1;

			// In tiền bậc 2
			thanhTienBac2 = (maxBac2 - maxBac1) * giaTienBac2;
			System.out.printf("Bac 2: %d kwh x %,.0f đ = %,.0f đ \n", (maxBac2 - maxBac1), giaTienBac2, thanhTienBac2);
			tongTienDien += thanhTienBac2;
			soKwhConLai -= (maxBac2 - maxBac1);

			// In tiền bậc 3
			thanhTienBac3 = (maxBac3 - maxBac2) * giaTienBac3;
			System.out.printf("Bac 3: %d kwh x %,.0f đ = %,.0f đ \n", (maxBac3 - maxBac2), giaTienBac3, thanhTienBac3);
			tongTienDien += thanhTienBac3;
			soKwhConLai -= (maxBac3 - maxBac2);

			// In tiền bậc 4
			thanhTienBac4 = (maxBac4 - maxBac3) * giaTienBac4;
			System.out.printf("Bac 4: %d kwh x %,.0f đ = %,.0f đ \n", (maxBac4 - maxBac3), giaTienBac4, thanhTienBac4);
			tongTienDien += thanhTienBac4;
			soKwhConLai -= (maxBac4 - maxBac3);

			// In tiền bậc 5
			thanhTienBac5 = soKwhConLai * giaTienBac5;
			System.out.printf("Bac 5: %d kwh x %,.0f đ = %,.0f đ \n", soKwhConLai, giaTienBac5, thanhTienBac5);
			tongTienDien += thanhTienBac5;
		} else if (soBacTieuThu == 6) {
			// In tiền bậc 1
			thanhTienBac1 = maxBac1 * giaTienBac1;
			System.out.printf("Bac 1: %d kwh x %,.0f đ = %,.0f đ \n", maxBac1, giaTienBac1, thanhTienBac1);
			tongTienDien += thanhTienBac1;
			soKwhConLai = soKwh - maxBac1;

			// In tiền bậc 2
			thanhTienBac2 = (maxBac2 - maxBac1) * giaTienBac2;
			System.out.printf("Bac 2: %d kwh x %,.0f đ = %,.0f đ \n", (maxBac2 - maxBac1), giaTienBac2, thanhTienBac2);
			tongTienDien += thanhTienBac2;
			soKwhConLai -= (maxBac2 - maxBac1);

			// In tiền bậc 3
			thanhTienBac3 = (maxBac3 - maxBac2) * giaTienBac3;
			System.out.printf("Bac 3: %d kwh x %,.0f đ = %,.0f đ \n", (maxBac3 - maxBac2), giaTienBac3, thanhTienBac3);
			tongTienDien += thanhTienBac3;
			soKwhConLai -= (maxBac3 - maxBac2);

			// In tiền bậc 4
			thanhTienBac4 = (maxBac4 - maxBac3) * giaTienBac4;
			System.out.printf("Bac 4: %d kwh x %,.0f đ = %,.0f đ \n", (maxBac4 - maxBac3), giaTienBac4, thanhTienBac4);
			tongTienDien += thanhTienBac4;
			soKwhConLai -= (maxBac4 - maxBac3);

			// In tiền bậc 5
			thanhTienBac5 = (maxBac5 - maxBac4) * giaTienBac5;
			System.out.printf("Bac 5: %d kwh x %,.0f đ = %,.0f đ \n", (maxBac5 - maxBac4), giaTienBac5, thanhTienBac5);
			tongTienDien += thanhTienBac5;
			soKwhConLai -= (maxBac5 - maxBac4);

			// In tiền bậc 6
			thanhTienBac6 = soKwhConLai * giaTienBac6;
			System.out.printf("Bac 6: %d kwh x %,.0f đ = %,.0f đ \n", soKwhConLai, giaTienBac6, thanhTienBac6);
			tongTienDien += thanhTienBac6;
		}

		// Output
		System.out.printf("---------------------\n");
		System.out.printf("Tong so dien tieu thu: %d kWh \n", soKwh);
		System.out.printf("Ban dang su dung dien toi bac: %d \n", soBacTieuThu);
		System.out.printf("Tong so tien dien ban can chi tra: %,.0f đ", tongTienDien);
	}

}
