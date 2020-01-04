/*
	Created by Bomba P&T
		Geveze Engine
		   1.5
*/
//package com.bombapnt.geveze;
import android.app.*;
import android.os.*;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.*;
import android.content.*;
import android.content.Intent;
import android.animation.*;
import android.hardware.*;
import android.graphics.drawable.*;

public class Geveze
{
	private double n;
	public void move(final View _obj, final String _mt, final double _n)
	{
		switch(_mt){
		case "x":
			_obj.setTranslationX((float)(_n));
			break;
		case "y":
			_obj.setTranslationY((float)(_n));
			break;
		case "z":
			_obj.setTranslationZ((float)(_n));
			break;
		case "scaleX":
			_obj.setScaleX((float)(_n));
			break;
		case "scaleY":
			_obj.setScaleY((float)(_n));
			break;
		case "alpha":
			_obj.setAlpha((float)(_n));
			break;
		case "rotation":
			_obj.setRotation((float)(_n));
			break;
		case "rotationX":
			_obj.setRotationX((float)(_n));
			break;
		case "rotationY":
			_obj.setRotationY((float)(_n));
			break;
		}
	}
	public void text_button(final Button _btn, final String _s)
	{
		_btn.setText(_s);
	}
	public void text_textview(final TextView _obj, final String _s)
	{
		_obj.setText(_s);
	}
	public void location(final View _obj, final double _x, final double _y, final double _z, final String _e, final double _st)
	{
		String[] loccom = {"x","y","z","scaleX","scaleY","alpha","rotation","rotationX","rotationY"};
		if (_obj.getTranslationX() == _x && _obj.getTranslationY() == _y && _obj.getTranslationZ() == _z)
		{
			for (String s: loccom)
			{
				if(_e.equals(s))
				{
					move(_obj, s, _st);
					break;
				}
			}
		}
	}
	public void location_big(final View _obj1, final View obj2, final double _x, final double _y, final double _z, final String _e, final double _st)
	{
		String[] loccom = {"x","y","z","scaleX","scaleY","alpha","rotation","rotationX","rotationY"};
		if (_obj1.getTranslationX() == (obj2.getTranslationX()/2)+(_x) && _obj1.getTranslationY() == (obj2.getTranslationY()/2)+(_y) && _obj1.getTranslationZ() == (obj2.getTranslationZ()/2)+(_z))
		{
			for (String s: loccom){
				if (_e.equals(s)){
					move(_obj1, s, _st);
					break;
				}
			}
		}
	}
	public void animation(final View _obj, final String _e, final ObjectAnimator _a, final double _s)
	{
		_a.setTarget(_obj);
		switch(_e){
		case "alpha":
			_a.setPropertyName("alpha");
			_a.setFloatValues((float)(_s));
			_a.start();
			break;
		case "rotationX":
			_a.setPropertyName("rotation");
			_a.setFloatValues((float)(_s));
			_a.start();
			break;
		case "scaleX":
			_a.setPropertyName("scaleX");
			_a.setFloatValues((float)(_s));
			_a.start();
			break;
		case "scaleY":
			_a.setPropertyName("scaleY");
			_a.setFloatValues((float)(_s));
			_a.start();
			break;
		case "moveX":
			_a.setPropertyName("translationX");
			_a.setFloatValues((float)(_s));
			_a.start();
			break;
		case "moveY":
			_a.setPropertyName("translationY");
			_a.setFloatValues((float)(_s));
			_a.start();
			break;
		case "moveZ":
			_a.setPropertyName("translationZ");
			_a.setFloatValues((float)(_s));
			_a.start();
			break;
		case "stop":
			_a.cancel();
			break;
		}
	}
	public void skb_move(final View _obj, final SeekBar _skb, final String _e, final double _n)
	{
		switch(_e){
		case "x":
			_obj.setTranslationX((float)(_skb.getProgress()*_n));
			break;
		case "y":
			_obj.setTranslationY((float)(_skb.getProgress()*_n));
			break;
		case "z":
			_obj.setTranslationZ((float)(_skb.getProgress()*_n));
			break;
		case "scaleX":
			_obj.setScaleX((float)(_skb.getProgress()*_n));
			break;
		case "scaleY":
			_obj.setScaleY((float)(_skb.getProgress()*_n));
			break;
		case "alpha":
			_obj.setAlpha((float)(_skb.getProgress()*_n));
			break;
		case "rotation":
			_obj.setRotation((float)(_skb.getProgress()*_n));
			break;
		case "rotationX":
			_obj.setRotationX((float)(_skb.getProgress()*_n));
			break;
		case "rotationY":
			_obj.setRotationY((float)(_skb.getProgress()*_n));
			break;
		}
	}
	/*
	final Integer[] name = 
	{
		R.drawable.android,
	}
	*/
	public void senario(final View _obj, final Drawable[] _s, final int _n)
	{
		_obj.setBackground(_s[_n]);
	}
	public class cheatn
	{
		String[] events = {
			"translationX",
			"translationY",
			"translationZ",
			"scaleX",
			"scaleY",
			"alpha",
			"rotation",
			"rotationX",
			"rotationY"
		};
		public void button(final Button _btn, final String _cheat,final String _equal,final String _event, final double _n)
		{
			if (_cheat.equals(_equal))
			{
				switch (_event)
				{
					case "translationX":
						_btn.setTranslationX((float)(_n));
						break;
					case "translationY":
						_btn.setTranslationY((float)(_n));
						break;
					case "translationZ":
						_btn.setTranslationZ((float)(_n));
						break;
					case "scaleX":
						_btn.setScaleX((float)(_n));
						break;
					case "scaleY":
						_btn.setScaleX((float)(_n));
						break;
					case "rotation":
						_btn.setRotation((float)(_n));
						break;
					case "rotationX":
						_btn.setRotationX((float)(_n));
						break;
					case "rotationY":
						_btn.setRotationY((float)(_n));
						break;
				}
			}
		}
		public void object(final View _obj, final String _cheat,final String _equal,final String _event, final double _n)
		{
			if (_cheat.equals(_equal))
			{
				switch (_event)
				{
					case "translationX":
						_obj.setTranslationX((float)(_n));
						break;
					case "translationY":
						_obj.setTranslationY((float)(_n));
						break;
					case "translationZ":
						_obj.setTranslationZ((float)(_n));
						break;
					case "scaleX":
						_obj.setScaleX((float)(_n));
						break;
					case "scaleY":
						_obj.setScaleX((float)(_n));
						break;
					case "rotation":
						_obj.setRotation((float)(_n));
						break;
					case "rotationX":
						_obj.setRotationX((float)(_n));
						break;
					case "rotationY":
						_obj.setRotationY((float)(_n));
						break;
				}
			}
		}
		public void seekbar(final SeekBar _skb, final String _cheat,final String _equal,final String _event, final double _n)
		{
			if (_cheat.equals(_equal))
			{
				switch (_event)
				{
					case "translationX":
						_skb.setTranslationX((float)(_n));
						break;
					case "translationY":
						_skb.setTranslationY((float)(_n));
						break;
					case "translationZ":
						_skb.setTranslationZ((float)(_n));
						break;
					case "scaleX":
						_skb.setScaleX((float)(_n));
						break;
					case "scaleY":
						_skb.setScaleX((float)(_n));
						break;
					case "rotation":
						_skb.setRotation((float)(_n));
						break;
					case "rotationX":
						_skb.setRotationX((float)(_n));
						break;
					case "rotationY":
						_skb.setRotationY((float)(_n));
						break;
				}
			}
		}
		public void text_view(final TextView _tv, final String _cheat,final String _equal,final String _event, final double _n)
		{
			if (_cheat.equals(_equal))
			{
				switch (_event)
				{
					case "translationX":
						_tv.setTranslationX((float)(_n));
						break;
					case "translationY":
						_tv.setTranslationY((float)(_n));
						break;
					case "translationZ":
						_tv.setTranslationZ((float)(_n));
						break;
					case "scaleX":
						_tv.setScaleX((float)(_n));
						break;
					case "scaleY":
						_tv.setScaleX((float)(_n));
						break;
					case "rotation":
						_tv.setRotation((float)(_n));
						break;
					case "rotationX":
						_tv.setRotationX((float)(_n));
						break;
					case "rotationY":
						_tv.setRotationY((float)(_n));
						break;
				}
			}
		}
		public void none(final String _cheat,final String _equal,final String _event, final double _n)
		{
			if (_cheat.equals(_equal))
			{
				//to be contiune ;P
			}
		}
	}
}
