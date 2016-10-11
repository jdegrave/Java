
public class CountAndPrint {
	
/**	Public class Count And Print performs the Hong Saw calculations as follows:
 * Any number divisible by 3, it appends the word "Hong"to the results string
 * Any number divisible by 5, it appends the word "Saw" to the results string
 * Any number divisible by 3 and 5, it appends the word "Hong Saw" to the results string.
 * If the number is divisible neither 3 nor 5, it appends the value of the number to the results string.
 * 
 * @author Jodi A DeGrave
 * @version 1.0.0
 * @param  there are several constructors which initialize the starting and end numbers for a CountAndPrint object
 * @returns A String containing the results of the calculations
 */
	
	
	private int StartNum;
	private int EndNum;
	private String Hong = "Hong";
	private String Saw = "Saw";
	private String HongSaw = "Hong Saw";
	
	//This is a constructor
	CountAndPrint(){
		//
	}
	
	CountAndPrint(int NumberStart, int NumberEnd){
		 StartNum = NumberStart;
		 EndNum = NumberEnd;
		
	}
	
	public void setStartNum(int value){
		StartNum = value; 
	}
	
	public int getStartNum(){
		return StartNum; 
	}
	
	
	
	public void setEndNum(int value){
		EndNum = value; 
	}
	
	public int getEndNum(){
		return EndNum; 
	}
	
	String getResult (){
	
			String FinalOutput = "";
			
			for (int i = StartNum; i <= EndNum; i++){
				if (((i % 3) == 0) & ((i % 5) == 0))
					FinalOutput = FinalOutput + " " + HongSaw; 
				else if ((i % 3) == 0)
					FinalOutput = FinalOutput + " " + Hong;
				else if ((i % 5) == 0) 
					FinalOutput = FinalOutput + " " + Saw;
				else 
					FinalOutput = FinalOutput + " " + i;
			
				if (i != EndNum)
					FinalOutput = FinalOutput + ", ";
			}
			
			return FinalOutput;
		
}


}
