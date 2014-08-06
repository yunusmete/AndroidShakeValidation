package com.mete.yunus.shakevalidate;

import com.mete.yunus.shakevalidate.component.ValidationEditText.Validator;

public class IdValidator implements Validator{

	@Override
	public boolean validate(String s) {
		// TODO Auto-generated method stub
		
		if(s.length() < 4 || !(s.matches(".*\\d.*")) ){
			return false;
		}
		return true;
	}

}
