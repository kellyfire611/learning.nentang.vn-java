package lab1_3;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class HelloWorld {
	// Hàm "main" (as an entry point): hàm khởi chạy đầu tiên của hệ thống
	// https://nentang.vn/wp-content/uploads/2024/09/hoa_don_gtgt_vi_du_da_phan_tich.png
	public static void main(String[] args) {
		// Khởi tạo các biến (variables)
		// Thông tin Hóa đơn
		String hoadon_kyhieu = "1K22NTHĐ";
		String hoadon_so = "00000063";
		LocalDate hoadon_ngaylap = LocalDate.parse("2024-05-19");

		// Thông tin Bán hàng
		String hoadon_banhang_donvi = "CÔNG TY NỀN TẢNG";
		String hoadon_banhang_mst = "0123548799-999";
		String hoadon_banhang_diachi = "123 Lý Tự Trọng, Quận Ninh Kiều, Thành phố Cần Thơ";
		String hoadon_banhang_dienthoai = "0915659223";
		String hoadon_banhang_sotaikhoan = "0111222334445555";

		// Thông tin Mua hàng
		String hoadon_muahang_hoten = "Dương Nguyễn Phú Cường";
		String hoadon_muahang_mst = "0487598258-888";
		String hoadon_muahang_diachi = "987 Trần Duy Hưng, Phường Trung Hòa, Quận Cầu Giấy, Thành phố Hà Nội, Việt Nam";
		String hoadon_muahang_httt = "TM/CK"; // Tiền mặt/Chuyển khoản
		String hoadon_muahang_sotaikhoan = "";

		// Java 8+
		LocalDateTime ngay_sinh = LocalDateTime.parse("1999-12-10T00:00:00");

		// In ra màn hình
		// https://www.w3schools.com/java/ref_string_format.asp
	}
}
