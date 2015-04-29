package com.finddreams.graygridView;

import android.app.Activity;
import android.os.Bundle;

import com.github.johnpersano.supertoasts.R;
/**
 * @Description:主页
 * @author http://blog.csdn.net/finddreams
 */ 
public class MainActivity extends Activity{
	private MyGridView gridview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
	}

	private void initView() {
		gridview=(MyGridView) findViewById(R.id.gridview);
		gridview.setAdapter(new MyGridAdapter(this));
		
	}
}
