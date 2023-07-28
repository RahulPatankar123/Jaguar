package day22mar2023;

public class student extends Teacher{
	String Name;
	int rollno;
	
	student()
	{
		super();
		System.out.println("------\n======");
		System.out.println(" student1 () constructor called ");
	}
	void show()
	{
		System.out.println(name + " : " + rollno);
		
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	}
	


