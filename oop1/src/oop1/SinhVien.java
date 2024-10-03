package oop1;

public class SinhVien extends ConNguoi {
	public String ma_sv;
	public float diem_thi_lt;
	public float diem_thi_th;

	@Override
	public void chao_hoi() {
		super.chao_hoi();

		// Tự xử lý trong hàm con
		System.out.println("Tu sinh vien chao theo kieu #");
	}

	public void lam_bai_thi() {
		System.out.printf("[%s] dang lam bai", this.hoten);
	}

	public void hoi_bai() {
		System.out.printf("[%s] dang hoi bai", this.hoten);
	}
}
