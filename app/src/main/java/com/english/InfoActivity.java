package com.english;

import android.os.*;
import android.widget.*;
import android.util.*;
import java.util.*;
import android.app.Activity;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class InfoActivity extends Activity {
	

	private TextView textview1;
	private ImageView imageview1;
	private Button button2;
	private Button button3;
	
	private Intent km = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.info);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		

		textview1 = (TextView) findViewById(R.id.textview1);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		button2 = (Button) findViewById(R.id.button2);
		button3 = (Button) findViewById(R.id.button3);
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				km.setData(Uri.parse("https://www.youtube.com/channel/UCX7-KEWpYxeyGFWoCHyallQ"));
				km.setAction(Intent.ACTION_VIEW);
				startActivity(km);
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				km.setAction(Intent.ACTION_VIEW);
				km.setData(Uri.parse("http://api.whatsapp.com/send?phone=+201125156975"));
				startActivity(km);
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				try {
					Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100011950477194"));
				
    startActivity(intent);
}
					catch(Exception e) {
    
					startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/100011950477194")));
}
			}
		});
	}
	private void initializeLogic() {
		textview1.setText("هذا التطبيق لطلبة الثانوية العامة من عام 2020-1441 \n****************************\nتم برمجة التطبيق بواسطة المعيار\nالإصدار 1.1\n****************\nجميع الحقوق محفوظة لصالح المعيار ©\n قم بمتابعة القناة الرسمية للمعيار علي يوتيوب لمتابعة باقي الإصدارات فور صدورها");
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
