package com.wordflipper.sample;

import com.wordflipper.WordFlipper;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
	WordFlipper mFlipper;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mFlipper = (WordFlipper) findViewById(R.id.word_flipper);
		mFlipper.setWord("Word Flipper");

		findViewById(R.id.show_btn).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				mFlipper.showWord();
			}
		});

		findViewById(R.id.hide_btn).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				mFlipper.hideWord();
			}
		});
	}

}
