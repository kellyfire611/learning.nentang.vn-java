package oop1;

import java.time.LocalDate;

public class GiangVien extends ConNguoi {
	public String ma_gv;
	public LocalDate ngay_cong_tac;
	public float he_so_luong;

	public void cham_bai() {
		System.out.printf("[%s] dang cham bai", this.hoten);
		this.so_thich = "aa";
	}

	public void tra_loi() {
		System.out.printf("[%s] dang tra loi", this.hoten);
	}
}
