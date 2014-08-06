package com.mete.yunus.shakevalidate.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.CycleInterpolator;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class CopyOfValidationEditText extends EditText{
	
	Validator validator;
	
	public interface Validator{
		boolean validate(String s);
	}

	public CopyOfValidationEditText(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		ayarla();
	}
	
    public CopyOfValidationEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        ayarla();
    }
 
    public CopyOfValidationEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        ayarla();
    }

	public void ayarla() {
		// TODO Auto-generated method stub
		setOnEditorActionListener(new OnEditorActionListener() {
			
			@Override
			public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
				// TODO Auto-generated method stub
				if (EditorInfo.IME_ACTION_DONE == actionId) {
					uygunGirisMi();
				}
				return false;
			}
		});
		
		
		
	/*	setOnFocusChangeListener(new OnFocusChangeListener() {
			
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				// TODO Auto-generated method stub
				if (!hasFocus) {
					uygunGirisMi();
				}
			}
		});*/
	}
	
	public boolean uygunGirisMi(){
		boolean uygunMu = validator.validate(getText().toString());
		if (!uygunMu) {
			kullaniciyaIlet();
		}
		
		return uygunMu;
	}

	public void kullaniciyaIlet() {
		// TODO Auto-generated method stub
		//Animation salla = AnimationUtils.loadAnimation(getContext(), R.anim.salla);
		Animation mSalla = new TranslateAnimation(0, 5, 0, 0);
		mSalla.setInterpolator(new CycleInterpolator(5));
		mSalla.setDuration(300);
		
		startAnimation(mSalla);
	}

	public Validator getValidator() {
		return validator;
	}

	public void setValidator(Validator validator) {
		this.validator = validator;
	}
	
	
	

	
}
