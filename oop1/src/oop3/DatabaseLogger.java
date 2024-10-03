package oop3;

public class DatabaseLogger implements ILogger {

	@Override
	public void WriteLog() {
		System.out.println("Write log to db...");
	}

	@Override
	public void DeleteLog() {
		System.out.println("Delete log from db...");
	}

	@Override
	public void SearchLog() {
		System.out.println("Search log from db...");
	}

}
