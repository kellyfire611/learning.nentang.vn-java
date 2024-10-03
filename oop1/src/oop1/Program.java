package oop1;

import java.time.LocalDate;

public class Program {

	public static void main(String[] args) {
		GiangVien gv1 = new GiangVien();
		gv1.hoten = "Cuong";
		gv1.tuoi = 35;
		gv1.gioi_tinh = true;
		gv1.so_thich = "nghe nhac, xem phim";
		gv1.ma_gv = "009629";
		gv1.ngay_cong_tac = LocalDate.parse("2024-09-27");
		gv1.he_so_luong = 3.3f;
		gv1.cham_bai();
		gv1.chao_hoi();

		SinhVien sv1 = new SinhVien();
		sv1.hoten = "Nguyen Van A";
		sv1.hoi_bai();
		sv1.chao_hoi();
	}

}
