package oop3;

public class Program {

	public static void main(String[] args) {
		ILogger logger;
		// Tuy theo lua chon người dùng
		logger = new FileLogger();
		logger.WriteLog();
		logger.SearchLog();
		logger.DeleteLog();
		// Chuyển đổi sang class khác
		logger = new DatabaseLogger();
		logger.WriteLog();
		// Chuuyển đổi sang log email
		logger = new EmailLogger();
		logger.WriteLog();
		logger.DeleteLog();

		Animal a2 = new Dog();
		a2.speak();

		Animal a3 = new Cat();
		a3.speak();

		Animal a4 = new Cow();
		a4.speak();
	}

}
