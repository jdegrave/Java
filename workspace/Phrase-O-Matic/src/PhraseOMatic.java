
public class PhraseOMatic {

	public static void main(String[] args) {
		// Create 3 strings of buzz words
		String [] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based", "pervasive", "smart", "six sigma", "critical-path", "dynamic"};
		String [] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered", "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};	
		String [] wordListThree = {"process", "tipping point", "solution", "architecture", "core-competency", "strategy", "mind-share", "portal 1", "space", "vision", "paradigm", "mission"};
		
		//Find the length of each string
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		//generate three random numbers - these will be used as indices for the three arrays
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		//build a bullshit phrase
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		
		//print the bullshit phrase
		System.out.println("What we need is a " + phrase + ".");
	}

}
