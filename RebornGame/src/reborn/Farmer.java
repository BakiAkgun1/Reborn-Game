package reborn;

public  class Farmer  implements humans{


	@Override
	public void adult() {
		System.out.println("You are 30 years old now. Your most of brothers and sisters died. Always you eat same food. Your teeth decayed. In short you ill. You earned 5 points "
				+ "Do you want change your life? yes or no ");
		
	}

	@Override
	public void death() {
		System.out.println("You death when you 37 years old as farmer. Your life was very difficult. You married and you had 3 children but all of them died with your wife."
				+ "You earned 10 points");
		System.out.println("Do you want reborn? yes or no");
		
	}

	@Override
	public void child() {
		// TODO Auto-generated method stub
		
	}

}
