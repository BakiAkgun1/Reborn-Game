package reborn;

public class Discoverer implements humans{
  public void child() {
	  System.out.println("when you child you want travel to earth and discover herbs,trees and animals. You were curious. you earned 25 points");
  }
	@Override
	public void adult() {
		  System.out.println("You become adult now and you are 35 years old. Your curiosity took you to new mountains, oceans , forests and animals.\n"
		  		+ "you learned many thing about life. You began writing a book about your experiances. you earned 50 points.");
		
	}

	@Override
	public void death() {
		  System.out.println("You finished your life book before you die. When you die, you were 67 years old. \n"
		  		+ "You could live more than normal people through discovered herbs. Humanity developed through your book. you earned 75 points. Congratulations.");
		
	}

}
