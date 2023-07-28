package day22mar2023;

public class Runner {
	public static void main(String[] args) {
		
		Teacher T = new Teacher();
		T.name = "Rahul";
		T.subject = "Cricket";
		T.disp();
		
		System.out.println("--------\n-----");
		
		T.setName("Sushant");
		T.setSubject("Film");
		T.disp();
		System.out.println("----------\n-----");
		System.out.println(" ==> " + T.getName() + " : " + T.getSubject());
	}

}
