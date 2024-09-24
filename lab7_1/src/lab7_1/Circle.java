package lab7_1;

public class Circle {
	// Bao đóng (Encapsulation) / Che giấu thông tin (Information hiding)
	// các thuộc tính "radius" và "color"
	private double radius;
	private String color;

	// Chỉ có cách truy xuất thông tin thông qua các hàm get***() và set***()
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
