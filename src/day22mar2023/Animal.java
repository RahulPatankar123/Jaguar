package day22mar2023;
public class Animal {
	String Catagory;
	float height;
	boolean Vegetarian;
	String Shelter;
	void Show()
	{
		System.out.println("Catagory :" + Catagory + " Height: " + height + "Vegetarian : " + Vegetarian + " Shelter : " + Shelter);
	}
	public static void main(String[]args) {
		Animal A = new Animal();
		Tiger T = new Tiger();
		
		
		A.Catagory= "wild animal";
		A.height= 4.5f;
		A.Shelter= "Cave";
		A.Vegetarian= false;
		A.Show();
		
		T.name = "jagwar";
		T.color = "black";
		T.Runningspeed  = 50.6f;
		
		T.disp();
	}

	
	
	
	
	
	
	

}