package reborn;

public class Trader extends Farmer implements humans {


	@Override
	public void adult() {
		System.out.println(" You are 25 years old as trader. You earned good moneys and maybe you can be rich. you always sells irons to blacksmiths. you earned 20 points.");
		System.out.println("Do you want change your life? yes or no");
	}

	@Override
	public void death() {
		System.out.println("You died when you 72 years old as rich trader. Your life was good. You ate good food and when you ill, you could go to healer. You earned 80 points");

		System.out.println("Do you want reborn? yes or no");

	}

	@Override
	public void child() {
		// TODO Auto-generated method stub
		
	}

}
