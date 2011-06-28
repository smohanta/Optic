package com.android.fibreoptic;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		final MediaPlayer mpButtonClick = MediaPlayer.create(this, R.raw.buttonsound);
		
		//button search by word
		Button bsearchword = (Button) findViewById(R.id.bsw) ;
		bsearchword.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.android.fibreoptic.TERMS"));
				//startActivity(new Intent("com.android.fibreoptic.LISTOFWORD"));
				
			}
		});
		
		// button search by category
		Button bsearchcat = (Button) findViewById(R.id.bsc);
		bsearchcat.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.android.fibreoptic.LISTOFCATEGORY"));
				mpButtonClick.start();
				
			}
		});
		
		
		//history button
		Button bHistory = (Button) findViewById(R.id.bhistory) ;
		bHistory.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.android.fibreoptic.HISTORY"));
				mpButtonClick.start();
			}
		});
		
		Button bFavorites = (Button) findViewById(R.id.bfav) ;
		bFavorites.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.android.fibreoptic.FAVORITES"));
				mpButtonClick.start();
			}
		});
		
		Button bInfo = (Button) findViewById(R.id.binfo) ;
		bInfo.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.android.fibreoptic.INFO"));
				mpButtonClick.start();
			}
		});
		
					
	}
	

}
