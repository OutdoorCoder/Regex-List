import regexObjectPackage.*;

public class Tester {
	
	public static void main(String[]args){
		RegexList regexList = new RegexList();
		
		regexList.add(new DateRegex());
		regexList.add(new HasDigitRegex());
		
		String date = "03/29/1995";
		
		System.out.println(regexList.checkRegexs(date));
	}
}
