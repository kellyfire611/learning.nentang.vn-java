package oop1;

public class ConNguoi {
	public String cccd;
	public String hoten;
	public int tuoi;
	public boolean gioi_tinh;
	float chieu_cao;
	private float can_nang;
	protected String so_thich;

	// Overloading
	public void chao_hoi() {
		System.out.println("Xin chao \n");
	}

	public void chao_hoi(String tenNguoi) {
		System.out.printf("Xin chao %s \n", tenNguoi);
	}

	public void chao_hoi(String tenNguoi1, String tenNguoi2) {
		System.out.printf("Xin chao %s %s \n", tenNguoi1, tenNguoi2);
	}

	public void chay_nhay() {
		System.out.println("Chay nhay");
	}
}
