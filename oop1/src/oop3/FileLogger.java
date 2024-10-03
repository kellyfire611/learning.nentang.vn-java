package oop3;

public class FileLogger implements ILogger {
	@Override
	public void WriteLog() {
		System.out.println("Write log...");
	}

	@Override
	public void DeleteLog() {
		System.out.println("Delete log...");
	}

	@Override
	public void SearchLog() {
		System.out.println("Search log...");
	}
}
