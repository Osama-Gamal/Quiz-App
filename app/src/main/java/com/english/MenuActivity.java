package com.english;

import android.os.*;
import android.widget.*;
import android.util.*;
import java.util.*;
import android.app.Activity;
import java.util.ArrayList;
import android.widget.Button;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.View;
import com.google.android.gms.ads.*;

public class MenuActivity extends Activity {
	
	
	private Button exitBtn;
	private Button infoBtn;
	private Button startBtn;
	
	private Intent i = new Intent();
	private MediaPlayer f;

	private AdView mAdView;

	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.menu);
		
		
		MobileAds.initialize(this,"ca-app-pub-1098526850629886~2336380961");
		mAdView = (AdView) findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().build();
		mAdView.loadAd(adRequest);


		mAdView.setAdListener(new AdListener() {
				@Override
				public void onAdLoaded() {
// Code to be executed when an ad finishes loading.
					Log.i("Ads", "onAdLoaded");
				}
				@Override
				public void onAdFailedToLoad(int errorCode) {
// Code to be executed when an ad request fails.
					Log.i("Ads", "onAdFailedToLoad");
				}
				@Override
				public void onAdOpened() {
// Code to be executed when an ad opens an overlay that
					// covers the screen.
					Log.i("Ads", "onAdOpened");
				}
				@Override
				public void onAdLeftApplication() {
					// Code to be executed when the user has left the app.
					Log.i("Ads", "onAdLeftApplication");
				}
				@Override
				public void onAdClosed() {
// Code to be executed when when the user is about to return
// to the app after tapping on an ad.
					Log.i("Ads", "onAdClosed");
				}
			});
		
		
		initialize();
		initializeLogic();
	}
	
	private void initialize() {

		exitBtn = (Button) findViewById(R.id.exitBtn);
		infoBtn = (Button) findViewById(R.id.infoBtn);
		startBtn = (Button) findViewById(R.id.startBtn);

		exitBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				finish();
			}
		});

		infoBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				f.start();
				i.setClass(getApplicationContext(), InfoActivity.class);
				startActivity(i);
			}
		});

		startBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				f.start();
				i.setClass(getApplicationContext(), ChapActivity.class);
				startActivity(i);
			}
		});
	}
	private void initializeLogic() {
		f = MediaPlayer.create(getApplicationContext(), R.raw.cliuck);
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
