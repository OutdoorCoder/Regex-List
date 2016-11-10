# Regex-List
A object that holds a list of regex's in the form of RegexStringChecker objects. 
Allows the user to check multiple regexs in a OO format.

Example:

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

//retsult: true
