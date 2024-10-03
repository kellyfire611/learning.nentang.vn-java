package oop3;

public class EmailLogger implements ILogger {
	@Override
	public void WriteLog() {
		System.out.println("Write log to email...");
	}

	@Override
	public void DeleteLog() {
		System.out.println("Delete log to email...");
	}

	@Override
	public void SearchLog() {
		System.out.println("Search log from email...");
	}
}
