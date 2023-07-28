package day22mar2023;

public class Teacher {

	String name;
	String subject;
	{
		System.out.println("Teacher () constructor calling");
		
	}
	void disp()
	{
		System.out.println(name + " : " + subject);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	}
