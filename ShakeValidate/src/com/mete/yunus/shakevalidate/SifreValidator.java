package com.mete.yunus.shakevalidate;

import com.mete.yunus.shakevalidate.component.ValidationEditText.Validator;

public class SifreValidator implements Validator{

	@Override
	public boolean validate(String s) {
		// TODO Auto-generated method stub
		if (!(s.matches("((?=.*[a-z])(?=.*d)(?=.*[*?_-])(?=.*[A-Z]).{6,18})"))) {
			return false;
		}
		return true;
	}

}
