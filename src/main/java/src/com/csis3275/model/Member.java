package src.com.csis3275.model;

import java.util.ArrayList;

public class Member {
	
	private String name;
	private int student_ID;
	private ArrayList <String> tasks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudent_ID() {
		return student_ID;
	}
	public void setStudent_ID(int student_ID) {
		this.student_ID = student_ID;
	}
	public ArrayList <String> getTasks() {
		
		return tasks;
	}
	public void setTasks(ArrayList <String> tasks) {
		this.tasks = tasks;
	}
	
	public String toString() {
		String st = "";
		for(String x : getTasks()) {
			st += "<li>" + x + "</li>";
		}
		return st;
	}
	

}
