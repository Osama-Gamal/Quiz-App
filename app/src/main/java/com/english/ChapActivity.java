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
	

	private Button unit1Btn,unit2Btn,unit3Btn,unit7Btn,unit8Btn,unit9Btn,unit10Btn,unit11Btn,unit12Btn,unit13Btn;
	private Button Button46,Button47,Button48,Button49,Button50,Button51,unit4Btn,unit5Btn,unit6Btn;
	private TextView unit1Txt,unit2Txt,unit3Txt,unit1Txt2,unit2Txt2,unit4Txt2,unit4Txt,unit5Txt2,unit5Txt;
	private TextView unit3Txt2,unit6Txt2,unit6Txt;

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

		unit1Btn = (Button) findViewById(R.id.unit1Btn);
		unit1Txt2 = (TextView) findViewById(R.id.unit1Txt2);
		unit1Txt = (TextView) findViewById(R.id.unit1Txt);
		unit2Btn = (Button) findViewById(R.id.unit2Btn);
		unit2Txt2 = (TextView) findViewById(R.id.unit2Txt2);
		unit2Txt = (TextView) findViewById(R.id.unit2Txt);

		unit3Btn=(Button)findViewById(R.id.unit3Btn);
		unit3Txt=(TextView)findViewById(R.id.unit3Txt);
		unit3Txt2=(TextView)findViewById(R.id.unit3Txt2);

		unit7Btn=(Button)findViewById(R.id.unit7Btn);
		unit8Btn=(Button)findViewById(R.id.unit8Btn);
		unit9Btn=(Button)findViewById(R.id.unit9Btn);
		unit10Btn=(Button)findViewById(R.id.unit10Btn);
		unit11Btn=(Button)findViewById(R.id.unit11Btn);
		unit12Btn=(Button)findViewById(R.id.unit12Btn);
		unit13Btn=(Button)findViewById(R.id.unit13Btn);
		Button46=(Button)findViewById(R.id.Button46);
		Button47=(Button)findViewById(R.id.Button47);
		Button48=(Button)findViewById(R.id.Button48);

		Button49=(Button)findViewById(R.id.Button49);

		Button50=(Button)findViewById(R.id.Button50);

		Button51=(Button)findViewById(R.id.Button51);
		textview1054=(TextView)findViewById(R.id.textview1054);
		textview1055=(TextView)findViewById(R.id.textview1055);

		unit4Btn = (Button) findViewById(R.id.unit4Btn);
		unit4Txt2 = (TextView) findViewById(R.id.unit4Txt2);
		unit4Txt = (TextView) findViewById(R.id.unit4Txt);

		unit5Btn = (Button) findViewById(R.id.unit5Btn);
		unit5Txt2 = (TextView) findViewById(R.id.unit5Txt2);
		unit5Txt = (TextView) findViewById(R.id.unit5Txt);

		unit6Btn = (Button) findViewById(R.id.unit6Btn);
		unit6Txt2 = (TextView) findViewById(R.id.unit6Txt2);
		unit6Txt = (TextView) findViewById(R.id.unit6Txt);
		total = getSharedPreferences("total", Activity.MODE_PRIVATE);

		unit1Btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				clk.start();
				i.setClass(getApplicationContext(), ChemistryActivity.class);
				i.putExtra("cha", "cha1");
				startActivity(i);
				finish();
			}
		});

		unit2Btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				clk.start();
				i.setClass(getApplicationContext(), ChemistryActivity.class);
				i.putExtra("cha", "cha2");
				startActivity(i);
				finish();
			}
		});

		unit3Btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				clk.start();

				i.setClass(getApplicationContext(), ChemistryActivity.class);
				i.putExtra("cha", "cha3");
				startActivity(i);
				finish();
			}
		});

		unit4Btn.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					clk.start();
					i.setClass(getApplicationContext(), ChemistryActivity.class);
					i.putExtra("cha", "cha4");
					startActivity(i);
					finish();
				}});

		unit5Btn.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					clk.start();
					final AlertDialog dialog = new AlertDialog.Builder(ChapActivity.this).create();
					LayoutInflater inflater = getLayoutInflater();

					View convertView = (View) inflater.inflate(R.layout.custom, null);
					dialog.setView(convertView);


					dialog.show();
				}});

		unit6Btn.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					clk.start();
					final AlertDialog dialog = new AlertDialog.Builder(ChapActivity.this).create();
					LayoutInflater inflater = getLayoutInflater();

					View convertView = (View) inflater.inflate(R.layout.custom, null);
					dialog.setView(convertView);



					dialog.show();
				}});

		unit7Btn.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					clk.start();
					final AlertDialog dialog = new AlertDialog.Builder(ChapActivity.this).create();
					LayoutInflater inflater = getLayoutInflater();

					View convertView = (View) inflater.inflate(R.layout.custom, null);
					dialog.setView(convertView);



					dialog.show();
				}});

		unit8Btn.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					clk.start();
					final AlertDialog dialog = new AlertDialog.Builder(ChapActivity.this).create();
					LayoutInflater inflater = getLayoutInflater();

					View convertView = (View) inflater.inflate(R.layout.custom, null);
					dialog.setView(convertView);



					dialog.show();
				}});


		unit9Btn.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					clk.start();
					final AlertDialog dialog = new AlertDialog.Builder(ChapActivity.this).create();
					LayoutInflater inflater = getLayoutInflater();

					View convertView = (View) inflater.inflate(R.layout.custom, null);
					dialog.setView(convertView);



					dialog.show();
				}});

		unit10Btn.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					clk.start();
					final AlertDialog dialog = new AlertDialog.Builder(ChapActivity.this).create();
					LayoutInflater inflater = getLayoutInflater();

					View convertView = (View) inflater.inflate(R.layout.custom, null);
					dialog.setView(convertView);



					dialog.show();
				}});

		unit11Btn.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					clk.start();
					final AlertDialog dialog = new AlertDialog.Builder(ChapActivity.this).create();
					LayoutInflater inflater = getLayoutInflater();

					View convertView = (View) inflater.inflate(R.layout.custom, null);
					dialog.setView(convertView);



					dialog.show();
				}});

		unit12Btn.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					clk.start();
					final AlertDialog dialog = new AlertDialog.Builder(ChapActivity.this).create();
					LayoutInflater inflater = getLayoutInflater();

					View convertView = (View) inflater.inflate(R.layout.custom, null);
					dialog.setView(convertView);


					dialog.show();
				}});

		unit13Btn.setOnClickListener(new View.OnClickListener() {
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
			unit1Txt.setText("%0");
		}
		else {
			unit1Txt.setText("%".concat(total.getString("cha1", "")));
		}
		if (total.getString("cha2", "").equals("")) {
			unit2Txt.setText("%0");
		}
		else {
			unit2Txt.setText("%".concat(total.getString("cha2", "")));
		}
		if (total.getString("cha3", "").equals("")) {
			unit3Txt.setText("%0");
		}
		else {
			unit3Txt.setText("%".concat(total.getString("cha3", "")));
		}
		if (total.getString("cha4", "").equals("")) {
			unit4Txt.setText("%0");
		}
		else {
			unit4Txt.setText("%".concat(total.getString("cha4", "")));
		}
		if (total.getString("cha5", "").equals("")) {
			unit5Txt.setText("%0");
		}
		else {
			unit5Txt.setText("%".concat(total.getString("cha5", "")));
		}
		if (total.getString("all", "").equals("")) {
			textview1054.setText("%0");
		}
		else {
			textview1054.setText("%".concat(total.getString("all", "")));
		}
		if (total.getString("cha6", "").equals("")) {
			unit6Txt.setText("%0");
		}
		else {
			if (total.getString("cha7", "").equals("")) {
				unit5Txt.setText("%0");
			}
			else {
				if (total.getString("cha8", "").equals("")) {
					unit5Txt.setText("%0");
				}
				else {
					if (total.getString("cha9", "").equals("")) {
						unit5Txt.setText("%0");
					}
					else {
						if (total.getString("cha10", "").equals("")) {
							unit5Txt.setText("%0");
						}
						else {
							if (total.getString("cha11", "").equals("")) {
								unit5Txt.setText("%0");
							}
							else {
								if (total.getString("cha12", "").equals("")) {
									unit5Txt.setText("%0");
								}
								else {
									if (total.getString("cha13", "").equals("")) {
										unit5Txt.setText("%0");
									}
									else {
										if (total.getString("cha14", "").equals("")) {
											unit5Txt.setText("%0");
										}
											else{
												if (total.getString("cha15", "").equals("")) {
													unit5Txt.setText("%0");
												}
												else {
													if (total.getString("cha16", "").equals("")) {
														unit5Txt.setText("%0");
													}
													else {
														if (total.getString("cha17", "").equals("")) {
															unit5Txt.setText("%0");
														}
														else {
															if (total.getString("cha18", "").equals("")) {
																unit5Txt.setText("%0");
															}
															else {
																if (total.getString("all", "").equals("")) {
																	unit5Txt.setText("%0");
																}
																else{
																	
														}}}}}}}}}}		}
													}
													}			
													}			
		if (total.getString("cha_high1", "").equals("")) {
			
		}
		else {
			unit1Txt2.setText("%".concat(total.getString("cha_high1", "")));
		}
		if (total.getString("cha_high2", "").equals("")) {
			
		}
		else {
			unit2Txt2.setText("%".concat(total.getString("cha_high2", "")));
		}
		if (total.getString("cha_high3", "").equals("")) {
			
		}
		else {
			unit3Txt2.setText("%".concat(total.getString("cha_high3", "")));
		}
		if (total.getString("cha_high4", "").equals("")) {
			
		}
		else {
			unit4Txt2.setText("%".concat(total.getString("cha_high4", "")));
		}
		if (total.getString("cha_high5", "").equals("")) {
			
		}
		else {
			unit5Txt2.setText("%".concat(total.getString("cha_high5", "")));
		}
		if (total.getString("cha_all", "").equals("")) {
			
		}
		else {
			textview1055.setText("%".concat(total.getString("cha_all", "")));
		}
		if (total.getString("cha_high6", "").equals("")) {

		}
		else {
			unit6Txt2.setText("%".concat(total.getString("cha_high6", "")));
		}
		if (total.getString("cha_high5", "").equals("")) {

		}
		else {
			unit5Txt2.setText("%".concat(total.getString("cha_high5", "")));
		}
		if (total.getString("cha_high5", "").equals("")) {

		}
		else {
			unit5Txt2.setText("%".concat(total.getString("cha_high5", "")));
		}
		if (total.getString("cha_high5", "").equals("")) {

		}
		else {
			unit5Txt2.setText("%".concat(total.getString("cha_high5", "")));
		}
		if (total.getString("cha_high5", "").equals("")) {

		}
		else {
			unit5Txt2.setText("%".concat(total.getString("cha_high5", "")));
		}
		if (total.getString("cha_high5", "").equals("")) {

		}
		else {
			unit5Txt2.setText("%".concat(total.getString("cha_high5", "")));
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
