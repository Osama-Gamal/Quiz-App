package com.english;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.util.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import android.app.Activity;
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Timer;
import java.util.TimerTask;
import android.media.MediaPlayer;
import android.animation.ObjectAnimator;
import android.content.SharedPreferences;
import android.content.Intent;
import android.view.View;
import android.animation.Animator;

import com.english.questions.unit1;


public class ChemistryActivity extends unit1 {

	private Timer _timer = new Timer();

	public  int num1 = 0;
	public double tim = 0;
	public double total_question = 0;
	public double total_true = 0;
	public double total_divide = 0;
	public double total_finish = 0;
	public double falsee = 0;
	public double checkvalue = 0;
	public Animation animMove,animSlideDown,animLeft;
	public ArrayList<String> rev = new ArrayList<>();
	public LinearLayout linear7,linear6,linear11,linear12,linear2,linear9,linear4,linear10,linear5;
	public ImageView imageview1,fiftyquestions,freeze;
	public Button button1,button3,button4,button2;
	public LinearLayout linear15,linear14,linear13;
	public TextView textview3,textview4,textview5,textview6,textview2,textview1;

	public TimerTask t;
	public ObjectAnimator sho = new ObjectAnimator();
	public TimerTask count;
	public SharedPreferences total;
	public Intent go = new Intent();
	public MediaPlayer click,fifty,congr,freez,wron,pla;
	public ObjectAnimator sno = new ObjectAnimator();
	private int check,k;

	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.chemistry);
		initialize();
		initializeLogic();
	}

	private void initialize() {

		linear7 = findViewById(R.id.linear7);
		linear6 = findViewById(R.id.linear6);
		linear11 = findViewById(R.id.linear11);
		linear12 = findViewById(R.id.linear12);
		linear2 = findViewById(R.id.linear2);
		textview1 = findViewById(R.id.textview1);
		linear9 = findViewById(R.id.linear9);
		linear4 = findViewById(R.id.linear4);
		linear10 = findViewById(R.id.linear10);
		linear5 = findViewById(R.id.linear5);
		button2 = findViewById(R.id.button2);
		button4 = findViewById(R.id.button4);
		imageview1 = findViewById(R.id.imageview1);
		textview2 = findViewById(R.id.textview2);
		button1 = findViewById(R.id.button1);
		button3 = findViewById(R.id.button3);
		linear15 = findViewById(R.id.linear15);
		linear14 = findViewById(R.id.linear14);
		linear13 = findViewById(R.id.linear13);
		textview3 = findViewById(R.id.textview3);
		textview4 = findViewById(R.id.textview4);
		textview5 = findViewById(R.id.textview5);
		textview6 = findViewById(R.id.textview6);
		freeze=findViewById(R.id.freez);
		fiftyquestions=findViewById(R.id.delete2question);
		total = getSharedPreferences("total", Activity.MODE_PRIVATE);



		animSlideDown = AnimationUtils.loadAnimation(getApplicationContext(),
													 R.anim.slide_down);

		animMove = AnimationUtils.loadAnimation(getApplicationContext(),
												R.anim.move);

		animLeft = AnimationUtils.loadAnimation(getApplicationContext(),
												R.anim.left);







		freeze.setOnClickListener(new View.OnClickListener(){
				public void onClick(View v){
					if(freeze.isEnabled()==true){
						freeze.setEnabled(false);
						freeze.setImageResource(R.drawable.snow1);
						count.cancel();
						freez = MediaPlayer.create(getApplicationContext(), R.raw.frozen);
						freez.start();
						imageview1.setVisibility(View.VISIBLE);
						textview2.setVisibility(View.GONE);
						textview2.setText(String.valueOf((long)(tim)));
						sno.setTarget(imageview1);
						sno.setPropertyName("alpha");
						sno.setFloatValues((float)(0), (float)(1));
						sno.setDuration((int)(1500));
						sno.start();
					}
				}});


		fiftyquestions.setOnClickListener(new View.OnClickListener(){
				public void onClick(View v){
					fifty.start();
					fiftyquestions.setEnabled(false);
					fiftyquestions.setImageResource(R.drawable.fiftyxxx);
					del();
				}});


		button2.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					click.start();
					fiftyquestions.setEnabled(false);
					freeze.setEnabled(false);
					_btn2_que1();
				}
			});

		button4.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					click.start();
					fiftyquestions.setEnabled(false);
					freeze.setEnabled(false);
					_btn4_que1();
				}
			});

		button1.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					click.start();
					fiftyquestions.setEnabled(false);
					freeze.setEnabled(false);
					_btn1_que1();
				}
			});

		button3.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					click.start();
					fiftyquestions.setEnabled(false);
					freeze.setEnabled(false);
					_btn3_que1();
				}
			});

		textview4.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					if (total_true == 0) {
						_get();
					}
					else {
						if (total_true == 1) {
							total_true = total_true - 0.5d;
							_get();
						}
						else {
							total_true = total_true - 0.5d;
							_get();
						}
					}
				}
			});

		sho.addListener(new Animator.AnimatorListener() {
				@Override
				public void onAnimationStart(Animator _param1) {

				}

				@Override
				public void onAnimationEnd(Animator _param1) {
					button2.setEnabled(true);
					button1.setEnabled(true);
					button3.setEnabled(true);
					button4.setEnabled(true);
					_timer();
				}

				@Override
				public void onAnimationCancel(Animator _param1) {

				}

				@Override
				public void onAnimationRepeat(Animator _param1) {

				}
			});
	}
	private void initializeLogic() {
		pla = MediaPlayer.create(getApplicationContext(), R.raw.cir);
		wron = MediaPlayer.create(getApplicationContext(), R.raw.wrongcli);
		congr = MediaPlayer.create(getApplicationContext(), R.raw.atada);
		click = MediaPlayer.create(getApplicationContext(), R.raw.cliuck);
		fifty=MediaPlayer.create(getApplicationContext(),R.raw.fifty);
		imageview1.setVisibility(View.GONE);
		total_question = 0;
		total_true = 0;
		if (getIntent().getStringExtra("cha").equals("cha1")) {
			textview3.setText("Unit 1");
			_que1();

		}
		else {
			if (getIntent().getStringExtra("cha").equals("cha2")) {
				textview3.setText("Unit 2");
				_que1();
			}
			else {
				if (getIntent().getStringExtra("cha").equals("cha3")) {
					textview3.setText("Unit 3");
					_que1();
				}
				else {
					if (getIntent().getStringExtra("cha").equals("cha4")) {
						textview3.setText("Unit 4");
						_que1();
					}
					else {
						if (getIntent().getStringExtra("cha").equals("cha5")) {
							textview3.setText("Unut 5");
							_que1();
						}
						else {
							if (getIntent().getStringExtra("cha").equals("all")) {
								textview5.setText("60 /");
								textview3.setText("Revision");
								_que1();
							}
							else {

							}
						}
					}
				}
			}
		}
		_all_false();
	}

	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);

		switch (_requestCode) {

			default:
				break;
		}
	}

	@Override
	public void onBackPressed() {
		
		if (total_true == 0) {
			_get();
		}
		else {
			if (total_true == 1) {
				total_true = total_true - 0.5d;
				_get();
			}
			else {
				total_true = total_true - 0.5d;
				_get();
			}
		}
	}

	@Override
	public void onStop() {
		super.onStop();
		rev.clear();
		total_question = 0;
		if (tim == 30) {

		}
		else {
			count.cancel();
		}
	}



	private void _btn1_que1 () {
		count.cancel();

		button1.setBackgroundResource(R.drawable.wai);
		_all_false();
		t = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
						@Override
						public void run() {

							//_________________________________________


							if(answer1.get(num1).equals(correct.get(num1))){
								button1.setBackgroundResource(R.drawable.truee);
								_true_();
							}
							else {

								button1.setBackgroundResource(R.drawable.red);
								_false_();
							}

						}

					});
			}
		};
		_timer.schedule(t, (int)(3000));
	}
	//_________________________________________

	private void _btn2_que1 () {
		count.cancel();
		button2.setBackgroundResource(R.drawable.wai);
		_all_false();
		t = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
						@Override
						public void run() {



							if(answer2.get(num1).equals(correct.get(num1))){
								button2.setBackgroundResource(R.drawable.truee);
								_true_();
							}
							else {

								button2.setBackgroundResource(R.drawable.red);
								_false_();
							}
						}

					});
			}
		};
		_timer.schedule(t, (int)(3000));
	}
	//_________________________________________

	private void _btn3_que1 () {
		count.cancel();
		button3.setBackgroundResource(R.drawable.wai);
		_all_false();
		t = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
						@Override
						public void run() {



							if(answer3.get(num1).equals(correct.get(num1))){
								button3.setBackgroundResource(R.drawable.truee);
								_true_();
							}

							else {
								button3.setBackgroundResource(R.drawable.red);
								_false_();
							}
						}

					});
			}
		};
		_timer.schedule(t, (int)(3000));
	}
	//_________________________________________

	private void _btn4_que1 () {
		count.cancel();
		button4.setBackgroundResource(R.drawable.wai);
		_all_false();
		t = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
						@Override
						public void run() {



							if(answer4.get(num1).equals(correct.get(num1))){
								button4.setBackgroundResource(R.drawable.truee);
								_true_();
							}

							else {
								button4.setBackgroundResource(R.drawable.red);
								_false_();
							}
						}

					});
			}
		};
		_timer.schedule(t, (int)(3000));
	}
	//_________________________________________

	private void _true_ () {
		pla.start();
		total_true++;
		textview6.setText(String.valueOf((long)(total_true)));
		if (getIntent().getStringExtra("cha").equals("all")) {
			if (total_true == 60) {
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
								@Override
								public void run() {
									congr.start();
									_get();
								}
							});
					}
				};
				_timer.schedule(t, (int)(3000));
			}
			else {
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
								@Override
								public void run() {
									button1.setBackgroundResource(R.drawable.btn);
									button2.setBackgroundResource(R.drawable.btn);
									button3.setBackgroundResource(R.drawable.btn);
									button4.setBackgroundResource(R.drawable.btn);
									_que1();
								}
							});
					}
				};
				_timer.schedule(t, (int)(3000));
			}
		}
		else {
			if (total_true == 30) {
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
								@Override
								public void run() {
									congr.start();
									_get();
								}
							});
					}
				};
				_timer.schedule(t, (int)(3000));
			}
			else {
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
								@Override
								public void run() {
									button1.setBackgroundResource(R.drawable.btn);
									button2.setBackgroundResource(R.drawable.btn);
									button3.setBackgroundResource(R.drawable.btn);
									button4.setBackgroundResource(R.drawable.btn);
									_que1();
								}
							});
					}
				};
				_timer.schedule(t, (int)(3000));
			}
		}
	}


	private void _false_ () {
		wron.start();
		t = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
						@Override
						public void run() {
							_num1_core();
							t = new TimerTask() {
								@Override
								public void run() {
									runOnUiThread(new Runnable() {
											@Override
											public void run() {
												_get();
											}
										});
								}
							};
							_timer.schedule(t, (int)(3000));
						}
					});
			}
		};
		_timer.schedule(t, (int)(3000));
	}


	private void _all_false () {
		button2.setEnabled(false);
		button1.setEnabled(false);
		button3.setEnabled(false);
		button4.setEnabled(false);
	}


	private void _text_show () {
		textview1.startAnimation(animSlideDown);
		button1.startAnimation(animMove);
		button2.startAnimation(animLeft);
		button3.startAnimation(animMove);
		button4.startAnimation(animLeft);

		sho.setTarget(textview1);
		sho.setPropertyName("alpha");
		sho.setFloatValues((float)(0), (float)(1));
		sho.setDuration((int)(1500));
		sho.start();
	}





	private void _timer () {
		tim = 30;
		if ((num1 == 0)) {
			freez = MediaPlayer.create(getApplicationContext(), R.raw.frozen);
			freez.start();
			imageview1.setVisibility(View.VISIBLE);
			textview2.setVisibility(View.GONE);
			textview2.setText(String.valueOf((long)(tim)));
			sno.setTarget(imageview1);
			sno.setPropertyName("alpha");
			sno.setFloatValues((float)(0), (float)(1));
			sno.setDuration((int)(1500));
			sno.start();
		}
		else {
			imageview1.setVisibility(View.GONE);
			textview2.setVisibility(View.VISIBLE);
			count = new TimerTask() {
				@Override
				public void run() {
					runOnUiThread(new Runnable() {
							@Override
							public void run() {
								tim--;
								textview2.setText(String.valueOf((long)(tim)));
								if (tim == 0) {
									_all_false();
									count.cancel();
									_false_();
								}
								else {

								}
							}
						});
				}
			};
			_timer.scheduleAtFixedRate(count, (int)(0), (int)(1000));
		}
	}
	//this is the corrector of questions
	private void _num1_core () {
		if (button1.getText().equals(correct.get(num1))){
			button1.setBackgroundResource(R.drawable.truee);
		}
		else {
			if (button2.getText().equals(correct.get(num1))) {
				button2.setBackgroundResource(R.drawable.truee);
			}
			else {
				if (button3.getText().equals(correct.get(num1))) {
					button3.setBackgroundResource(R.drawable.truee);
				}
				else {
					if (button4.getText().equals(correct.get(num1))) {
						button4.setBackgroundResource(R.drawable.truee);
					}
					else {

					}
				}
			}
		}
	}





	private void _btn1_wrong () {
		button1.setBackgroundResource(R.drawable.red);
		_false_();
	}


	private void _btn2_wrong () {
		button2.setBackgroundResource(R.drawable.red);
		_false_();
	}


	private void _btn3_wrong () {
		button3.setBackgroundResource(R.drawable.red);
		_false_();
	}


	private void _btn4_wrong () {
		button4.setBackgroundResource(R.drawable.red);
		_false_();
	}


	private void _get () {

		total_divide = total_true / 30;
		total_finish = total_divide * 100;
		if (getIntent().getStringExtra("cha").equals("cha1")) {
			if (String.valueOf(total_finish).length() > 3) {
				total.edit().putString("cha1", String.valueOf(total_finish).substring((int)(0), (int)(4))).commit();
				go.setClass(getApplicationContext(), ChapActivity.class);
				startActivity(go);
				finish();
			}
			else {
				total.edit().putString("cha1", String.valueOf((long)(total_finish))).commit();
				go.setClass(getApplicationContext(), ChapActivity.class);
				startActivity(go);
				finish();
			}
			if (total.getString("cha_high1", "").equals("")) {
				total.edit().putString("cha_high1", total.getString("cha1", "")).commit();
			}
			else {
				if (Double.parseDouble(total.getString("cha1", "")) > Double.parseDouble(total.getString("cha_high1", ""))) {
					total.edit().putString("cha_high1", total.getString("cha1", "")).commit();
				}
				else {

				}
			}
		}
		else {
			if (getIntent().getStringExtra("cha").equals("cha2")) {
				if (String.valueOf(total_finish).length() > 3) {
					total.edit().putString("cha2", String.valueOf(total_finish).substring((int)(0), (int)(4))).commit();
					go.setClass(getApplicationContext(), ChapActivity.class);
					startActivity(go);
					finish();
				}
				else {
					total.edit().putString("cha2", String.valueOf((long)(total_finish))).commit();
					go.setClass(getApplicationContext(), ChapActivity.class);
					startActivity(go);
					finish();
				}
				if (total.getString("cha_high2", "").equals("")) {
					total.edit().putString("cha_high2", total.getString("cha2", "")).commit();
				}
				else {
					if (Double.parseDouble(total.getString("cha2", "")) > Double.parseDouble(total.getString("cha_high2", ""))) {
						total.edit().putString("cha_high2", total.getString("cha2", "")).commit();
					}
					else {

					}
				}
			}
			else {
				if (getIntent().getStringExtra("cha").equals("cha3")) {
					if (String.valueOf(total_finish).length() > 3) {
						total.edit().putString("cha3", String.valueOf(total_finish).substring((int)(0), (int)(4))).commit();
						go.setClass(getApplicationContext(), ChapActivity.class);
						startActivity(go);
						finish();
					}
					else {
						total.edit().putString("cha3", String.valueOf((long)(total_finish))).commit();
						go.setClass(getApplicationContext(), ChapActivity.class);
						startActivity(go);
						finish();
					}
					if (total.getString("cha_high3", "").equals("")) {
						total.edit().putString("cha_high3", total.getString("cha3", "")).commit();
					}
					else {
						if (Double.parseDouble(total.getString("cha3", "")) > Double.parseDouble(total.getString("cha_high3", ""))) {
							total.edit().putString("cha_high3", total.getString("cha3", "")).commit();
						}
						else {

						}
					}
				}
				else {
					if (getIntent().getStringExtra("cha").equals("cha4")) {
						if (String.valueOf(total_finish).length() > 3) {
							total.edit().putString("cha4", String.valueOf(total_finish).substring((int)(0), (int)(4))).commit();
							go.setClass(getApplicationContext(), ChapActivity.class);
							startActivity(go);
							finish();
						}
						else {
							total.edit().putString("cha4", String.valueOf((long)(total_finish))).commit();
							go.setClass(getApplicationContext(), ChapActivity.class);
							startActivity(go);
							finish();
						}
						if (total.getString("cha_high4", "").equals("")) {
							total.edit().putString("cha_high4", total.getString("cha4", "")).commit();
						}
						else {
							if (Double.parseDouble(total.getString("cha4", "")) > Double.parseDouble(total.getString("cha_high4", ""))) {
								total.edit().putString("cha_high4", total.getString("cha4", "")).commit();
							}
							else {

							}
						}
					}
					else {
						if (getIntent().getStringExtra("cha").equals("cha5")) {
							if (String.valueOf(total_finish).length() > 3) {
								total.edit().putString("cha5", String.valueOf(total_finish).substring((int)(0), (int)(4))).commit();
								go.setClass(getApplicationContext(), ChapActivity.class);
								startActivity(go);
								finish();
							}
							else {
								total.edit().putString("cha5", String.valueOf((long)(total_finish))).commit();
								go.setClass(getApplicationContext(), ChapActivity.class);
								startActivity(go);
								finish();
							}
							if (total.getString("cha_high5", "").equals("")) {
								total.edit().putString("cha_high5", total.getString("cha5", "")).commit();
							}
							else {
								if (Double.parseDouble(total.getString("cha4", "")) > Double.parseDouble(total.getString("cha_high4", ""))) {
									total.edit().putString("cha_high5", total.getString("cha5", "")).commit();
								}
								else {

								}
							}
						}
						else {
							if (getIntent().getStringExtra("cha").equals("all")) {
								if (String.valueOf(total_finish).length() > 3) {
									total.edit().putString("all", String.valueOf(total_finish).substring((int)(0), (int)(4))).commit();
									go.setClass(getApplicationContext(), ChapActivity.class);
									startActivity(go);
									finish();
								}
								else {
									total.edit().putString("all", String.valueOf((long)(total_finish))).commit();
									go.setClass(getApplicationContext(), ChapActivity.class);
									startActivity(go);
									finish();
								}
								if (total.getString("cha_all", "").equals("")) {
									total.edit().putString("cha_all", total.getString("all", "")).commit();
								}
								else {
									if (Double.parseDouble(total.getString("all", "")) > Double.parseDouble(total.getString("cha_all", ""))) {
										total.edit().putString("cha_all", total.getString("all", "")).commit();
									}
									else {

									}
								}
							}
							else {

							}
						}
					}
				}
			}
		}
	}


	private void _reverse () {
		if (rev.contains(String.valueOf((long)(num1)))) {
			_que1();
		}
		else {
			rev.add(String.valueOf((long)(num1)));
		}
	}



	private void _check_cha () {
		if (getIntent().getStringExtra("cha").equals("cha1")) {
			num1 = Help.getRandom((int)(1), (int)(130));
			textview3.setText("Unit 1");
		}
		else {
			if (getIntent().getStringExtra("cha").equals("cha2")) {
				num1 = Help.getRandom((int)(130), (int)(210));
				textview3.setText("Unit 2");
			}
			else {
				if (getIntent().getStringExtra("cha").equals("cha3")) {
					num1 = Help.getRandom((int)(211), (int)(285));
					textview3.setText("Unit 3");
				}
				else {
					if (getIntent().getStringExtra("cha").equals("cha4")) {
						num1 = Help.getRandom((int)(288), (int)(350));
						textview3.setText("Unit 3");
					}
					else {
						if (getIntent().getStringExtra("cha").equals("cha5")) {

						}
						else {
							if (getIntent().getStringExtra("cha").equals("all")) {
								num1 = Help.getRandom((int)(1), (int)(350));
								textview3.setText("Revision");
							}
							else {

							}
						}
					}
				}
			}
		}
		_all_false();
	}

	private void del(){

		if(k<2){
			check = Help.getRandom((int)(1), (int)(4));

			if(check==1){
				if(correct.get(num1).equals(button1.getText())){
					del();
				}else{
					if(button1.isEnabled()){
						button1.setText("");
						button1.setEnabled(false);
						k++;
						del();
					}else{del();}}}


			if(check==2){
				if(correct.get(num1).equals(button2.getText())){
					del();
				}else{
					if(button2.isEnabled()){
						button2.setText("");
						button2.setEnabled(false);
						k++;
						del();
					}else{del();}}}



			if(check==3){
				if(correct.get(num1).equals(button3.getText())){
					del();
				}else{
					if(button3.isEnabled()){
						button3.setText("");
						button3.setEnabled(false);
						k++;
						del();
					}else{del();}}}



			if(check==4){
				if(correct.get(num1).equals(button4.getText())){
					del();
				}else{
					if(button4.isEnabled()){
						button4.setText("");
						button4.setEnabled(false);
						k++;
						del();
					}else{del();}}}








		}}

	private void _que1 () {

		fiftyquestions.setEnabled(true);
		freeze.setEnabled(true);

		_text_show();
		textview2.setText("30");
		_check_cha();
		question();

		textview1.setText(Questions.get(num1));
		button1.setText(answer1.get(num1));
		button2.setText(answer2.get(num1));
		button3.setText(answer3.get(num1));
		button4.setText(answer4.get(num1));
		_reverse();


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
