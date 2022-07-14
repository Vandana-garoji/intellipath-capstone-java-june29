package com.validator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Stack;


public class ValidateFile
{
	
	
	
	
	public void main(String[] args) throws IOException
	{
	   File f=new File("C:\\Users\\Vandana\\Desktop\\Gitprac\\ValidateFile.java");
	   f.createNewFile();
		System.out.println("hello");
		HashSet<String > keyword=new HashSet<>();
		keyword.add("class");keyword.add("null");keyword.add("do");keyword.add("if");keyword.add("throw");keyword.add("else");keyword.add("import");keyword.add("public");keyword.add("private");
		keyword.add("static");keyword.add("return");keyword.add("static");keyword.add("void");keyword.add("super");keyword.add("while");
		keyword.add("String");keyword.add("float");keyword.add("int");keyword.add("try");keyword.add("catch");keyword.add("else");
		keyword.add("interface");keyword.add("long");keyword.add("package");keyword.add("abstract");keyword.add("for");
		keyword.add("switch");keyword.add("case");keyword.add("float");keyword.add("extends");keyword.add("main");keyword.add("do");
		
        FileWriter fw= new FileWriter("C:\\Users\\Vandana\\Desktop\\Gitprac\\ValidateFile.java");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		
		
		String str="public static void main() { int var;}";
		
		String[] words = null;
		
		
		MethodImplementation obj =new MethodImplementation();
		
		try
		{
			
			while((str=br.readLine())!=null)
			{
				 words =str.split("\\s");
				 
				
				
				
			}
			
			String temp="";
			String paranthesis = null;
			
			int i=0;
			for( String s:words)
			{
				i=i+1;
				if(s=="{" || s=="}")
				{
					paranthesis=paranthesis+s;
				}
				
				for(String k:keyword)
				{    
					if(s=="class")
					{   
						obj.CheckFileName(words[i], f);
						obj.checkCapitalLetterofClassName(words[i]);
					}
					if(s==k)
					{  
						
						temp=k;
						break;
						
					}
					else if(temp== "int" || temp=="float" || temp=="long"|| temp== "double" ||temp== "" ||temp== "char" || temp== "String")
					{
						break;
					}
					
					
					
				}
			}
			
			obj.checkParanthesis(paranthesis);
			
			
			
			
			
		}
		
		catch(UnbalancedParanthesisException e)
		{
			System.out.println(e);
		}
		
		
		
		catch(NameFormatException e)
		{
			System.out.println(e);
		}
		
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		//BufferedWriter bf = new BufferedWriter(new FileWriter("C:\\Users\\Vandana\\Desktop\\Gitprac\\Example.txt"));
		
		
		obj.writefile(f,str);
		
		
		
	}

}
