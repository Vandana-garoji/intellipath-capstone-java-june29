package com.validator;

import java.io.File;

public interface MethodsInterface {
	
	void checkParanthesis(String s) throws UnbalancedParanthesisException;

	 void checkCapitalLetterofClassName(String word) throws NameFormatException;
	 void CheckFileName(String string, File f) throws NameFormatException;
}
