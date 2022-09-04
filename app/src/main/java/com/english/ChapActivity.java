package com.english;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Button;
import android.widget.TextView;
import android.content.SharedPreferences;
import android.content.Intent;
import android.net.Uri;
import android.media.MediaPlayer;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;

public class ChapActivity extends Activity {
	

	private Button button33,button34,button35,Button39,Button40,Button41,Button42,Button43,Button44,Button45;
	private TextView textview11;
	private TextView textview1;
	private TextView textview12;
	private TextView textview2;
	private TextView textview3;
	private Button Button46,Button47,Button48,Button49,Button50,Button51,button36;
	private TextView textview14;
	private TextView textview4;
	private Button button37;
	private TextView textview15;
	private TextView textview5;
	private TextView textview300;
	private Button button38;
	private TextView textview21;
	private TextView textview22;
	
	private SharedPreferences total;
	private Intent i = new Intent();
	private MediaPlayer clk;

	private TextView textview1054;

	private TextView textview1055;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.chap);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {

		button33 = (Button) findViewById(R.id.button33);
		textview11 = (TextView) findViewById(R.id.textview11);
		textview1 = (TextView) findViewById(R.id.textview1);
		button34 = (Button) findViewById(R.id.button34);
		textview12 = (TextView) findViewById(R.id.textview12);
		textview2 = (TextView) findViewById(R.id.textview2);

		button35=(Button)findViewById(R.id.button35);
		textview300=(TextView)findViewById(R.id.textview300);
		textview3=(TextView)findViewById(R.id.textview3);
		
		Button39=(Button)findViewById(R.id.Button39);
		Button40=(Button)findViewById(R.id.Button40);
		Button41=(Button)findViewById(R.id.Button41);
		Button42=(Button)findViewById(R.id.Button42);
		Button43=(Button)findViewById(R.id.Button43);
		Button44=(Button)findViewById(R.id.Button44);
		Button45=(Button)findViewById(R.id.Button45);
		Button46=(Button)findViewById(R.id.Button46);
		Button47=(Button)findViewById(R.id.Button47);
		Button48=(Button)findViewById(R.id.Button48);

		Button49=(Button)findViewById(R.id.Button49);

		Button50=(Button)findViewById(R.id.Button50);

		Button51=(Button)findViewById(R.id.Button51);
		textview1054=(TextView)findViewById(R.id.textview1054);
		textview1055=(TextView)findViewById(R.id.textview1055);

		button36 = (Button) findViewById(R.id.button36);
		textview14 = (TextView) findViewById(R.id.textview14);
		textview4 = (TextView) findViewById(R.id.textview4);

		button37 = (Button) findViewById(R.id.button37);
		textview15 = (TextView) findViewById(R.id.textview15);
		textview5 = (TextView) findViewById(R.id.textview5);

		button38 = (Button) findViewById(R.id.button38);
		textview21 = (TextView) findViewById(R.id.textview21);
		textview22 = (TextView) findViewById(R.id.textview22);
		total = getSharedPreferences("total", Activity.MODE_PRIVATE);

		button33.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				clk.start();
				i.setClass(getApplicationContext(), ChemistryActivity.class);
				i.putExtra("cha", "cha1");
				startActivity(i);
				finish();
			}
		});
		
		button34.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				clk.start();
				i.setClass(getApplicationContext(), ChemistryActivity.class);
				i.putExtra("cha", "cha2");
				startActivity(i);
				finish();
			}
		});
		
		button35.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				clk.start();

				i.setClass(getApplicationContext(), ChemistryActivity.class);
				i.putExtra("cha", "cha3");
				startActivity(i);
				finish();
			}
		});
		
		button36.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					clk.start();
					i.setClass(getApplicationContext(), ChemistryActivity.class);
					i.putExtra("cha", "cha4");
					startActivity(i);
					finish();
				}});
		
		button37.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					clk.start();
					final AlertDialog dialog = new AlertDialog.Builder(ChapActivity.this).create();
					LayoutInflater inflater = getLayoutInflater();

					View convertView = (View) inflater.inflate(R.layout.custom, null);
					dialog.setView(convertView);


					dialog.show();
				}});
		
		button38.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					clk.start();
					final AlertDialog dialog = new AlertDialog.Builder(ChapActivity.this).create();
					LayoutInflater inflater = getLayoutInflater();

					View convertView = (View) inflater.inflate(R.layout.custom, null);
					dialog.setView(convertView);



					dialog.show();
				}});
			
		Button39.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					clk.start();
					final AlertDialog dialog = new AlertDialog.Builder(ChapActivity.this).create();
					LayoutInflater inflater = getLayoutInflater();

					View convertView = (View) inflater.inflate(R.layout.custom, null);
					dialog.setView(convertView);



					dialog.show();
				}});
			
		Button40.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					clk.start();
					final AlertDialog dialog = new AlertDialog.Builder(ChapActivity.this).create();
					LayoutInflater inflater = getLayoutInflater();

					View convertView = (View) inflater.inflate(R.layout.custom, null);
					dialog.setView(convertView);



					dialog.show();
				}});
			
			
		Button41.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					clk.start();
					final AlertDialog dialog = new AlertDialog.Builder(ChapActivity.this).create();
					LayoutInflater inflater = getLayoutInflater();

					View convertView = (View) inflater.inflate(R.layout.custom, null);
					dialog.setView(convertView);



					dialog.show();
				}});
			
		Button42.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					clk.start();
					final AlertDialog dialog = new AlertDialog.Builder(ChapActivity.this).create();
					LayoutInflater inflater = getLayoutInflater();

					View convertView = (View) inflater.inflate(R.layout.custom, null);
					dialog.setView(convertView);



					dialog.show();
				}});
			
		Button43.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					clk.start();
					final AlertDialog dialog = new AlertDialog.Builder(ChapActivity.this).create();
					LayoutInflater inflater = getLayoutInflater();

					View convertView = (View) inflater.inflate(R.layout.custom, null);
					dialog.setView(convertView);



					dialog.show();
				}});
			
		Button44.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					clk.start();
					final AlertDialog dialog = new AlertDialog.Builder(ChapActivity.this).create();
					LayoutInflater inflater = getLayoutInflater();

					View convertView = (View) inflater.inflate(R.layout.custom, null);
					dialog.setView(convertView);


					dialog.show();
				}});
			
		Button45.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					clk.start();
					final AlertDialog dialog = new AlertDialog.Builder(ChapActivity.this).create();
					LayoutInflater inflater = getLayoutInflater();

					View convertView = (View) inflater.inflate(R.layout.custom, null);
					dialog.setView(convertView);


					dialog.show();
				}});
			
		Button46.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					clk.start();
					final AlertDialog dialog = new AlertDialog.Builder(ChapActivity.this).create();
					LayoutInflater inflater = getLayoutInflater();

					View convertView = (View) inflater.inflate(R.layout.custom, null);
					dialog.setView(convertView);


					dialog.show();
				}});
			
		Button47.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					clk.start();
					final AlertDialog dialog = new AlertDialog.Builder(ChapActivity.this).create();
					LayoutInflater inflater = getLayoutInflater();

					View convertView = (View) inflater.inflate(R.layout.custom, null);
					dialog.setView(convertView);

					dialog.show();
				}});
			
			
		Button48.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					clk.start();
					final AlertDialog dialog = new AlertDialog.Builder(ChapActivity.this).create();
					LayoutInflater inflater = getLayoutInflater();

					View convertView = (View) inflater.inflate(R.layout.custom, null);
					dialog.setView(convertView);



					dialog.show();
				}});
			
			
		Button49.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					clk.start();
					final AlertDialog dialog = new AlertDialog.Builder(ChapActivity.this).create();
					LayoutInflater inflater = getLayoutInflater();

					View convertView = (View) inflater.inflate(R.layout.custom, null);
					dialog.setView(convertView);


					dialog.show();
				}});
			
		Button50.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					clk.start();
					final AlertDialog dialog = new AlertDialog.Builder(ChapActivity.this).create();
					LayoutInflater inflater = getLayoutInflater();

					View convertView = (View) inflater.inflate(R.layout.custom, null);
					dialog.setView(convertView);

					dialog.show();
				}});
			
		Button51.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					clk.start();
					i.setClass(getApplicationContext(), ChemistryActivity.class);
					i.putExtra("cha", "all");
					startActivity(i);
					finish();
				}
			});
		
			
			
	}
	private void initializeLogic() {
		clk = MediaPlayer.create(getApplicationContext(), R.raw.cliuck);
		if (total.getString("cha1", "").equals("")) {
			textview1.setText("%0");
		}
		else {
			textview1.setText("%".concat(total.getString("cha1", "")));
		}
		if (total.getString("cha2", "").equals("")) {
			textview2.setText("%0");
		}
		else {
			textview2.setText("%".concat(total.getString("cha2", "")));
		}
		if (total.getString("cha3", "").equals("")) {
			textview3.setText("%0");
		}
		else {
			textview3.setText("%".concat(total.getString("cha3", "")));
		}
		if (total.getString("cha4", "").equals("")) {
			textview4.setText("%0");
		}
		else {
			textview4.setText("%".concat(total.getString("cha4", "")));
		}
		if (total.getString("cha5", "").equals("")) {
			textview5.setText("%0");
		}
		else {
			textview5.setText("%".concat(total.getString("cha5", "")));
		}
		if (total.getString("all", "").equals("")) {
			textview1054.setText("%0");
		}
		else {
			textview1054.setText("%".concat(total.getString("all", "")));
		}
		if (total.getString("cha6", "").equals("")) {
			textview22.setText("%0");
		}
		else {
			if (total.getString("cha7", "").equals("")) {
				textview5.setText("%0");
			}
			else {
				if (total.getString("cha8", "").equals("")) {
					textview5.setText("%0");
				}
				else {
					if (total.getString("cha9", "").equals("")) {
						textview5.setText("%0");
					}
					else {
						if (total.getString("cha10", "").equals("")) {
							textview5.setText("%0");
						}
						else {
							if (total.getString("cha11", "").equals("")) {
								textview5.setText("%0");
							}
							else {
								if (total.getString("cha12", "").equals("")) {
									textview5.setText("%0");
								}
								else {
									if (total.getString("cha13", "").equals("")) {
										textview5.setText("%0");
									}
									else {
										if (total.getString("cha14", "").equals("")) {
											textview5.setText("%0");
										}
											else{
												if (total.getString("cha15", "").equals("")) {
													textview5.setText("%0");
												}
												else {
													if (total.getString("cha16", "").equals("")) {
														textview5.setText("%0");
													}
													else {
														if (total.getString("cha17", "").equals("")) {
															textview5.setText("%0");
														}
														else {
															if (total.getString("cha18", "").equals("")) {
																textview5.setText("%0");
															}
															else {
																if (total.getString("all", "").equals("")) {
																	textview5.setText("%0");
																}
																else{
																	
														}}}}}}}}}}		}
													}
													}			
													}			
		if (total.getString("cha_high1", "").equals("")) {
			
		}
		else {
			textview11.setText("%".concat(total.getString("cha_high1", "")));
		}
		if (total.getString("cha_high2", "").equals("")) {
			
		}
		else {
			textview12.setText("%".concat(total.getString("cha_high2", "")));
		}
		if (total.getString("cha_high3", "").equals("")) {
			
		}
		else {
			textview300.setText("%".concat(total.getString("cha_high3", "")));
		}
		if (total.getString("cha_high4", "").equals("")) {
			
		}
		else {
			textview14.setText("%".concat(total.getString("cha_high4", "")));
		}
		if (total.getString("cha_high5", "").equals("")) {
			
		}
		else {
			textview15.setText("%".concat(total.getString("cha_high5", "")));
		}
		if (total.getString("cha_all", "").equals("")) {
			
		}
		else {
			textview1055.setText("%".concat(total.getString("cha_all", "")));
		}
		if (total.getString("cha_high6", "").equals("")) {

		}
		else {
			textview21.setText("%".concat(total.getString("cha_high6", "")));
		}
		if (total.getString("cha_high5", "").equals("")) {

		}
		else {
			textview15.setText("%".concat(total.getString("cha_high5", "")));
		}
		if (total.getString("cha_high5", "").equals("")) {

		}
		else {
			textview15.setText("%".concat(total.getString("cha_high5", "")));
		}
		if (total.getString("cha_high5", "").equals("")) {

		}
		else {
			textview15.setText("%".concat(total.getString("cha_high5", "")));
		}
		if (total.getString("cha_high5", "").equals("")) {

		}
		else {
			textview15.setText("%".concat(total.getString("cha_high5", "")));
		}
		if (total.getString("cha_high5", "").equals("")) {

		}
		else {
			textview15.setText("%".concat(total.getString("cha_high5", "")));
		}
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
