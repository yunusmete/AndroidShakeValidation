package com.mete.yunus.shakevalidate;

import com.mete.yunus.shakevalidate.component.ValidationEditText.Validator;



public class EmailValidator implements Validator{

	@Override
	public boolean validate(String s) {
		// TODO Auto-generated method stub
		if (s.contains("@")) {
			return true;
		}
		return false;
	}



}
