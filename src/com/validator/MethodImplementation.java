package com.validator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Stack;

public class MethodImplementation implements MethodsInterface{

	
	public void checkCapitalLetterofClassName(String word) throws NameFormatException
	{
		
		// TODO Auto-generated method stub
		if(Character.isLowerCase(word.charAt(0)))
			{
			 throw new NameFormatException("Plese change class name start with capital letter");
			}
		
		
	}
	

	
	public void checkParanthesis(String s) throws UnbalancedParanthesisException {
		Stack<Character> st = new Stack<>();
		
		 for(int i=0;i<s.length();i++)
	        {
	            if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='(') {
	                st.push(s.charAt(i));
	            }
	            else if(!st.empty() && ((s.charAt(i)==']'&& st.peek()=='[')||(s.charAt(i)=='}'&& st.peek()=='{')||(s.charAt(i)==')'&& st.peek()=='(')))
	        {
	                 st.pop();

	        } else {
	             st.push(s.charAt(i));
	        }
	    }
	    
	    if(! st.empty() ) {
	    	throw new UnbalancedParanthesisException("Please Check for balanced Paranthesis");
	    	
	    }
		
		
	}





	public void CheckFileName(String string, File f) throws NameFormatException {
		// TODO Auto-generated method stub
		if(!(f.getName()==string))
		{
			
		throw new NameFormatException("Make sure file name matches with class name");	    }
		
		
	}



	public void writefile(File f, String words) throws IOException {
		
		// TODO Auto-generated method stub
		try {
		BufferedWriter bf = new BufferedWriter(new FileWriter("C:\\Users\\Vandana\\Desktop\\Gitprac\\Example.txt"));
		bf.write(words);
		bf.close();
		}
		catch(Exception e)
		{
			
		}
		
	}



	


	

	
}
